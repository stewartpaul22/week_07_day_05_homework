package classes;

import classes.accessory_enums.StringType;
import enums.AccessoryType;

public class StringAcc extends Accessory {

    private StringType stringType;
    private String gauge;

    public StringAcc(String manufacturer, String model, double purchasePrice, double sellPrice, AccessoryType accessoryType, StringType stringType, String gauge) {
        super(manufacturer, model, purchasePrice, sellPrice, accessoryType);
        this.stringType = stringType;
        this.gauge = gauge;
    }

    public StringType getStringType() {
        return stringType;
    }

    public String getGauge() {
        return gauge;
    }


    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
