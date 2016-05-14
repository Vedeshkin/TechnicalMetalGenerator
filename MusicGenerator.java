import java.util.Random;

/**
 * Created by vedeshkin on 14.05.2016.
 */
public class MusicGenerator {
    private int tempo;
    private String note;
    private Random random = new Random();
    private String [] notes =  {"C","C#", "D","D#", "E", "F" ,"F#", "G","G#", "A", "A#", "B"};

    MusicGenerator() {
        this.tempo = 0;
    }

    private static int randInt(int min, int max,Random rand) {

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    public int getTempo (){
        tempo = randInt(50,255,this.random);
        return tempo;
    }
    public String getNote(){
        note = notes[randInt(0,notes.length,this.random)];
        return note;

    }
}
