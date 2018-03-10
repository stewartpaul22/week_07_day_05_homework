package classes;

import classes.instrument_enums.GuitarType;
import enums.InstrumentType;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int stringNumber;
    private String colour;

    public Guitar(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType, GuitarType guitarType, int stringNumber, String colour) {
        super(manufacturer, model, purchasePrice, sellPrice, instrumentType);
        this.guitarType = guitarType;
        this.stringNumber = stringNumber;
        this.colour = colour;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play() {
        return "brrrnnnnggg!!!";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
