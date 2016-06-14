import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by vedeshkin on 14.05.2016.
 */
public class MusicGenerator {
    private int tempo;
    private String note;
    private String TimeSignature;
    private String scale;
    private Random random = new Random();
    private String [] notes =  {"C","C#", "D","D#", "E", "F" ,"F#", "G","G#", "A", "A#", "B"};
    private int [] denominator = {2,4,8,16,32,64};
    private ArrayList<String>  scales;

    MusicGenerator() {
        this.tempo = 0;
        try
        {
            scales = (ArrayList<String>) Files.readAllLines(Paths.get("Scales.txt"));
        }catch (IOException ex){

        }
        generate();

    }
    private void generate()
    {
        scale = scales.get(randInt(0,scales.size() -1,random));
        tempo = randInt(50,255,this.random);
        TimeSignature = randInt(1,32,this.random)+"/"+denominator[randInt(0,denominator.length-1,random)];
        note = notes[randInt(0,notes.length-1,this.random)];
    }

    public String getScale()
    {

        return scale;
    }

    private static int randInt(int min, int max,Random rand) {

        int randomNum = rand.nextInt((max - min)+1) + min;

        return randomNum;
    }
    public int getTempo (){
        return tempo;
    }
    public String getNote(){

        return note;

    }
    public String getTimeSignature(){

        return TimeSignature;
    }
    @Override
    public String toString()
    {
        return String.format("Scale:%s,Temp:%d,Time:%s,Note:%s",scale,tempo,TimeSignature,note);
    }
}
