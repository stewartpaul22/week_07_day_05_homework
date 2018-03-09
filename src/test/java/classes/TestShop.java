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
    Guitar guitar2;

    @Before
    public void setUp() {
        guitar1 = new Guitar("Gibson", "ES-339 Studio Ginger Burst (2016)", 1200.00, 1519.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6);
        guitar2 = new Guitar("Taylor", "618e ES2", 3000.00, 3249.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6);
        stock = new ArrayList<>();
        shop = new Shop("Jeff's Gear", stock);
    }

    @Test
    public void canGetName() {
        assertEquals("Jeff's Gear", shop.getName());
    }

    @Test
    public void canAddProductToStock() {
        shop.addProductToStock(guitar1);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetStockList() {
        shop.addProductToStock(guitar1);
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canSellProduct() {
        shop.addProductToStock(guitar1);
        shop.sellProduct(guitar1);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addProductToStock(guitar1);
        shop.addProductToStock(guitar2);
        assertEquals(568, shop.getTotalPotentialProfit(), 0.01);
    }
}
