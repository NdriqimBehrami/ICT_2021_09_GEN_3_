package ict.kosovo.growth_.coffeeshop;


import ict.kosovo.growth_.coffeeshop.models.*;
import ict.kosovo.growth_.coffeeshop.services.CoffeeManager;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Shop {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        CoffeeManager cm = null;
        System.out.println("----------------Zero1 Coffee App-----------------");
        System.out.println();

        System.out.println("-----------------------------------------");
        try {
            cm = new CoffeeManager("en-US");
            cm.createCoffee(CoffeeType.HOT_COFFEE, "Makiato", 'M', true, 1.2, Rating.NO_STAR);
            cm.createCoffee(CoffeeType.COLD_COFFEE, "LATE", 'S', false, 2.2, Rating.TWO_STAR);
            cm.createCoffee(CoffeeType.HOT_COFFEE, "espresso", 'S', false, 0.7, Rating.NO_STAR);
            cm.createCoffee(CoffeeType.TEA, "Tea", 'S', false, 1.80, Rating.TWO_STAR);
            cm.printCoffees();
            System.out.println("Date/Time:");
            System.out.println(dtf.format(now));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

