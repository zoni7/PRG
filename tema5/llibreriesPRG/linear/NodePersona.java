package linear;


/**
 * Write a description of class NodePersona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NodePersona
{
    // instance variables - replace the example below with your own
    int dni;
    String nom;
    NodePersona seguent;

    /**
     * Constructor for objects of class NodePersona
     */
    public NodePersona(int i, String s, NodePersona n)
    {
        dni = i;
        nom = s;
        seguent = n;
    }  
}
