package beginner;

import Raumschiffe.Ladung;
import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestGetterSetter {

    @Test
    void raumSchiffGetterSetter(){
        Raumschiff r = new Raumschiff();
        r.setSchiffsname("getter");
        r.setLebenserhaltungssystemeInProzent(80);
        r.setEnergieversorgungInProzent(70);
        r.setSchildeInProzent(60);
        r.setHuelleInProzent(50);
        r.setAndroidenAnzahl(5);
        r.setPhotonentorpedoAnzahl(8);

        assertEquals("getter",r.getSchiffsname());
        assertEquals(80,r.getLebenserhaltungssystemeInProzent());
        assertEquals(70,r.getEnergieversorgungInProzent());
        assertEquals(60,r.getSchildeInProzent());
        assertEquals(50,r.getHuelleInProzent());
        assertEquals(5,r.getAndroidenAnzahl());
        assertEquals(8,r.getPhotonentorpedoAnzahl());
    }

    @Test
    void ladungGetterSetter(){
        Ladung l = new Ladung();
        l.setBezeichnung("getter");
        l.setMenge(12);

        assertEquals("getter",l.getBezeichnung());
        assertEquals(12,l.getMenge());
    }
}
