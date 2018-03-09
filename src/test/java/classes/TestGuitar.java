package classes;

import classes.instrument_enums.GuitarType;
import enums.InstrumentType;
import org.junit.Before;

public class TestGuitar {

    Guitar guitar1;

    @Before
    public void setUp() {
        guitar1 = new Guitar("Gibson", "ES-339 Studio Ginger Burst (2016)", 1200.00, 1519.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6);
    }


}
