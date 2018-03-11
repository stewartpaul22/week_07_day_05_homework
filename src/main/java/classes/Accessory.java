package classes;

import enums.AccessoryType;
import interfaces.Sellable;

public class Accessory extends Product implements Sellable {

    private AccessoryType accessoryType;

    public Accessory(String manufacturer, String model, double purchasePrice, double sellPrice, AccessoryType accessoryType) {
        super(manufacturer, model, purchasePrice, sellPrice);
        this.accessoryType = accessoryType;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
