package factories;

import coffee.types.Coffee;
import coffee.types.Espresso;

public class EspressoFactory extends CoffeeFactory
{
    public Coffee createCoffee()
    {
        return new Espresso();
    }
}