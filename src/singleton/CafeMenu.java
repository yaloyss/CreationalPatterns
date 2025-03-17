package singleton;

public class CafeMenu
{
    private static CafeMenu instance;
    private CafeMenu() {}
//    public static CafeMenu getInstance()
//    {
//        if (instance == null)
//            instance = new CafeMenu();
//        return instance;
//    }
public static CafeMenu getInstance() {
    CafeMenu result = instance;
    if (result == null) {
        synchronized (CafeMenu.class) //гарант, що об'єкт створюється тільки в одному потоці
        {
            result = instance;
            if (result == null)  //не дозволяє іншому потоку створити новий об'єкт
            {
                result = new CafeMenu();
                instance = result;
            }
        }
    }
    return result;
}
    public void showMenu()
    {
        System.out.println("Menu: Espresso, Cappuccino, Latte");
    }
}