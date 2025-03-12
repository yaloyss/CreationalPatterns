package abstractFactories;

import factories.CoffeeFactory;
import factories.LatteFactory;

class AmericanCafeFactory implements CafeFactory
{
    public CoffeeFactory getCoffeeFactory()
    {
        return new LatteFactory();
    }
}
