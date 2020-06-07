package pract5;
/**
 * Clase OtherPolygonGroup: similar a la clase realizada en la practica
 * Grupo de poligonos en el plano.
 * Los poligonos estan en orden segun la secuencia en que se anyaden
 * al grupo, de manera que se considera que cada poligono esta mas 
 * arriba en el grupo que los poligonos anteriores, o dicho de otro 
 * modo, se superpone a los anteriores. 
 * Se supone que el orden del grupo da la secuencia en que se dibujan
 * los poligonos, de manera que cada uno se dibuja por encima de los
 * anteriores, superponiendose a aquellos con los que solape.
 *  
 * La manera de seleccionar un poligono es dando un punto visible 
 * del poligono, es decir, dando un punto que no pertenezca
 * a los poligonos que aparecen superpuestos en el dibujo.
 *
 * @author PRG
 * @version Curso 2019-20
 */
public class OtherPolygonGroup {
    private NodePol front, back;
    private int size;

    /** Crea un grupo de 0 poligonos. */
    public OtherPolygonGroup() {
        front = null;
        back = null;
        size = 0;
    }

    /** Devuelve el numero de poligonos del grupo,  
     *  esto es, la talla del grupo.
     *  return int, la talla.
     */
    public int getSize() { return size; }
	
    /** Devuelve la referencia al nodo con el poligono  
     *  del frente del grupo.
     *  return NodePol, nodo con el poligono del frente.
     */
    public NodePol getFront() { return front; }
	
    /** Devuelve la referencia al nodo con el poligono 
     *  del fondo del grupo.
     *  return NodePol, nodo con el poligono del fondo.
     */
    public NodePol getBack() { return back; }

    /** Anyade al grupo, arriba del todo, un poligono dado. 
     *  @param pol Polygon, el poligono.
     */
    public void add(Polygon pol) {  
        // COMPLETAR
        if (size == 0) { 
            front = new NodePol(pol);
            back = front;          
        }
        else {
            front = new NodePol(pol, front);            
        }
        size++;
    }
    
    /** Devuelve un array con la secuencia de poligonos del grupo, 
     *  por orden desde el de mas abajo al de mas arriba.
     *  @return Polygon[], el array.
     */
    public Polygon[] toArray() {
        Polygon[] result = new Polygon[size];
        NodePol aux = front;
        for (int i = size - 1; i >= 0; i--) {           
            result[i] = aux.data;
            aux = aux.next;
        }
        return result;
    } 
}
