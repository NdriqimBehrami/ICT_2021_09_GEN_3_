package ict.kosovo.growth_.coffeeshop.exceptions;

public class NegativePriceException extends Exception{

        private double price;

    public NegativePriceException(String message, double price) {
            super(message);
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

