package builder;

import coffee.types.Coffee;

public class CoffeeBuilder
{
    private Coffee coffee;
    private boolean milk = false;
    private boolean sugar = false;
    private String syrup = "";

    public CoffeeBuilder createCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }
    public CoffeeBuilder addMilk()
    {
        coffee.hasMilk = true;
        return this;
    }
    public CoffeeBuilder addSugar()
    {
        coffee.hasSugar = true;
        return this;
    }
    public CoffeeBuilder addSyrup(String syrup)
    {
        coffee.syrup = syrup;
        return this;
    }
    public Coffee build()
    {
        System.out.println("Prepared drink: " + coffee.name + (milk ? " + молоко" : "") + (sugar ? " + цукор" : "") + (syrup.isEmpty() ? "" : " + " + syrup + " сироп"));
        return coffee;
    }
}