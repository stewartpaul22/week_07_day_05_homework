package classes;

import classes.accessory_enums.CableType;
import enums.AccessoryType;

public class Cable extends Accessory {

    private CableType cableType;
    private int length;

    public Cable(String manufacturer, String model, double purchasePrice, double sellPrice, AccessoryType accessoryType, CableType cableType, int length) {
        super(manufacturer, model, purchasePrice, sellPrice, accessoryType);
        this.cableType = cableType;
        this.length = length;
    }

    public CableType getCableType() {
        return cableType;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
