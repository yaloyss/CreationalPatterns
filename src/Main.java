//package coffeeshop;
import abstractFactories.CafeFactory;
import abstractFactories.FrenchCafeFactory;
import abstractFactories.ItalianCafeFactory;
import builder.CoffeeBuilder;
import coffee.types.Coffee;
import factories.CoffeeFactory;
import singleton.CafeMenu;

public class Main {
    public static void main(String[] args) {

        CafeMenu.getInstance().showMenu();
        System.out.println("----------------------------");
        //french cafe
        CafeFactory cafe = new FrenchCafeFactory();
        CoffeeFactory factory  = cafe.getCoffeeFactory();
        Coffee coffee = factory.createCoffee();
        CoffeeBuilder builder = new CoffeeBuilder().createCoffee(coffee);
        coffee.prepare();
        System.out.println("----------------------------");
        Coffee customCoffee = builder.addCoffee().addSyrup("Vanilla").build();
        System.out.println(customCoffee);

    }
}