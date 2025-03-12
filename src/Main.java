//package coffeeshop;
import abstractFactories.CafeFactory;
import abstractFactories.ItalianCafeFactory;
import builder.CoffeeBuilder;
import coffee.types.Coffee;
import factories.CoffeeFactory;
import singleton.CafeMenu;

public class Main {
    public static void main(String[] args) {
        // Меню
        CafeMenu.getInstance().showMenu();

        CafeFactory cafe = new ItalianCafeFactory();
        CoffeeFactory coffeeFactory = cafe.getCoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.prepare();

        Coffee customCoffee = new CoffeeBuilder(coffee).addMilk().addSugar().addSyrup("ваніль").build();
    }
}