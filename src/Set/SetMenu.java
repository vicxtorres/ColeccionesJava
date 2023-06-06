package Set;

public class SetMenu
{
    public void menu()
    {

        /**HASHSET FUNCIONAMIENTO**/
        MiHashSet<String> miHashSet = new MiHashSet<String>();
        miHashSet.agregar("vicky");
        miHashSet.agregar("sofi");
        miHashSet.agregar("ramiro");
        miHashSet.agregar("sara");
        miHashSet.agregar("vicky"); //muestra vicky una sola vez porque no admite repetidos

        System.out.println(miHashSet.toString()); //muestra segun su hashcode


        /**TREESET FUNCIONAMIENTO**/
        MiTreeSet<Integer> miTreeSet = new MiTreeSet<Integer>();
        miTreeSet.agregar(4);
        miTreeSet.agregar(0);
        miTreeSet.agregar(7);

        System.out.println(miTreeSet.toString()); //de menor a mayor
        miTreeSet.eliminarUltimo();
        System.out.println("Ultimo eliminado: " +miTreeSet.toString());


        /**LinkedHashSet FUNCIONAMIENTO**/
        MiLinkedHashSet<String> miLinkedHS = new MiLinkedHashSet<>();
        miLinkedHS.agregar("vicky");
        miLinkedHS.agregar("victoria");
        miLinkedHS.agregar("jane austen");

        System.out.println(miLinkedHS.toString()); //en orden como ingresaron
    }
}
