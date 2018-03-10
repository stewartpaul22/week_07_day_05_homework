package classes;

import classes.instrument_enums.PianoType;
import enums.InstrumentType;

public class Piano extends Instrument {

    private PianoType pianoType;
    private int keyNumber;
    private String colour;

    public Piano(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType, PianoType pianoType, int keyNumber, String colour) {
        super(manufacturer, model, purchasePrice, sellPrice, instrumentType);
        this.pianoType = pianoType;
        this.keyNumber = keyNumber;
        this.colour = colour;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play() {
        return "Plink plink plink";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
