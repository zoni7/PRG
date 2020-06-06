
package tema1;


/**
 * Write a description of class Metodes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Metodes
{
    public static boolean esCapicua(String v, int posIni, int posFi) {
        
        if (v.substring(posIni, posFi).equals("")) return false;
        else{
            if (v.substring(posIni).equals(v.substring(posFi))) {
              
                return esCapicua(v, posIni + 1, posFi - 1);
            
           
            }
        }
        return true;
    }
    
    public static int contarAs(String s) {
        if (s.length() == 0) { return 0; }
        else if (s.charAt(0) == 'a') { 
            return 1 + contarAs(s.substring(1));            
        }
        else { return contarAs(s.substring(1)); }
        
        
    }
    
    public static int contarAs2(String s, int pos) {
        if (pos >= s.length()) { return 0; }
        else if (s.charAt(pos) == 'a') { 
            return 1 + contarAs2(s, pos + 1);            
        }
        else { return contarAs2(s, pos + 1); }
        
        
    }
}
