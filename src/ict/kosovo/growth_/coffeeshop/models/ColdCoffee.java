package ict.kosovo.growth_.coffeeshop.models;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;

public class ColdCoffee extends Coffee{
    public ColdCoffee(String name, char size, boolean withMilk, BigDecimal price, Rating rating, List<Review> reviews) throws NegativePriceException {
        super(name, size, withMilk, price, rating,reviews);
    }

    public ColdCoffee(String name, char size, BigDecimal price) throws NegativePriceException {
        super(name, size, price);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(07,0))&& now.isBefore(LocalTime.of(10,00))
                ? getPrice().divide(BigDecimal.valueOf(2)): BigDecimal.ZERO;
    }
}
