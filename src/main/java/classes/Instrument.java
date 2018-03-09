package classes;

import enums.InstrumentType;

public abstract class Instrument extends Product {

    private InstrumentType instrumentType;

    public Instrument(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType) {
        super(manufacturer, model, purchasePrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
