package factories;

import coffee.types.Cappuccino;
import coffee.types.Coffee;

public class CappuccinoFactory extends CoffeeFactory
{
    public Coffee createCoffee()
    {
        return new Cappuccino();
    }
}