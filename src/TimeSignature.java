import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by vedeshkin on 14.06.2016.
 */
public class TimeSignature {
    private int numerator;
    private int denumerator;
    private String TimeSignature;
    private static Random rand;//should be one for all object?
    private static Logger tsLogger;
    public TimeSignature()//generate new TimeSignature object
    {
        rand = new Random();
        tsLogger = Logger.getLogger(TimeSignature.class.getName());

    }
    public TimeSignature(int numerator, int denumerator)//Construct TimeSignature object with given parameters.
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
        if (numerator >= denumerator)
        {
            throw new IllegalArgumentException(String.format("Numerator %d is greater than denumerator %d ",numerator,denumerator));
        }

        this.numerator = numerator;
        this.denumerator = denumerator;
        this.TimeSignature = numerator +"\\" + denumerator;
        tsLogger.info(String.format("New TimeSignature is constructed : %s ", TimeSignature));
    }
    @Override
    public String toString()
    {
        return TimeSignature;
    }
}
