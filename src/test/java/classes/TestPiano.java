package classes;

import classes.instrument_enums.PianoType;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    private Piano piano1;

    @Before
    public void setUp() {
        piano1 = new Piano("Yamaha", "C3X Grand Piano", 22000.00, 25270.00, InstrumentType.PIANO, PianoType.ACOUSTIC, 88, "Polished Ebony");
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Yamaha", piano1.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("C3X Grand Piano", piano1.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(22000.00, piano1.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(25270.00, piano1.getSellPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.PIANO, piano1.getInstrumentType());
    }

    @Test
    public void canGetPianoType() {
        assertEquals(PianoType.ACOUSTIC, piano1.getPianoType());
    }

    @Test
    public void canGetKeyNumber() {
        assertEquals(88, piano1.getKeyNumber());
    }

    @Test
    public void canGetColour() {
        assertEquals("Polished Ebony", piano1.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plink plink", piano1.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(3270.00, piano1.calculateMarkup(), 0.01);
    }
}
