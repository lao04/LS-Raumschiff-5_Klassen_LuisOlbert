package expert;

import Raumschiffe.Raumschiff;
import base.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLogBuch extends TestBase {

    @Test
    void logBuch(){

        assertNotNull(Raumschiff.eintraegeLogbuchZurueckgeben());
    }

}
