package abstractFactories;
import factories.CoffeeFactory;

public interface CafeFactory
{
    CoffeeFactory getCoffeeFactory();
}