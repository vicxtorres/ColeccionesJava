package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MiHashMap <K,V> //E: el elemento a guardar
{
    private HashMap<K,V> miHashMap;
    /*Las claves pueden ser de cualquier tipo de *objetos*,
    aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double*/

    public MiHashMap()
    {
        miHashMap = new HashMap<K,V>();
    }

    public void agregar (K key, V value) {
        miHashMap.put(key, value); //si ingreso la misma clave se sobreescribe el map
    }

    public void eliminar (K key)
    {
        miHashMap.remove(key); //elimino por clave
    }

    public boolean existeKey (K key)
    {
        return miHashMap.containsKey(key);
    }


    public void mostrarMapaIterado()  //no lo usaria de esta forma, sirve para ordenar pares por ej
    {
        //el iterator itera sobre un solo tipo de elemento, ese elemento es la entradaDelMapa
        Iterator<Map.Entry<K,V>> iterattor = miHashMap.entrySet().iterator(); //entro al mapa

        while(iterattor.hasNext()) //mientras haya un sig
        {
            Map.Entry<K,V> entradaDelMapa = iterattor.next(); //voy al sig
            System.out.println("clave: " + entradaDelMapa.getKey());  //esto es para el ejemplo, no van sout aca
            System.out.println("valor: "+entradaDelMapa.getValue());
        }
    }


    @Override
    public String toString() {
        return "MiHashMap->" + miHashMap;
    }
}
