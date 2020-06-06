package tema1;


/**
 * Write a description of class OrdenacióArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrdenacióArrays
{
    public static void mergesort(int[] v, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (fin + inicio) / 2;
            
            mergesort(v, inicio, mitad);
            mergesort(v, mitad + 1, fin);
            
            
            
        }
    }
    
    public static int[] mostraMergesort(int[] v, int inicio, int fin) {
        int[] a = mergesort(v, inicio, fin);
    }
}