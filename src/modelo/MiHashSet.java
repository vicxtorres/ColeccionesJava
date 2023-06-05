package modelo;

import java.util.HashSet;

public class MiHashSet <E>
{
    private HashSet <E> miHashSet;


    public MiHashSet()
    {
        miHashSet = new HashSet<E>();
    }


    public void agregar (E elemento)
    {
        miHashSet.add(elemento);
    }


  /*  public void mostrarHashSet ()
    {
        miHashSet.forEach(set->{
            System.out.println(set); //esto esta MAL MAL aca pero es para ver como funciona el foreach jejej
        });
    }*/

    @Override
    public String toString() {
        return "\nHashSet-> " + miHashSet;
    }
}
