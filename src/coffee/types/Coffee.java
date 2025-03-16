package coffee.types;
public abstract class Coffee
{
    public String name;
    public boolean hasMilk;
    public boolean hasSugar;
    public String syrup;
    public void prepare()
    {
        System.out.println("Приготування " + name);
    }
}