package pract2;


/**
 * Write a description of class TestIsPrefix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestIsPrefix
{
    private static void testIsPrefix(String a, String b){
        boolean meu = PRGString.isPrefix(a, b);      
        System.out.printf("%-12s %-12s %-15b %-15b \n", a, b, meu, b.startsWith(a));
    }
    
    public static void main(String[] args) {
        testIsPrefix("", "");
        testIsPrefix("", "recursion");
        testIsPrefix("recursion", "");
        testIsPrefix("recursion", "rec");
        testIsPrefix("recursion", "recursion");
        testIsPrefix("123456789", "recursion");
        testIsPrefix("rec", "recursion");
        testIsPrefix("pecur", "recursion");
        testIsPrefix("recurso", "recursion");
        testIsPrefix("remursi", "recursion");
    
    }
}
