package ict.kosovo.growth_.coffeeshop;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;
import ict.kosovo.growth_.coffeeshop.models.*;
import ict.kosovo.growth_.coffeeshop.services.CoffeeManager;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
//        Coffee espreso = new Coffee("Makiato",'M',false,BigDecimal.valueOf(1.5), Rating.FOUR_STAR);
//        System.out.println(espreso);
////    }
//      try {
//          Coffee espreso = new HotCoffee("Espresso",'S',false,BigDecimal.valueOf(0.75),Rating.THREE_STAR,new ArrayList<>());
//
//
//          espreso.getReviews().add(new Review("Mire",Rating.FIVE_STAR,"nb"));
//          espreso.getReviews().add(new Review("Mire",Rating.THREE_STAR,"nn"));
//          espreso.getReviews().add(new Review("Mire",Rating.ONE_STAR,"bb"));
//
//          System.out.println(espreso);
//      }catch (NegativePriceException ex){
//          System.out.println(ex.getMessage());
//          System.out.println(ex.getPrice());
//      }
////        Review review1 = new Review("Shume kaffe e mire",Rating.FIVE_STAR," Ndriqim Behrami");
//       // System.out.println(review1);
//    }
        CoffeeManager cm = null;
        try {
            cm = new CoffeeManager("en-US");
            cm.createCoffee(CoffeeType.HOT_COFFEE, "Makiato", 'M', true, 1.2, Rating.NO_STAR);
            cm.createCoffee(CoffeeType.COLD_COFFEE, "LATE", 'M', false, 2.2, Rating.NO_STAR);
            cm.printCoffees();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

