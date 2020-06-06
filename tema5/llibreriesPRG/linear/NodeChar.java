package linear;

/**
 * Classe NodeChar: Representació d'una estructura que associa 
 * una dada (de tipus Char) i l'enllaç a la dada següent.
 * 
 * @author PRG
 * @version Curs 2019/20
 */
class NodeChar {
    char data;        // dada del node
    NodeChar next;    // enllaç al següent node
    
    /** Constructor A: crea un node amb una dada d i que no té següent. 
     *  @param d Char que representa la dada del nou node.
     */ 
    NodeChar(char d) { 
        this(d, null);
    } 
    
    /** Constructor B: crea un node amb una dada d, enllaçat a un node 
     *  preexistent s. 
     *  @param d Char que representa la dada del nou node.
     *  @param s NodeChar amb el qual enllaçar el nou node.
     */ 
    NodeChar(char d, NodeChar s) { 
        data = d; 
        next = s; 
    }   
}
