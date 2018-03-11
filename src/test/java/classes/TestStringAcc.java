package classes;

import classes.accessory_enums.StringType;
import enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringAcc {

    private StringAcc guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new StringAcc("Ernie Ball", "Regular Slinky", 3.00, 6.99, AccessoryType.STRING, StringType.GUITAR, "10-46");
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Ernie Ball", guitarStrings.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Regular Slinky", guitarStrings.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(3.00, guitarStrings.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(6.99, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals(AccessoryType.STRING, guitarStrings.getAccessoryType());
    }

    @Test
    public void canGetStringType() {
        assertEquals(StringType.GUITAR, guitarStrings.getStringType());
    }

    @Test
    public void canGetStringGauge() {
        assertEquals("10-46", guitarStrings.getGauge());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(3.99, guitarStrings.calculateMarkup(), 0.01);
    }
}
