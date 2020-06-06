package usaLinear;

import linear.StackIntLinked;
/**
 * Classe BenParentitzada: Ús dels tipus lineals.
 * 
 *  @author PRG
 *  @version Curs 2019/20
 */
public class BenParentitzada {   
    private BenParentitzada() { }
    
    /** Comprova si els caràcters de s formen una expressió
     *  ben parentitzada de '[', ']', '(', ')'.
     */
    public static boolean expressioBenParent(String s) {
        // Crear una  pila de parèntesi oberts pendents de tancar,
        // inicialment buida       
       
        boolean desajust = false;
        int i = 0;
        while (i < s.length() && !desajust) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') { /* empilar c en la pila */ }
            else { // c és un parèntesi tancat
                if (/* queden parèntesi per tancar */) {
                    if (/* té un caràcter immediatament anterior pendent al que cancel.la */ ) {
                        /* desempilar */
                    }
                    else { desajust = true; }
                }
                else { desajust = true; }            
            }       
            i++;
        } 
        // torna true sii s'han tancat correctament tots els parèntesi
        return /* completar */; 
    }  
    
    public static void main(String[] args) {
        String[] s = {"[()()][]", "[()[)][]", "[()()]["};
        for (int i = 0; i < s.length; i++) {
            boolean b = expressioBenParent(s[i]);
            System.out.printf("La cadena %s ", s[i]);
            if (!b) { System.out.printf("NO "); }
            else { System.out.printf("SÍ "); }
            System.out.printf("està ben parentitzada.\n"); 
        }
    }
}
