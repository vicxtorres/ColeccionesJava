package List;

import java.util.LinkedList;

public class MiLinkedList <E>
{
    private LinkedList<E> miLkList;

    public MiLinkedList()
    {
        miLkList = new LinkedList<E>();
    }

    public void agregarPrimero(E elemento)
    {
        miLkList.addFirst(elemento);
    }

    public void agregarUltimo(E elemento)
    {
        miLkList.addLast(elemento);
    }

    public void eliminarPimero()
    {
        miLkList.removeFirst();
    }

    public void eliminarUltimo()
    {
        miLkList.removeLast();
    }

    public void eliminarDeterminadoElemento (E elemento)
    {
        miLkList.remove(elemento);
    }

    public void eliminarPorIndice (int index)
    {
        miLkList.remove(index);
    }


    @Override
    public String toString() {
        return "\nMiLinkedList" + miLkList;
    }
}
