package modelo;

import java.util.LinkedHashSet;

public class MiLinkedHashSet <E>
{
    private LinkedHashSet<E> miLkHashSet;

    public MiLinkedHashSet()
    {
        miLkHashSet = new LinkedHashSet<E>();
    }

    public void agregar (E elemento)
    {
        miLkHashSet.add(elemento);
    }

    public void eliminar (E elemento)
    {
        miLkHashSet.remove(elemento);
    }

    @Override
    public String toString() {
        return "\nLinkedHashSet->" + miLkHashSet;
    }
}
