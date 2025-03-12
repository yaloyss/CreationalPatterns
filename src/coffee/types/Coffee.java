package coffee.types;
public abstract class Coffee
{
    public String name;
    public void prepare()
    {
        System.out.println("Приготування " + name);
    }
}