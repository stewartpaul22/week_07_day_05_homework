package classes;

import enums.InstrumentType;
import interfaces.Playable;

public abstract class Instrument extends Product implements Playable {

    private InstrumentType instrumentType;

    public Instrument(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType) {
        super(manufacturer, model, purchasePrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
