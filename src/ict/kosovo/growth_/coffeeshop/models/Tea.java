package ict.kosovo.growth_.coffeeshop.models;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.util.List;

public class Tea extends Coffee{
    public Tea(String name, char size, boolean withMilk, BigDecimal price, Rating rating, List<Review> reviews) throws NegativePriceException {
        super(name, size, withMilk, price, rating, reviews);
    }

    public Tea(String name, char size, BigDecimal price) throws NegativePriceException {
        super(name, size, price);
    }

    @Override
    public BigDecimal getDiscount() {
        return null;
    }
}
