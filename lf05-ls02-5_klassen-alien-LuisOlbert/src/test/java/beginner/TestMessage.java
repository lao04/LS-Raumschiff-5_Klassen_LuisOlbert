package beginner;

import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

public class TestMessage extends TestBase {

    @Test
    void message(){

        //prepare
        Raumschiff r = getRaumschiff();
        r.nachrichtAnAlle("testtesttest");

        // assertion
        checkBroadcast("testtesttest");
    }
}
