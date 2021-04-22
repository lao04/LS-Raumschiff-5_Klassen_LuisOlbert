package beginner;

import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTreffer extends TestBase {

    @Test
    void trefferShield(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();
        r2.setSchiffsname("TestTestTest");

        r.phaserkanoneSchiessen(r2);

        if (isBeginner())
            checkBroadcast("TestTestTest wurde getroffen!");
        else {
            checkNotBroadcast("Alle Lebenserhaltssysteme abgeschaltet.");
            assertEquals(50,r2.getSchildeInProzent());
        }
    }

    @Test
    void trefferSystem(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();
        r2.setSchiffsname("TestTestTest");
        r2.setSchildeInProzent(40);

        r.phaserkanoneSchiessen(r2);

        if (isBeginner())
            checkBroadcast("TestTestTest wurde getroffen!");
        else {
            checkNotBroadcast("Alle Lebenserhaltssysteme abgeschaltet.");
            assertEquals(50,r2.getHuelleInProzent());
            assertEquals(50,r2.getEnergieversorgungInProzent());
        }
    }

    @Test
    void treffer(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();
        r2.setSchiffsname("TestTestTest");
        r2.setSchildeInProzent(20);
        r2.setHuelleInProzent(20);
        r2.setEnergieversorgungInProzent(20);

        r.phaserkanoneSchiessen(r2);

        if (isBeginner())
            checkBroadcast("TestTestTest wurde getroffen!");
        else
            checkBroadcast("Alle Lebenserhaltssysteme abgeschaltet.");
    }
}
