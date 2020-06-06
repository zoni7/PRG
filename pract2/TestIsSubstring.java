package pract2;


/**
 * Write a description of class TestIsSubstring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestIsSubstring
{
   public static void testIsSubstring(String a, String b) {
    boolean meu = PRGString.isSubstring(a, b);      
        System.out.printf("%-12s %-12s %-15b %-15b \n", a, b, meu, b.contains(a));
    }
    
    public static void main(String[] args){
        testIsSubstring("", "");
        testIsSubstring("", "recursion");
        testIsSubstring("recursion", "");
        testIsSubstring("recursion", "rec");
        testIsSubstring("recursion", "recursion");
        testIsSubstring("123456789", "recursion");
        testIsSubstring("rec", "recursion");
        testIsSubstring("pecur", "recursion");
        testIsSubstring("recurso", "recursion");
        testIsSubstring("remursi", "recursion");
    }
}
