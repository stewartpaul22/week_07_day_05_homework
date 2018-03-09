package classes;

import interfaces.Sellable;
import org.junit.Before;

import java.util.ArrayList;

public class TestShop {

    ArrayList<Sellable> stock;
    Shop shop;

    @Before
    public void setUp() {
        stock = new ArrayList<>();
        shop = new Shop(stock);
    }
}
