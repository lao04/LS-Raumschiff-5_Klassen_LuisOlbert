package beginner;

import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

public class TestZustand extends TestBase {

    @Test
    void zustandRaumschiff(){

        //prepare
        Raumschiff r = new Raumschiff(101, 100, 99, 98, 97, 96, "testZustand");

        r.zustandRaumschiff();

        // assertion
        for (int i=96;i<102;i++){
            checkConsole(String.valueOf(i));
        }
        checkConsole("testZustand");
    }
}
