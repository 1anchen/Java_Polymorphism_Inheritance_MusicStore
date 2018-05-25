package Stock.Instrument;

import Stock.Stock;

public class Instrument extends Stock {

    protected String material;
    protected PlayType playType;

    public Instrument(String name, String manufacturer, String color, int wholesellPrice,
                      int retailPrice, int stockCount, String material, PlayType playtype) {

        super(name,manufacturer,color,wholesellPrice,retailPrice,stockCount);
        this.material =material;
        this.playType =playType;
    }

}
