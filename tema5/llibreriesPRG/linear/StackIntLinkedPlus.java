package linear;

/**
 * Classe que afegeix funcionalitat a StackIntLinked.
 *
 * @author PRG
 * @version Curs 2019/20
 */
public class StackIntLinkedPlus extends StackIntLinked {    
    /**
     * Crea una StackIntLinkedPlus buida
     */    
    public StackIntLinkedPlus() { super(); }

    /**
     * Afegeix la dada d en la base de la pila, deixant la resta
     * d'elements ordenats com estaven inicialment.
     * Versió iterativa.
     * @param d int dada a afegir en la base
     */
    public void insertBaseIter(int d) {
        StackIntLinked aux = new StackIntLinked();
        while (!this.empty()) { aux.push(this.pop()); }
        this.push(d);
        while (!aux.empty()) { this.push(aux.pop()); }
    }
    
    /**
     * Afegeix la dada d en la base de la pila, deixant la resta
     * d'elements ordenats com estaven inicialment.
     * Versió recursiva.
     * @param d int dada a afegir en la base
     */
    public void insertBaseRec(int d) {
        if (this.empty()) { this.push(d); }
        else {
            int x = this.pop();
            this.insertBaseRec(d);
            this.push(x);
        }
    }
    
    /** 
     * Comprova si una pila p es sombrero de la actual,
     * és a dir, si els elements de p apareixen en la part
     * de dalt de this i empilats en el mateix ordre.
     * Precondició: p.size() <= this.size().
     */
    public boolean esSombrero(StackIntLinked p) {
        /*
        if (p.size() == 0) { return true; }
        else {
        
        }
        */
        StackIntLinked aux = new StackIntLinked();
        boolean res = false;
        while (!p.empty() && (res = p.peek() == this.peek())) {
            aux.push(p.pop());
            this.pop();
        }
        while (!aux.empty()) { // es torna a deixar els elements on estaven
            p.push(aux.peek());
            this.push(aux.pop());
        }
        return res;
    }
    
    /** 
     * Esborra la dada de la base de la pila actual, deixant 
     * la resta d'elements ordenats com estaven inicialment.
     * Si la pila està buida no fa res.
     */
    public void esborrarBase() {
        // versió recursiva
        
        if (this.size() == 1) { this.pop();}
        else if (!this.empty()) {
            int x = this.pop();
            this.esborrarBase();
            this.push(x);
        }
        
        // versió interativa
        /*
        StackIntLinked aux = new StackIntLinked();
        while (!this.size()>1) { aux.push(this.pop());}
        if (!this.empty()) { this.pop(d); }
        while (!aux.empty()) { this.push(aux.pop()); }
        */
        
    }
    
    /** 
     * Suma les dades de la pila actual
     */
    public int sumarPila() {
        //COMPLETAR crec que està bé falta vorer solució
        int suma = 0;        
        while (!this.empty()) {
            suma =+ this.pop();                        
        }        
        return suma;
    }
    
    /** 
     * Canvia el signe de les dades de la pila actual
     */
    public void canviarSigne() {
        //COMPLETAR crec que està bé falta vorer solució
        StackIntLinked aux = new StackIntLinked();
        
        // helps an auxiliary stack
        while (!this.empty()) {
            aux.push(this.pop() * -1);            
        }
        // values come back to the original stack
        while (!aux.empty()) {
            this.push(aux.pop());            
        }
        
    }
}
