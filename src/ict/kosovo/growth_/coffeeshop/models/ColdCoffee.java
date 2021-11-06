package ict.kosovo.growth_.coffeeshop.models;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;
import ict.kosovo.growth_.labs.models.Rating;
import ict.kosovo.growth_.labs.models.Review;

import java.math.BigDecimal;
import java.util.List;

public class ColdCoffee extends Coffee {

    public ColdCoffee(String coffeeName, char size, BigDecimal price, String type, boolean withMilk, Rating rating, List<Review> reviews) throws NegativePriceException, ict.kosovo.growth_.labs.exceptions.NegativePriceException {
        super(coffeeName, size, price, type, withMilk, rating, reviews);
    }

    public ColdCoffee(String coffeeName, char size, BigDecimal price, String type, boolean withMilk, Rating rating) {
        super(coffeeName, size, price, type, withMilk, rating);
    }
}
