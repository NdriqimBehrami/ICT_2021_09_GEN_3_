package ict.kosovo.growth_.coffeeshop.managers;

import ict.kosovo.growth_.coffeeshop.exceptions.NegativePriceException;
import ict.kosovo.growth_.coffeeshop.models.Coffee;
import ict.kosovo.growth_.coffeeshop.models.CoffeeType;
import ict.kosovo.growth_.coffeeshop.models.ColdCoffee;
import ict.kosovo.growth_.coffeeshop.models.HotCoffee;
import ict.kosovo.growth_.labs.exceptions.ExpiredProductDateException;
import ict.kosovo.growth_.labs.helpers.Log;
import ict.kosovo.growth_.labs.models.*;
import ict.kosovo.growth_.oop.abstract_interfaces.Wrestler;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
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
    private String language = "en-US"; //"$", 10.10.2021
    //use logger here product_manager.log
    private CoffeeManager.ResourceFormatter formatter;
    private Log log;

    public CoffeeManager(String language) throws IOException {
        if (language != null) this.language = language;
        String[] arr = language.split("-");
        formatter = new CoffeeManager.ResourceFormatter(new Locale(arr[0], arr[1]));
        log = new Log("files/coffee_manager.txt", "COFFE_MANAGER_LOG", Level.INFO, new XMLFormatter());

    }

    public Coffee createHotcaffe(String coffeeName, char size, double price, String type, boolean withMilk,
                                 Rating rating) {
        Coffee coffe = null;
        try {
            coffe = new HotCoffee(coffeeName, size, BigDecimal.valueOf(price), type, withMilk, rating, null);
            coffees.add(coffe);
            return coffe;
        } catch (NegativePriceException | ict.kosovo.growth_.labs.exceptions.NegativePriceException e) {
            log.logger.warning(formatter.getText(e.getMessage()));
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));

        }
        return coffe;


    }

    public Coffee createColdCaffe(String coffeeName, char size, double price, String type, boolean withMilk, Rating rating) {
        Coffee coffe = null;
        try {
            coffe = new ColdCoffee(coffeeName, size, BigDecimal.valueOf(price), type, withMilk, rating, null);
            coffees.add(coffe);
            return coffe;
        } catch (NegativePriceException e) {
            e.printStackTrace();
        } catch (ict.kosovo.growth_.labs.exceptions.NegativePriceException e) {
            log.logger.warning(formatter.getText(e.getMessage()));
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        }
        return coffe;

    }

    public void printAllCoffees() {
        System.out.printf("%s: %d%n", formatter.getText("totalCoffes"), coffees.size());
        if (!coffees.isEmpty()) {
            System.out.println("---------------------------------------");
            for (Coffee coffee : coffees) {
                System.out.println(formatter.formatCoffe(coffee));
                System.out.println("--------------------");
            }
            System.out.println("---------------------------------------");
        }
    }


    //do te na sherben per formatizim dhe shumegjuhesi
    //10.50 -> 10,50
    private static class ResourceFormatter {
        private Locale locale; //sq
        private ResourceBundle resources;//kjo sherben per me mujt me i perdore shumegjuhesine
        private DateTimeFormatter dateTimeFormatter;
        private NumberFormat moneyFormat;

        private ResourceFormatter(Locale locale) {
            this.locale = locale;
            dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
            resources = ResourceBundle.getBundle("ict/kosovo/growth_/coffeeshop/Resources", locale);
        }

        private String formatCoffe(Coffee coffee) {
            return MessageFormat.format(resources.getString("TotalCaffe"),
                    coffee.getCoffeeName(),
                    coffee.getSize(),
                    moneyFormat.format(coffee.getPrice()),
                    coffee.getType(),
                    coffee.getRating());
        }

        private String getText(String key) {
            return resources.getString(key);
        }
    }


}
