package coffee.types;

public class Cappuccino extends Coffee
{
    public Cappuccino()
    {
        this.name = "Cappuccino";
        this.hasCoffee = true;
        this.hasMilk = true;
        this.syrup = "Chocolate";
    }

    @Override
    public Coffee clone() {
        Cappuccino cloned = new Cappuccino();
        cloned.name = this.name;
        cloned.hasCoffee = this.hasCoffee;
        cloned.hasMilk = this.hasMilk;
        cloned.syrup = this.syrup;
        return cloned;
    }
}