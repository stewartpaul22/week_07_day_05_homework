package classes;

public abstract class Product {

    private String manufacturer;
    private String model;
    private double purchasePrice;
    private double sellPrice;

    public Product(String manufacturer, String model, double purchasePrice, double sellPrice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
