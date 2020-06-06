package linear;


/**
 * Write a description of class SecEnla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecEnlaPersona
{
    // instance variables - replace the example below with your own
    private NodePersona seq;    

    /**
     * Constructor for objects of class SecEnla
     */
    public SecEnlaPersona()
    {
        // initialise instance variables
        seq = null;
    }    
    public int comptar(String s) {
        NodePersona aux = seq;
        int cont = 0;
        while (aux != null) {
            if (aux.nom.contains(s)) { cont++; }
            aux = aux.seguent;            
        }
        return cont;
    }
    
    public String cercar(int dniACercar) {
        String res = "Persona desconeguda";
        NodePersona aux = seq;
        while (aux != null && !res.equals("Persona desconeguda")) {
            if (aux.dni == dniACercar) { res = aux.nom; }
            aux = aux.seguent;
        }
        return res;
    }
}
