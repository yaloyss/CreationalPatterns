package coffee.types;

public class Espresso extends Coffee
{
    public Espresso()
    {
        this.name = "Espresso";
        this.hasCoffee = true;
        this.hasMilk = false;
        this.hasSugar = false;
        this.syrup = "";
    }

    @Override
    public Coffee clone() {
        Espresso cloned = new Espresso();
        cloned.name = this.name;
        cloned.hasCoffee = this.hasCoffee;
        return cloned;
    }
}