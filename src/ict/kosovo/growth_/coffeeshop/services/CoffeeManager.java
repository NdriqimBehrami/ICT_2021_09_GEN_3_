package ict.kosovo.growth_.coffeeshop.services;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;
import ict.kosovo.growth_.coffeeshop.helpers.Log;
import ict.kosovo.growth_.coffeeshop.models.*;

import javax.swing.text.NumberFormatter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.XMLFormatter;

public class CoffeeManager {
    private List<Coffee> coffees = new ArrayList<>();
    private String language = "en-US";
    private ResourceFormatter formatter;
    private Log logmp;


    public CoffeeManager(String language) throws IOException {
        if (language != null) this.language = language;
        String [] arr = language.split("-");
        formatter= new ResourceFormatter(new Locale(arr[0],arr[1]));
        logmp = new Log("files/coffee_manager.txt","COFFEE_MANAGER_LOG", Level.INFO,new XMLFormatter());

    }

    public Coffee createHotCoffee(String name, char size, boolean withMilk, double price, Rating rating) {


        Coffee coffee = null;
        try {
            coffee = new HotCoffee(name, size, withMilk, BigDecimal.valueOf(price), rating, null);
            coffees.add(coffee);
            return coffee;
        } catch (NegativePriceException e) {
            logmp.logger.severe(formatter.getText(e.getMessage()) + "  " + e.getPrice());
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        }
        return coffee;

    }

    public Coffee createColdCoffee(String name, char size, boolean withMilk, double price, Rating rating) {
        Coffee coffee = null;
        try {
            coffee = new ColdCoffee(name, size, withMilk, BigDecimal.valueOf(price), rating, null);
            coffees.add(coffee);
            return coffee;
        } catch (NegativePriceException e) {
            logmp.logger.severe(formatter.getText(e.getMessage())+" "+ e.getPrice());
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        }
        return coffee;

    }
    public Coffee createTea(String name, char size, boolean withMilk, double price, Rating rating) {
        Coffee coffee = null;
        try {
            coffee = new Tea(name, size, withMilk, BigDecimal.valueOf(price), rating, null);
            coffees.add(coffee);
            return coffee;
        } catch (NegativePriceException e) {
            logmp.logger.severe(formatter.getText(e.getMessage())+" "+ e.getPrice());
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        }
        return coffee;

    }

    public Coffee createCoffee(CoffeeType coffeeType, String name, char size, boolean withMilk, double price, Rating rating) {
        return coffeeType == CoffeeType.HOT_COFFEE ?
                createHotCoffee(name, size, withMilk, price, rating) :
                createColdCoffee(name, size, withMilk, price, rating);

    }
    private static class ResourceFormatter {
        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateTimeFormatter;
        private NumberFormat moneyFormat;

        private ResourceFormatter(Locale locale) {
            this.locale = locale;
            dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
            resources = ResourceBundle.getBundle("ict/kosovo/growth_/coffeeshop/Resources", locale);
        }

        private String formatCoffee(Coffee coffee) {
            return MessageFormat.format(resources.getString("coffee"),
                    coffee.getName(),
                    coffee.getSize(),
                    coffee.isWithMilk(),
                    moneyFormat.format(coffee.getPrice()),
                    coffee.getRating());
        }

        private String getText(String key){
            return resources.getString(key);
        }
    }

//    public void printCoffees() {
//        System.out.printf("%s %d%n",formatter.getText("totalCoffees"),coffees.size());
//        if (!coffees.isEmpty()) {
//            System.out.println("-----------------------");
//            for (Coffee coffee : coffees) {
//                System.out.println(formatter.formatCoffee(coffee));
//                System.out.println("--------------------")
//                ;
//            }
//        }
//        System.out.println("--------------------------");
//
//    }
public void printCoffees() {
    System.out.printf("");
    if (!coffees.isEmpty()) {
        for (Coffee coffee : coffees) {
            System.out.println(formatter.formatCoffee(coffee));
            System.out.println("-----------------------------------------");
        }
        System.out.printf("%s %d %n%s %.2fEUR %n",formatter.getText("totalCoffees"),coffees.size(),"Total price: ",5.9);
        System.out.println("-----------------------------------------");

    }

}



}
