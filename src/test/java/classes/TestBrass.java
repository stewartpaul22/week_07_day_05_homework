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
}
