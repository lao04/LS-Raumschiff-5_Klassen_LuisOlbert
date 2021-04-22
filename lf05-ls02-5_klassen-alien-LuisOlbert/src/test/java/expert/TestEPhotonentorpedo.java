package expert;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import base.TestBase;
import beginner.TestLadung;
import org.junit.jupiter.api.Test;

public class TestEPhotonentorpedo extends TestBase {

    private Raumschiff getRaumschiff(int anzahlTorpedos){
        //prepare
        Raumschiff r = getRaumschiff();

        TestLadung.addLadung(r, (int) (Math.random()*20)); //dummy ladung
        r.addLadung(new Ladung("Photonentorpedos",anzahlTorpedos));
        TestLadung.addLadung(r, (int) (Math.random()*20)); //dummy ladung

        return r;
    }

    @Test
    void photonentorpedosEinsetzenEmpty(){

        //prepare
        Raumschiff r = getRaumschiff();
        r.photonentorpedosEinsetzen(2);

        // assertion
        checkBroadcast(CLICK);
    }

    @Test
    void photonentorpedosEinsetzenOne(){

        //prepare
        Raumschiff r = getRaumschiff(1);
        r.photonentorpedosEinsetzen(2);

        // assertion
        checkConsole("1 Photonentorpedo(s) eingesetzt");
    }

    @Test
    void photonentorpedosEinsetzenTwo(){

        //prepare
        Raumschiff r = getRaumschiff(2);
        r.photonentorpedosEinsetzen(1);

        // assertion
        checkConsole("1 Photonentorpedo(s) eingesetzt");
    }
}
