package classes;

import classes.instrument_enums.GuitarType;
import enums.InstrumentType;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int stringNumber;

    public Guitar(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType, GuitarType guitarType, int stringNumber) {
        super(manufacturer, model, purchasePrice, sellPrice, instrumentType);
        this.guitarType = guitarType;
        this.stringNumber = stringNumber;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    @Override
    public String play() {
        return "brrrnnnnggg!!!";
    }
}
