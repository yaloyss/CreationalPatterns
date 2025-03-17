package singleton;

public class CafeMenu
{
    private static CafeMenu instance;
    private CafeMenu() {}
    public static CafeMenu getInstance()
    {
        if (instance == null)
            instance = new CafeMenu();
        return instance;
    }
    public void showMenu()
    {
        System.out.println("Menu: Espresso, Cappuccino, Latte");
    }
}
