package tema1;


/**
 * Mostra el residu de la divisió.
 *
 */
public class Divisio
{
    public static int resto(int a, int b) {
        if (a < b) { return a; }
        else { return resto(a - b, b); }
    }
}
