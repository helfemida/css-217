package assignment8.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private double price;
    private List<Investor> investors;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    public void unregisterInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors(double price) {
        for (Investor investor : investors) {
            investor.update(this, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors(price);
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }
}