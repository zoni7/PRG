package tema5;


/**
 * Write a description of class SecEnla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecEnla
{
    // instance variables - replace the example below with your own
    private NodeInt seq;

    /**
     * Constructor for objects of class SecEnla
     */
    public SecEnla()
    {
        seq = null;
    }
    
    public void avançar(int x) {
        NodeInt aux = seq; NodeInt ant = null;
        while (aux != null && aux.data != x) {
            ant = aux;
            aux = aux.next;
        }
        if (ant != null) {
            if (aux != null) {
                int auxiliar = aux.data;
                aux.data = ant.data;
                ant.data  auxiliar;
            }
        } else {
            while (ant.seguent != null) {
                ant = ant.seguent;
            }
            int auxiliar = aux.data;
            aux.data = ant.data;
            ant.data = auxiliar;
        }
    }
}
   
