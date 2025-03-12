package factories;

import coffee.types.Cappuccino;
import coffee.types.Coffee;

class CappuccinoFactory extends CoffeeFactory
{
    public Coffee createCoffee()
    {
        return new Cappuccino();
    }
}