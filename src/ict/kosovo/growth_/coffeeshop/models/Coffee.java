package ict.kosovo.growth_.coffeeshop.models;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    private String name;
    private char size;
    private boolean withMilk = false;
    private BigDecimal price;
    private Rating rating;
    private List<Review> reviews;

    public Coffee(String name, char size, boolean withMilk, BigDecimal price, Rating rating,List<Review> reviews) throws NegativePriceException {
        this.name = name;
        this.size = size;
        this.withMilk = withMilk;
       // this.price = price;
        setPrice(price);
        this.rating = rating;
        this.reviews = new ArrayList<>();
    }
    public Coffee(String name,char size,BigDecimal price)throws NegativePriceException{
        this(name,size,true,price,Rating.TWO_STAR, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws NegativePriceException{
        if(price.compareTo(BigDecimal.ZERO)<0) {
//            this.price = BigDecimal.ZERO;
            throw new NegativePriceException("Nuk lejohet cmimi negativ per kaffe",price.doubleValue());
        }
        else
            this.price=price;
      }



    public Rating getRating() {
        if(reviews==null || reviews.isEmpty())return Rating.NO_STAR;
        double sum =0;
        for(Review review : reviews){
            sum+=review.getRating().getValue();
        }
        int avg = (int)Math.ceil(sum/reviews.size());
        return Rating.values()[avg];

    }


    public abstract BigDecimal getDiscount();

    @Override
    public String toString() {
        return String.format(" Name: %s%n Size:%s%n " +
                "With milk: %b%n Price: %.2fEUR%n Rating:%s%n Discount: - %.2f",name,size,withMilk,price,getRating(),getDiscount());
    }



    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}


