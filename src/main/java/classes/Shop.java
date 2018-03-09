package classes;

import interfaces.Sellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name, ArrayList<Sellable> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addProductToStock(Sellable product) {
        this.stock.add(product);
    }
}
