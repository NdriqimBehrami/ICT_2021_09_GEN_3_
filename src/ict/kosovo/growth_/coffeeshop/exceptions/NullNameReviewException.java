package ict.kosovo.growth_.coffeeshop.exceptions;

public class NullNameReviewException extends Exception{
    private String name = null;

    public NullNameReviewException(String message, String name){
        super(message);
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
