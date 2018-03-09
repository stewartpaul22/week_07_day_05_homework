package classes;

import enums.InstrumentType;
import interfaces.Playable;
import interfaces.Sellable;

public abstract class Instrument extends Product implements Playable, Sellable {

    private InstrumentType instrumentType;

    public Instrument(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType) {
        super(manufacturer, model, purchasePrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
