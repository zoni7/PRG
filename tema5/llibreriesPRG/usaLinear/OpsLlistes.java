package usaLinear;

import linear.ListPIIntLinked;
/**
 * Classe OpsLlistes: classe d'utilitats amb mètodes que usen ListPIIntLinked.
 *
 * @author PRG
 * @version Curs 2019/20
 */
public class OpsLlistes {
    private OpsLlistes() { }
    
    /** Torna una nova llista amb els elements de la intersecció de l1 i l2. 
     *  Precondició: l1 i l2 han d’estar ordenades ascendentment.
     *  @param l1 ListPIIntLinked.
     *  @param l2 ListPIIntLinked.
     *  @return ListPIIntLinked, llista amb punt d'interés intersecció de l1 i l2.
     */
    public static ListPIIntLinked intersectSort(ListPIIntLinked l1, ListPIIntLinked l2) {
        ListPIIntLinked l3 = new ListPIIntLinked();
        /* COMPLETAR */
        l1.begin(); l2.begin();
        while (!l1.isEnd() && !l2.isEnd()) {
            if (!l1.isEnd() && !l2.isEnd()) {
                int x = l1.get(); int y = l2.get();
                if (x == y) {
                    l3.insert(x);
                    l1.next(); l2.next();
                } else if (x > y) { 
                    l2.next(); 
                } else { 
                    l1.next(); 
                } 
                
            }
        }
        return l3;
    }

    /** Torna una nova llista amb els elements de la intersecció de l1 i l2. 
     *  @param l1 ListPIIntLinked.
     *  @param l2 ListPIIntLinked.
     *  @return ListPIIntLinked, llista amb punt d'interés intersecció de l1 i l2.
     */
    public static ListPIIntLinked intersection(ListPIIntLinked l1, ListPIIntLinked l2) {
        ListPIIntLinked l3 = new ListPIIntLinked();
        /* COMPLETAR */
        l1.begin();
        while (!l1.isEnd()) {
            int x = l1.get();
            l2.begin();
            while (!l2.isEnd() && l1.get() != l2.get()) {                
                l2.next();
            }
            if (!l2.isEnd()) { l3.insert(l2.get()); }
            l1.next();
        }
        return l3;
    }
    
    /**
     * Calcula en 12 la unió dels conjunts representats per l1 i l2
     * Precondició l1 i l2 estan ordenats
     *  [1] 3 5 6
     *  [2] 3 4 5 6
     *  
     *  1 2 3 4 5 6
     */
    public static ListPIIntLinked unió(ListPIIntLinked l1, ListPIIntLinked l2) {
        /* COMPLETAR */
        ListPIIntLinked l3 = new ListPIIntLinked();
        while (!l1.isEnd() && !l2.isEnd()) {
            if (l1.get() < l2.get()) {
                l3.insert(l1.get());
                l1.next();
            } else if (l1.get() > l2.get()) {
                l3.insert(l2.get());
                l2.next();
            } else {
                l3.insert(l1.get());
                l1.next();
                l2.next();
            }
        }
        while (!l1.isEnd()) { l1.insert(l1.get()); l1.next(); }
        while (!l2.isEnd()) { l2.insert(l2.get()); l1.next(); }
        return l3;
    }
    
    /**Calcula en l3 la unió dels conjunts representats per l1 i l2
     * Precondició en l1 i l2 no hi ha repetirs
     * // PISTA, l1 i l2 poden modificar-se
     */
    
    public static ListPIIntLinked unió2(ListPIIntLinked l1, ListPIIntLinked l2) {
        ListPIIntLinked l3 = new ListPIIntLinked();
        l1.begin();
        while (!l1.isEnd()) {
            l2.begin();
            while (!l2.isEnd() && l1.get() != l2.get()) {                
                l2.next();
            }
            if (!l2.isEnd()) { l3.insert(l2.remove()); }
            else {l3.insert(l1.get());}
            l1.next();
        }
        l2.begin();
        while (!l2.isEnd()) {
            l3.insert(l2.get());
            l2.next();
        }
        return l3;
    }
    
    /** Elimina de l1 els elements que apareixen en l2.
     *  Precondició: l2 ha d’estar ordenada ascendentment.
     *  @param l1 ListPIIntLinked.
     *  @param l2 ListPIIntLinked.
     */
    public static void dif(ListPIIntLinked l1, ListPIIntLinked l2) {
        /* COMPLETAR */
        l1.begin();
        while(!l1.isEnd()) {
            l2.begin();
            while (!l2.isEnd() && (l2.get() < l1.get())) {
                l2.next();
            }
            if (l2.isEnd() || l2.get() > l1.get()) { l1.next(); }
            else { l1.remove(); }                       
        }                
    }

    /** Torna la mescla natural de l1 i l2.
     *  Precondició: l1 i l2 han d’estar ordenades ascendentment.
     *  @param l1 ListPIIntLinked.
     *  @param l2 ListPIIntLinked.
     *  @return ListPIIntLinked, llista amb punt d'interés mescla de l1 i l2.
     */
    public static ListPIIntLinked merge(ListPIIntLinked l1, ListPIIntLinked l2) { 
        ListPIIntLinked l3 = new ListPIIntLinked();
        l1.begin(); l2.begin(); 
        
        // COMPLETAR: bucle que compara els elements de l1 i l2 i els trasllada de
        // manera ordenada a l3. Acaba en arribar al final d'una de les llistes
            
        // COMPLETAR: bucle que trasllada a l3 els elements restants de l1
        
        // COMPLETAR: bucle que trasllada a l3 els elements restants de l2           
    
        return l3;
    }

    /** Comprova si els elements de l1 apareixen en l2 en el mateix ordre,
     *  encara que no necessàriament consecutius. És a dir, si l1 està immersa en l2.
     *  @param l1 ListPIIntLinked.
     *  @param l2 ListPIIntLinked.
     *  @return boolean, true si l1 està immersa en l2 o, en cas contrari, false.
     */ 
    public static boolean immersa(ListPIIntLinked l1, ListPIIntLinked l2) {
        l1.begin(); l2.begin(); 
        int cont1 = l1.size(), cont2 = l2.size(), cont = 0;
        // COMPLETAR: bucle que, passada a passada, avance en l2, o en l1 i l2.
        // Acaba en arribar al final d'una de les llistes o si el número d'elements
        // que queden per revisar en l2 és menor que el d'elements de l1 que falten
        // per trobar en l2
        while (cont1 <= cont2 && !l1.isEnd() && !l2.isEnd()) {
            if (l1.get() == l2.get()) { 
                l1.next(); cont1--; 
            }
            l2.next(); cont2--; // l2 avança sempre
        }
      
        
        
        return l1.isEnd(); 
    }
}
