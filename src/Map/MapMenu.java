package Map;

import java.util.Iterator;
import java.util.Map;

public class MapMenu
{
    ///ARREGLAR ESTOOOO
    public void menu()
    {

        MiHashMap<Integer, String> miHashMap= new MiHashMap<Integer,String>();

        miHashMap.agregar(1,"carlos");
        miHashMap.vista();
        miHashMap.agregar(1,"messi"); //se sobreescribe carlos y queda messi
        miHashMap.agregar(2,"antonela");

        miHashMap.mostrarMapaIterado();
        System.out.println(miHashMap.toString());

    }


}
