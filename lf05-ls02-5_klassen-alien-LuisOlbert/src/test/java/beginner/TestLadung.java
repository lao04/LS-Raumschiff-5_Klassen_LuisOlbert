package beginner;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

public class TestLadung extends TestBase {

    @Test
    void ladungsverzeichnisAusgeben(){

        int max = (int) (5+Math.random()*20);
        //prepare
        Raumschiff r = getRaumschiff();
        addLadung(r, max);

        r.ladungsverzeichnisAusgeben();

        // assertion
        for (int i=0;i<max;i++){
            checkConsole("lad"+i);
            checkConsole(String.valueOf(100+i));
        }

    }

    @Test
    void addLadung(){

        int max = (int) (5+Math.random()*20);
        //prepare
        Raumschiff r = getRaumschiff();
        addLadung(r, max);

    }

    /**
     * Add Ladung to this raumschiff
     * @param r, raumschiff
     * @param count
     */
    public static void addLadung(Raumschiff r, int count){
        for (int i=0;i<count;i++){
            r.addLadung(new Ladung("lad"+i,100+i));
        }
    }
}
