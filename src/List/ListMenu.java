package List;

import List.MiArrayList;
import List.MiLinkedList;
import List.MiVector;

public class ListMenu
{
    public void menu()
    {
        ///ARRAYLIST FUNCIONAMIENTO
        MiArrayList<String> miArray = new MiArrayList<String>();
        miArray.agregar("alejandro");
        miArray.agregar("ramon");
        miArray.agregar("leandro");

        System.out.println(miArray.toString());
        miArray.eliminar(1);
        System.out.println(miArray.toString());

        ///VECTOR FUNCIONAMIENTO
        MiVector<String> miVector = new MiVector<String>();
        miVector.agregar("wanda");
        miVector.agregar("juan");
        miVector.agregar("wanda");
        System.out.println(miVector.toString());
        miVector.eliminarPorPosicion(0);
        System.out.println(miVector.toString());
        miVector.eliminarPorElemento("wanda");
        System.out.println(miVector.toString());

        ///LINKEDLIST FUNCIONAMIENTO
        MiLinkedList<Integer> miLkList = new MiLinkedList<>();
        miLkList.agregarPrimero(800);
        miLkList.agregarUltimo(4);
        miLkList.agregarPrimero(5);
        System.out.println(miLkList.toString());
        miLkList.eliminarUltimo();
        System.out.println("Ultimo eliminado " + miLkList.toString());

    }
}
