package abstractFactories;
import factories.CappuccinoFactory;
import factories.CoffeeFactory;

public class FrenchCafeFactory implements CafeFactory
{
    public CoffeeFactory getCoffeeFactory()
    {
        return new CappuccinoFactory();
    }
}
