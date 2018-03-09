package classes;

import classes.instrument_enums.GuitarType;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar1;

    @Before
    public void setUp() {
        guitar1 = new Guitar("Gibson", "ES-339 Studio Ginger Burst (2016)", 1200.00, 1519.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6);
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Gibson", guitar1.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("ES-339 Studio Ginger Burst (2016)", guitar1.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(1200.00, guitar1.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1519.00, guitar1.getSellPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.GUITAR, guitar1.getInstrumentType());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar1.getGuitarType());
    }

    @Test
    public void canGetStringNumber() {
        assertEquals(6, guitar1.getStringNumber());
    }

    @Test
    public void canPlay() {
        assertEquals("brrrnnnnggg!!!", guitar1.play());
    }
}
