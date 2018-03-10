package classes;

import classes.instrument_enums.GuitarType;
import classes.instrument_enums.PianoType;
import enums.InstrumentType;
import interfaces.Sellable;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {

    private ArrayList<Sellable> stock;
    private Shop shop;
    private Guitar guitar1;
    private Guitar guitar2;
    private Piano piano1;
    private Piano piano2;

    @Before
    public void setUp() {
        guitar1 = new Guitar("Gibson", "ES-339 Studio", 1200.00, 1519.00, InstrumentType.GUITAR, GuitarType.ELECTRIC, 6, "Ginger Burst");
        guitar2 = new Guitar("Taylor", "618e ES2", 3000.00, 3249.00, InstrumentType.GUITAR, GuitarType.ACOUSTIC, 6, "Natural sitka");
        piano1 = new Piano("Yamaha", "C3X Grand Piano", 22000.00, 25270.00, InstrumentType.PIANO, PianoType.ACOUSTIC, 88, "Polished Ebony");
        piano2 = new Piano("Nord", "Stage 3 88", 30000.00, 3459.00, InstrumentType.PIANO, PianoType.ELECTRIC, 88, "Candy Apple Red");
        stock = new ArrayList<>();
        shop = new Shop("Wee Al's Trumpet Emporium", stock);
    }

    @Test
    public void canGetName() {
        assertEquals("Wee Al's Trumpet Emporium", shop.getName());
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
