package linear;


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
        // initialise instance variables
        seq = null;
    }
    
    public void avançar(int x) {
        // no es pot retrocedir una secuencia per això creem una variable ant
        // es marquem el Indian Jones XD ant es el malo i aux és Indiana Jones
        NodeInt aux = seq, ant = null; 
        while (aux != null && aux.data != x) { 
            ant = aux;
            aux = aux.next; 
        }
        if (ant != null) {
            if (aux != null){
                int auxiliar = aux.data;
                aux.data = ant.data;
                ant.data = auxiliar;
            }
        } else { // passa a l'última posició            
            while (ant.next != null){
                ant = ant.next; // recorregut que obté l'últim element
            }
            int auxiliar = aux.data;
            aux.data = ant.data;
            ant.data = auxiliar;
        }
    }
    
}
