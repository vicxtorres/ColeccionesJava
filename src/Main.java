import List.ListMenu;
import Map.MapMenu;
import Set.SetMenu;


public class Main {
    public static void main(String[] args)
    {

        System.out.println("SET MENU");
        SetMenu menuDeSet = new SetMenu();
        menuDeSet.menu();

        System.out.println("\nLIST MENU");
        ListMenu menuDeList = new ListMenu();
        menuDeList.menu();

        System.out.println("\nMAP MENU");
        MapMenu menuDeMap = new MapMenu();
        menuDeMap.menu();

    }


}