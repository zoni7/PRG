package linear;

import java.util.NoSuchElementException;
/**
 * QueueIntLinked: Implementació enllaçada de l'estructura de dades 
 * lineal Cua d'enters.
 * 
 * @author PRG
 * @version Curs 2019/20
 */
public class QueueIntLinked {
    private NodeInt first, last; // referència al primer i últim elements 
                                 // de la cua (punts d'accés a la cua)
    private int size;            // número d'elements de la cua

    /**
     * Crea una cua buida.
     */
    public QueueIntLinked() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Encua un nou element en la cua.
     * @param x, int a afegir en la cua actual.
     */
    public void add(int x) {
        NodeInt nou = new NodeInt(x);
        if (last != null) { last.next = nou; }
        else { first = nou; }
        last = nou;
        size++;
    }

    /**
     * Torna i desencua el first de la cua.
     * @throws NoSuchElementException si la cua està buida.
     * @return int, dada de l'element first desencuat de la cua actual.
     */
    public int remove() {
        if (size == 0) { 
            throw new NoSuchElementException("Empty queue");
        }
        int x = first.data;
        first = first.next;
        if (first == null) { last = null; }
        size--;
        return x;
    }
    
    /**
     * Torna la data de l'element first de la cua actual.
     * @throws NoSuchElementException si la cua está buida.
     * @return int, dada de l'element first de la cua actual.
     */
    public int element() { 
        if (size == 0) { 
            throw new NoSuchElementException("Empty queue");
        }
        return first.data; 
    }

    /**
     * Comprova si la cua actual està o no buida.
     * @return boolean, true si la cua està buida i false en cas contrari.
     */
    public boolean empty() { return (first == null); }
    
    /**
     * Torna el número d'elements de la cua actual.
     * @return int, número d'elements de la cua actual.
     */
    public int size() { return size; }
    
    /**
     * Comprova si la cua actual és igual o no a una cua donada.
     * @param o Object que representa la cua a comparar.
     * @return boolean, true si són iguals i false en cas contrari.
     */
    public boolean equals(Object o) {
        boolean igual = false;
        if (o instanceof QueueIntLinked) {
            if (size == ((QueueIntLinked) o).size) { 
                NodeInt p = first, aux = ((QueueIntLinked) o).first;
                while (p != null && p.data == aux.data) {
                    p = p.next;
                    aux = aux.next;
                }
                if (p == null) { igual = true; }
            }
        }
        return igual;
    }
        
    /**
     * Torna una String formada pels valors de la cua actual.
     * @return String amb les dades de la cua.
     */
    public String toString() {
        String s = "";
        NodeInt p = first;
        while (p != null) {
            s += String.format("%4d", p.data);
            p = p.next;
        }
        return s;
    } 
    
    /**
     * P2. Curs 18/19:3.5 punts 
     *  Es demana: afegir un mètode a la classe QueueIntLinked amb perfil: public void split(int x) tal  que,
     *    donat  un  enter x,  cerque  la  primera  ocurrència  de  l’element x en  la  cua  i  el  substituısca
     *    pel  parell d’elements x / 2 i x / 2 + x % 2, un a continuacio de l’altre.  Si x no apareix, la cua 
     *    no ha de canviar. Per exemple, si s’invoca al mètodeq. split(9) sent q la cua de longitud 6:
     *        <- 1 -2  9  8 -3  5 <-,  llavors q passa a ser la cua de longitud 7  <- 1 -2 4 5 8 -3 5 <-.
     *  IMPORTANT:En la solució només es pot accedir als atributs de la classe, quedant prohibit accedir 
     *    als seus mètodes
     */
    public void split(int x) {
        // COMPLETAR
        NodeInt p = first;
        while (p != null && p.data != x) {
            p = p.next;
    }
    if (p != null) {
        p.data = x/2;
        p.next = new NodeInt(x/2 + x% 2, p.next);
        if (p == last) { last = p.next; }
        size++;
    }
    }
    
    /** RecP2 Curs 17/18: 2.5 punts
     * Es demana: implementar en la classe QueueIntLinked un mètode d'instància que 
     *   divideixca una cua en dues mitats, amb perfil public QueueIntLinked divideQueue().
     *   Tot i tenint en compte que:
     *  - Precondició: la cua inicial (this) té al menys dos elements. 
     *  - La divisió es realitza de forma que la cua inicial es queda amb la
     *    primera meitat dels elements, i es retorna una cua amb la resta d’elements.
     *  - Les cues resultants mantenen l’ordre dels elements en la cua inicial. 
     *  - Si la cua inicial té una quantitat senar d’elements, serà la cua retornada 
     *    la que tindrà una longitud superior en una unitat.
     *  IMPORTANT:En la solució només es pot accedir als atributs de la classe, quedant prohibit accedir 
     *    als seus mètodes
     */
    public QueueIntLinked divideQueue() {
        QueueIntLinked res = new QueueIntLinked();
        //COMPLETAR
        return res;
    }
    
    // parcial 2 2018/2019
    public void split2(int x) {
        NodeInt i = first;
        while (i != null && i.data != x) {
            i = i.next;
        }
        if (i != null) {
            i.data = x/2;
            i.next = new NodeInt((x/2 + x % 2), i.next);
            if (i == this.last) { this.last = i.next; }
            this.size++;
        }
    }
   
}
