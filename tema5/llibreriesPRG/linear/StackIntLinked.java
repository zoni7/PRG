package linear;

import java.util.NoSuchElementException;
/**
 * StackIntLinked: Implementació enllaçada de l'estructura de dades 
 * lineal Pila d'enters.
 * 
 * @author PRG
 * @version Curs 2019/20
 */
public class StackIntLinked {
    private NodeInt top;  // referència al top de la pila (punt d'accés)
    private int size;     // número d'elements de la pila

    /**
     * Crea una pila buida.
     */
    public StackIntLinked() {
        top = null;
        size = 0;
    }
    
    public StackIntLinked(StackIntLinked p) {
        if (p.top != null) {
            NodeInt last = null;
            NodeInt aux = p.top;
            top = new NodeInt(aux.data);
            last = top;
            aux = aux.next;
            for (int i = 0; i < p.size; i++) {
                last.next = new NodeInt(aux.data);
                last = last.next;
                aux = aux.next;
            }
            size = p.size;
        }
    }

    /**
     * Empila un nou element en la pila. 
     * @param x, int a empilar en la pila actual.
     */
    public void push(int x) {
        top = new NodeInt(x, top);
        size++;
    }

    /**
     * Torna i desempila el top de la pila.
     * @throws NoSuchElementException si la pila està buida.
     * @return int, dada de l'element top desempilat de la pila actual.
     */
    public int pop() {
        if (top == null) {
            throw new NoSuchElementException("Empty stack");
        }
        int x = top.data;
        top = top.next;
        size--;
        return x;
    }

    /**
     * Torna la dada de l'element top de la pila actual.
     * @throws NoSuchElementException si la pila està buida. 
     * @return int, dada de l'element top de la pila actual.
     */
    public int peek() { 
        if (top == null) { 
            throw new NoSuchElementException("Empty stack");
        }
        return top.data; 
    }

    /**
     * Comprova si la pila actual està o no buida. 
     * @return boolean, true si la pila està buida i false en cas contrari.
     */
    public boolean empty() { 
        return (top == null);  // o return (size == 0);
    }
    
    /**
     * Torna el número d'elements de la pila actual.
     * @return int, número d'elements de la pila actual.
     */
    public int size() { return size; }
    
    /**
     * Comprova si la pila actual és igual o no a una pila donada.
     * @param o Object que representa la pila a comparar.
     * @return boolean, true si són iguals i false en cas contrari.
     */
    public boolean equals(Object o) {
        boolean igual = false;
        if (o instanceof StackIntLinked) {
            StackIntLinked p = (StackIntLinked) o;
            if (this.size != p.size) { return false; }
            else {               
                NodeInt a = this.top; 
                NodeInt b = p.top;
                while (a != null && a.data == b.data) { 
                    a = a.next;
                    b = b.next;
                } 
                igual = a == null;
            }         
        }
        return igual;
    }
    
    /**
     * Torna una String formada pels valors de la pila actual.
     * @return String amb les dades de la pila.
     */
    public String toString() {
        String res = "";
        for (NodeInt i = top; i != null; i = i.next) {
            res += i.data + "\n";
        }
        return res;
    }
    
    /** EXERCICI: Intercanvia els elements del cim i de la base de la pila.
     *  Si la pila està buida o té un element, no canvia.
     */
    public void topBase() {
        if (this.size > 1) {
            NodeInt aux = top;
            int x = aux.data;
            // Cerca del darrer element (node on aux.next és null):
            while (aux.next != null) { aux = aux.next; }
            // en acabar el bucle, aux != null
            // Actualitzar la dada de top (1)
            top.data = aux.data;
            //Actualitzar la dada de aux (2)
            aux.data = x;
        }
    }
    
    
}
