package builder;

import coffee.types.Coffee;

public class CoffeeBuilder
{
    private Coffee coffee;
    private boolean milk = false;
    private boolean sugar = false;
    private String syrup = "";

    public CoffeeBuilder(Coffee coffee)
    {
        this.coffee = coffee;
    }
    public CoffeeBuilder addMilk()
    {
        milk = true;
        return this;
    }
    public CoffeeBuilder addSugar()
    {
        sugar = true;
        return this;
    }
    public CoffeeBuilder addSyrup(String syrup)
    {
        this.syrup = syrup;
        return this;
    }
    public Coffee build()
    {
        System.out.println("Готовий напій: " + coffee.name + (milk ? " + молоко" : "") + (sugar ? " + цукор" : "") + (syrup.isEmpty() ? "" : " + " + syrup + " сироп"));
        return coffee;
    }
}