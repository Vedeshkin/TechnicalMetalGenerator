import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by vedeshkin on 14.06.2016.
 */
public class TimeSignature {
    private int numerator;
    private int denumerator;
    private String timeSignature;
    private static Random rand;//should be one for all object?
    private static Logger tsLogger;
    private static int[] denominators = {2,4,8,16,32};
    public TimeSignature()//generate new timeSignature object
    {
        rand = new Random();
        tsLogger = Logger.getLogger(TimeSignature.class.getName());

    }
    public TimeSignature(int numerator, int denumerator)//Construct timeSignature object with given parameters.
    {
        tsLogger = Logger.getLogger(TimeSignature.class.getName());
        if(numerator == 0)
        {
            throw new IllegalArgumentException("Numerator cannot be zero");
        }
        if (denumerator == 0)
        {
            throw new IllegalArgumentException("Denumerator cannot be zero");
        }


        this.numerator = numerator;
        this.denumerator = denumerator;
        this.timeSignature = numerator +"\\" + denumerator;
        tsLogger.info(String.format("New timeSignature is constructed : %s ", timeSignature));
    }
    public void generate()
    {
        denumerator = rand.nextInt(denominators.length-1);
        numerator = rand.nextInt(32)+1;
        timeSignature = numerator + "/" + denominators[denumerator];
        tsLogger.info(String.format("New timeSignature is constructed : %s ", timeSignature));;


    }
    @Override
    public String toString()
    {
        return timeSignature;
    }
}
