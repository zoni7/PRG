package tema1;


/**
 * Write a description of class Potencias here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potencias
{
    public static double potencias(double a, int n) {
        if (n == 0) { return 1; }
        else { return potencias(a , n - 1) * a; }
    }
}
