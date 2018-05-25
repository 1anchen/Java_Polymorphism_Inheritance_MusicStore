package Stock;

public abstract class Stock {
    protected String name;
    protected String manufacturer;
    protected String color;
    protected int wholesellPrice;
    protected int retailPrice;
    protected int stockCount;

    public Stock(String name, String manufacturer, String color, int wholesellPrice, int retailPrice, int stockCount){
        this.name =name;
        this.manufacturer =manufacturer;
        this.color =color;
        this.wholesellPrice =wholesellPrice;
        this.retailPrice =retailPrice;
        this.stockCount =stockCount;
    }

    public String getName(){
        return this.name;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getColor(){
        return this.manufacturer;
    }

    public int getWholesellPrice(){
        return this.wholesellPrice;
    }

    public int getRetailPrice(){
        return this.retailPrice;
    }

    public int getStockCount(){
        return this.stockCount;
    }


}


