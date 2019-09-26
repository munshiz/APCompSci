public class Stocktest{
    public static void main(String[] args) {
        Stock ORCL = new Stock("ORCL", "Oracle");

        ORCL.setClosingPrice(53.44);
        ORCL.setCurrentPrice(53.37);
        System.out.println(ORCL.getPercentChange());
    }
}