package classes;

import interfaces.Sellable;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Sellable> stock;

    public Shop(ArrayList<Sellable> stock) {
        this.stock = stock;
    }
}
