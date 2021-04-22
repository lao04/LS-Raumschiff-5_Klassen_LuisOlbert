package expert;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestELadung extends TestBase {

    @Test
    void ladungsverzeichnisAufraeumenCanRemove(){

        //prepare
        Raumschiff r = getRaumschiff();
        r.addLadung(new Ladung("ABCD",0));

        r.ladungsverzeichnisAusgeben();

        // assertion
        checkConsoleNot("ABCD"); //ladung not exist?
    }

    @Test
    void ladungsverzeichnisAufraeumenNotRemoved(){
        fail("test ladungsverzeichnisAufraeumenNotRemoved is not implemented");
    }
}
