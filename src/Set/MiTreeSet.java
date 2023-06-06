package Set;

import java.util.TreeSet;

public class MiTreeSet <E>
{
    private TreeSet <E> miTreeSet;

    public MiTreeSet()
    {
        miTreeSet = new TreeSet<E>();
    }

    public void agregar(E elemento)
    {
        miTreeSet.add(elemento);
    }


    //Devuelve el elemento menor de la colección, pero que sea mayor que el elemento dado.
    public void menorElementoPeroMayorA(E elemento)
    {
        miTreeSet.higher(elemento);
    }

    //Devuelve el elemento mayor de la colección, pero que sea menor que el elemento dado
    public void mayorElementoPeroMenorA (E elemento)
    {
        miTreeSet.lower(elemento);
    }



    //las de eliminar devuelven null si estan vacias
    public void eliminarPrimero ()
    {
        miTreeSet.pollFirst();
    }

    public void eliminarUltimo()
    {
        miTreeSet.pollLast();
    }



    @Override
    public String toString() {
        return "\nTreeSet->" + miTreeSet;
    }
}
