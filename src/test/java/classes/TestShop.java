package classes;

import classes.instrument_enums.GuitarType;
import enums.InstrumentType;
import interfaces.Sellable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {

    ArrayList<Sellable> stock;
    Shop shop;
    Guitar guitar1;

    @Before
    public void setUp() {
        guitar1 = new Guitar("Gibson", "ES-339 Studio Ginger Burst (2016)", 1200.00, 1519.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6);
        stock = new ArrayList<>();
        shop = new Shop("Jeff's Gear", stock);
    }

    @Test
    public void canGetName() {
        assertEquals("Jeff's Gear", shop.getName());
    }

    @Test
    public void canGetStockList() {
        shop.addProductToStock(guitar1);
        assertEquals(stock, shop.getStock());
    }
}
