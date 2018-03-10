package classes;

import classes.instrument_enums.BrassType;
import enums.InstrumentType;

public class Brass extends Instrument {

    private BrassType brassType;
    private String finish;

    public Brass(String manufacturer, String model, double purchasePrice, double sellPrice, InstrumentType instrumentType, BrassType brassType, String finish) {
        super(manufacturer, model, purchasePrice, sellPrice, instrumentType);
        this.brassType = brassType;
        this.finish = finish;
    }

    public BrassType getBrassType() {
        return brassType;
    }

    public String getFinish() {
        return finish;
    }

    @Override
    public String play() {
        return "dhuuu dhuuu";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellPrice() - this.getPurchasePrice();
    }
}
