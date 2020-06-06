package tema3.examens;


/**
 * Write a description of class Examen1516 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examen1516
{
    public static void m1(String[] lS) {
        int k = 0;
        boolean fi = false;
        try{
            while (!fi) {
                try{
                    System.out.print("Posici´o " + k + ": ");
                    System.out.println(lS[k].length() + " car`acters");
                    
                } catch (NullPointerException e) { System.out.println("Array no inicialitzada"); }
                k++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {System.out.println("No existeix, metode finalitzat"); }            
    }
}

