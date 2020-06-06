package tema1;


/**
 * Write a description of class mcd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mcd
{
    public static int mcd(int a, int b) {
        if (a % b == 0) return b;
        else return mcd(b, a % b);
    
    }
}
