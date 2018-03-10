package classes;

import classes.instrument_enums.BrassType;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBrass {

    private Brass trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Brass("Yamaha", "YTR6610S Eb D", 1800.00, 1945.00, InstrumentType.BRASS, BrassType.TRUMPET, "Silver");
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Yamaha", trumpet.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("YTR6610S Eb D", trumpet.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(1800, trumpet.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1945.00, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void canGetBrassType() {
        assertEquals(BrassType.TRUMPET, trumpet.getBrassType());
    }

    @Test
    public void canGetFinish() {
        assertEquals("Silver", trumpet.getFinish());
    }

    @Test
    public void canPlay() {
        assertEquals("dhuuu dhuuu", trumpet.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(145, trumpet.calculateMarkup(), 0.01);
    }
}
