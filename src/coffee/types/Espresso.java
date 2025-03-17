package coffee.types;

public class Espresso extends Coffee
{
    public Espresso()
    {
        this.name = "Espresso";
        this.hasCoffee = true;
    }

    @Override
    public Coffee clone() {
        Espresso cloned = new Espresso();
        cloned.name = this.name;
        cloned.hasCoffee = this.hasCoffee;
        return cloned;
    }
}