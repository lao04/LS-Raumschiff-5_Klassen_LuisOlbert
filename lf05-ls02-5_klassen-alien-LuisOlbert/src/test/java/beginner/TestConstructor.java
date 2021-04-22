package beginner;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestConstructor extends TestBase {

    @Test
    void raumSchiff(){
        Raumschiff r = getRaumschiff();

        assertNotNull(r);
    }

    @Test
    void ladung(){
        Ladung l = new Ladung("ABCD",3);

        assertNotNull(l);
    }
}
