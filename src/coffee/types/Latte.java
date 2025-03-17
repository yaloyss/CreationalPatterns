package coffee.types;

public class Latte extends Coffee
{
    public Latte()
    {
        this.name = "Latte";
        this.hasCoffee = true;
        this.hasMilk = true;
        this.hasSugar = true;
        this.syrup = "";
    }

    @Override
    public Coffee clone() {
        Latte cloned = new Latte();
        cloned.name = this.name;
        cloned.hasCoffee = this.hasCoffee;
        cloned.hasMilk = this.hasMilk;
        cloned.hasSugar = this.hasSugar;
        return cloned;
    }
}