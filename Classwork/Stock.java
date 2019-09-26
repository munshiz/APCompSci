public class Stock{
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String sym, String Name){
        symbol = sym;
        name = Name;
    }

    public String getName(){
        return name;
    }
    public String getSymbol(){
        return symbol;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setClosingPrice(double price){
        previousClosingPrice = price;
    }
    public void setCurrentPrice(double price){
        currentPrice = price;
    }

    public double getPercentChange(){
        return (currentPrice / previousClosingPrice) * 100;
    }
}