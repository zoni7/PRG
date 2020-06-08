package linear;

/**
 * Clase QueueIntLinkedExam: implementaciÃ³n enlazada de la estructura 
 * de datos lineal Cola de enteros.
 *
 * @author PRG - Parcial 2
 * @version Curso 2019/20
 */
public class QueueIntLinkedExam {
    private NodeInt first, last; 
    private int size;  

    /** Crea una cola vacÃ­a. */
    public QueueIntLinkedExam() {
        first = null;
        last = null;
        size = 0;
    }
    
    /** Elimina de la cola todos los elementos menores que x.
     *  PrecondiciÃ³n: los datos de la cola estÃ¡n en orden creciente.
     */
    public void removeLessThanInOrd(int x) {
        // COMPLETAR
        int cont = 0; 
        NodeInt aux = first;
        NodeInt ant = null;
        while(aux != null && aux.data < x) {
            ant = aux;
            aux = aux.next;
            cont++;
        }
        if (aux != null) { // Caso si es el primero o si x está por el medio de la cola            
            first = aux;
            size = size - cont;
        } else { // Si x es mayor que todos los elementos de la cola
            first = null;
            last = null;
            size = 0;
        }
    }
}