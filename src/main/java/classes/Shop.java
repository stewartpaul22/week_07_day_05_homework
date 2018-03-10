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

    public void sellProduct(Sellable product) {
        this.stock.remove(product);
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public double getTotalPotentialProfit() {
        double total = 0;
        for (Sellable product : stock) {
            total += product.calculateMarkup();
        }
        return total;
    }
}
