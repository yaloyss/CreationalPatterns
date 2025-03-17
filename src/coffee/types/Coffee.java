package coffee.types;
import CoffeePrototype.Prototype;

public abstract class Coffee implements Prototype, Cloneable
{
    public String name;
    public boolean hasCoffee;
    public boolean hasMilk;
    public boolean hasSugar;
    public String syrup;
    public void prepare()
    {
        System.out.println("Preparing " + name);
    }
    @Override
    public abstract Coffee clone();
}