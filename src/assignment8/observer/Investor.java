package assignment8.observer;

import java.util.ArrayList;
import java.util.List;

public class Investor {
    private String name;
    private List<Stock> stocks;

    public Investor(String name) {
        this.name = name;
        this.stocks = new ArrayList<>();
    }

    public void investInStock(Stock stock) {
        stocks.add(stock);
        stock.registerInvestor(this);
    }

    public void divestFromStock(Stock stock) {
        stocks.remove(stock);
        stock.unregisterInvestor(this);
    }

    public void update(Stock stock, double price) {
        System.out.println(name + " received update for stock " + stock.getSymbol() + ": $" + price);
    }
}