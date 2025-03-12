package abstractFactories;

import factories.CoffeeFactory;
import factories.EspressoFactory;

public class ItalianCafeFactory implements CafeFactory
{
    public CoffeeFactory getCoffeeFactory()
    {
        return new EspressoFactory();
    }
}