package classes;

import enums.AccessoryType;
import interfaces.Sellable;

public abstract class Accessory extends Product implements Sellable {

    private AccessoryType accessoryType;

    public Accessory(String manufacturer, String model, double purchasePrice, double sellPrice, AccessoryType accessoryType) {
        super(manufacturer, model, purchasePrice, sellPrice);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }
}
