package modelo;

import java.util.Vector;

public class MiVector <E>
{
    private Vector <E> miVector;

    public MiVector()
    {
        miVector = new Vector<E>();
    }

    public void agregar(E elemento)
    {
        miVector.add(elemento);
    }

    public void eliminarPorPosicion(int indice)
    {
        miVector.removeElementAt(indice);
    }

    public void eliminarPorElemento(E elemento)
    {
        miVector.removeElement(elemento);
    }

    @Override
    public String toString() {
        return "\nMiVector" + miVector;
    }
}
