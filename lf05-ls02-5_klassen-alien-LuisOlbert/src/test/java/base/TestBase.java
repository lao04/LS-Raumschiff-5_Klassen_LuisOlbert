package base;

import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class TestBase {

    protected static final String CLICK = "-=*Click*=-";

    // backup System.out to restore it later
    protected PrintStream originalOut;
    protected ByteArrayOutputStream bos;

    @BeforeEach
    public void InitPrintStream(){
        Locale.setDefault(Locale.GERMANY);
        //bind the system
        originalOut = System.out;
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        if (!isBeginner()){
            Raumschiff.eintraegeLogbuchZurueckgeben().clear();
        }
    }

    @AfterEach
    public void EndPrintStream(){
        // undo the binding in System
        System.setOut(originalOut);
    }

    protected boolean isBeginner() {
        return Raumschiff.eintraegeLogbuchZurueckgeben() == null;
    }

    /**
     * Helpermethod to check outputs on console
     * @param check, string to check
     */
    protected void checkConsole(String check) {
        try {
            assertTrue(bos.toString().contains(check));
        } catch (Throwable t) {
            //print exact program
            assertEquals(check,bos.toString());
        }
    }

    /**
     * Helpermethod to check outputs on console
     * @param check, string to check
     */
    protected void checkConsoleNot(String check) {
        try {
            assertFalse(bos.toString().contains(check));
        } catch (Throwable t) {
            //print exact program
            assertEquals(check,bos.toString());
        }
    }

    /**
     * Helpermethod to check outputs in broadcaster or console
     * @param check, string to check
     */
    protected void checkBroadcast(String check){
        ArrayList<String> mess = Raumschiff.eintraegeLogbuchZurueckgeben();

        if (isBeginner()){
            checkConsole(check);
            return;
        }

        for (String m: mess) {
            if (m.contains(check)){
                return;
            }
        }

        fail("Data "+check+" not exist in the broadcastKommunikator.");
    }

    /**
     * Helpermethod to check outputs in broadcaster or console
     * @param check, string to check
     */
    protected void checkNotBroadcast(String check){
        ArrayList<String> mess = Raumschiff.eintraegeLogbuchZurueckgeben();

        if (isBeginner()){
            checkConsole(check);
            return;
        }

        for (String m: mess) {
            if (m.contains(check)){
                fail("Data "+check+" not exist in the broadcastKommunikator.");
            }
        }
    }

    protected Raumschiff getRaumschiff(){
        return new Raumschiff(2, 100, 100, 100, 100, 2, "TestTest");
    }
}
