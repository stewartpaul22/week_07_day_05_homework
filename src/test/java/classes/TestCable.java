package classes;

import classes.accessory_enums.CableType;
import enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCable {

    private Cable cable;

    @Before
    public void setUp() {
        cable = new Cable("Fender", "Custom Shop Angled Tweed", 8.00, 15.99, AccessoryType.CABLE, CableType.GUITAR, 3);
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Fender", cable.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Custom Shop Angled Tweed", cable.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(8.00, cable.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(15.99, cable.getSellPrice(), 0.01);
    }

    @Test
    public void canGetAccessoryType() {
        assertEquals(AccessoryType.CABLE, cable.getAccessoryType());
    }

    @Test
    public void canGetCableType() {
        assertEquals(CableType.GUITAR, cable.getCableType());
    }

    @Test
    public void canGetCableLength() {
        assertEquals(3, cable.getLength());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(7.99, cable.calculateMarkup(), 0.01);
    }
}
