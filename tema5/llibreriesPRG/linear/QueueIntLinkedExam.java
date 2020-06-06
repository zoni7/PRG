package linear;

/**
 * Clase QueueIntLinkedExam.
 *
 * @author PRG - Parcial 2
 * @version Curso 2019/20
 */
public class QueueIntLinkedExam {
    private NodeInt first, last; 
    private int size;  

    /** Crea una cola vacia. */
    public QueueIntLinkedExam() {
        first = null;
        last = null;
        size = 0;
    }
    
    /** Cambia la primera ocurrencia de x en la cola por el elemento 
     *   x / 2 seguido de x / 2 + x % 2.
     */
    public void split(int x) {
        // COMPLETAR
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
