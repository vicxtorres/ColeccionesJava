package modelo;

import java.util.ArrayList;

public class MiArrayList <E>
{
    private ArrayList<E> miArray;

    public MiArrayList ()
    {
        miArray = new ArrayList<E>();
    }

    public void agregar(E elemento)
    {
        miArray.add(elemento);
    }

    public E eliminar(int indice)
    {
        return miArray.remove(indice);
    }


    @Override
    public String toString() {
        return "\nArrayList" + miArray;
    }
}
