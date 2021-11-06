package ict.kosovo.growth_.coffeeshop.models;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;
import ict.kosovo.growth_.labs.models.Rating;
import ict.kosovo.growth_.labs.models.Review;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Coffee implements Rateable {
    private String coffeeName;
    private char size;
    private BigDecimal price;
    private String type;
    private boolean withMilk = false;
    private Rating rating;
    private List<Review> reviews;

    public Coffee(String coffeeName, char size, BigDecimal price, String type, boolean withMilk, Rating rating, List<Review> reviews) throws NegativePriceException, ict.kosovo.growth_.labs.exceptions.NegativePriceException {
        this.coffeeName = coffeeName;
        this.size = size;
        //this.price= price;
        setPrice(price);
        this.type = type;
        this.withMilk = withMilk;
        this.rating = rating;
        this.reviews = reviews;
    }

    public Coffee(String coffeeName, char size, BigDecimal price, String type, boolean withMilk, Rating rating) {
    }


    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws ict.kosovo.growth_.labs.exceptions.NegativePriceException {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            //this.price = BigDecimal.ZERO;
            throw new ict.kosovo.growth_.labs.exceptions.NegativePriceException("NegativePriceException", price.doubleValue());
            //throw error
        } else
            this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }

    @Override
    public Rating getRating() {
        if (reviews==null || reviews.isEmpty()) return Rating.NO_STAR;
        double sum = 0;
        for (Review review : reviews) {
            sum += review.getRating().getValue();
        }
        int avg = (int) Math.ceil(sum / reviews.size());//3.1
        return Rating.values()[avg];
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
    @Override
    public String toString (){
        return String.format("Coffe Name:%s%nSize:%s%nPrice:%.2fEUR%n" +
                "Type:%s%n With milk:%b%n");
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
