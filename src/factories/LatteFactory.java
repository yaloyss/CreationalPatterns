package factories;

import coffee.types.Coffee;
import coffee.types.Latte;

public class LatteFactory extends CoffeeFactory
{
    public Coffee createCoffee()
    {
        return new Latte();
    }
}