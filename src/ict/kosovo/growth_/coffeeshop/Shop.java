package ict.kosovo.growth_.coffeeshop;

import ict.kosovo.growth_.coffeeshop.managers.CoffeeManager;
import ict.kosovo.growth_.labs.models.Rating;

import java.io.IOException;

public class Shop {
    public static void main(String[] args) {
        CoffeeManager cm = null;
        try {
            cm = new CoffeeManager("en-US");
            cm.createHotcaffe("Espreso", 'S', 3.80, "Gjate", true, ict.kosovo.growth_.labs.models.Rating.NO_STAR);
            cm.createColdCaffe("Icecoffe", 'B', 4.60, "madhe", true, Rating.FIVE_STAR);
            cm.printAllCoffees();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

