import firstHomework.adapterTask.*;
import firstHomework.coffeeTask.AmericanoCoffeeFactory;
import firstHomework.coffeeTask.CappuccinoCoffeeFactory;
import firstHomework.coffeeTask.CoffeeFactory;
import firstHomework.loggerTask.Logger;
import firstHomework.proxyTask.DBConnection;
import firstHomework.proxyTask.DBConnectionAble;
import firstHomework.proxyTask.DBConnectionProxy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("aa", logger);


        Map<String, CoffeeFactory> coffeesFactories = new HashMap<>();
        coffeesFactories.put("americano", new AmericanoCoffeeFactory());
        coffeesFactories.put("cappuccino", new CappuccinoCoffeeFactory());
        coffeesFactories.get("cappuccino").makeCoffee().printRecipe();
        coffeesFactories.get("americano").makeCoffee().printRecipe();


        Computer pc = new Computer();
        USBable usb = new USB();
        USBable sdcAdapter = new USBAdapter(new SDCard());

        System.out.println(pc.read(usb));
        System.out.println(pc.read(sdcAdapter));

        DBConnectionAble dbNameHolder = new DBConnection("postgres");
        DBConnectionAble dbConnectionProxy;
        dbConnectionProxy = new DBConnectionProxy("jdbc:postgresql://127.0.0.1:5432/", dbNameHolder);
        System.out.println(dbConnectionProxy.getConnection());

    }
}