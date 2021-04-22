package beginner;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestConstructorEmpty {

    @Test
    void raumSchiffEmpty(){
        Raumschiff r = new Raumschiff();

        assertNotNull(r);
    }

    @Test
    void ladungEmpty(){
        Ladung l = new Ladung();

        assertNotNull(l);
    }
}
