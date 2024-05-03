package assignment8.observer;
public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("AAPL", 150.0);
        Stock stock2 = new Stock("GOOG", 250.0);

        Investor investor1 = new Investor("Bireu");
        Investor investor2 = new Investor("Tagy Bireu");

        investor1.investInStock(stock1);
        investor1.investInStock(stock2);

        investor2.investInStock(stock1);

        stock1.setPrice(155.0);

        stock2.setPrice(300.0);
    }
}

