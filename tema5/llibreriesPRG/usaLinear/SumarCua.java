package usaLinear;

import linear.QueueIntLinked;
import java.util.NoSuchElementException;
/** 
 *  Programa que crea una cua d'enters i suma les seues dades.
 *  
 *  @author PRG
 *  @version Curs 2019/20
 */
public class SumarCua {
    private SumarCua() { }
    
    public static void main(String[] args) {
        // 1.- Crea una cua amb les dades 1, 6, 7, 8, -1, -7, -6
        QueueIntLinked q = new QueueIntLinked();
        q.add(1); q.add(6); q.add(7); q.add(8); 
        q.add(-1); q.add(-7); q.add(-6);    
        
        // 2.- Guarda en la variable suma la suma dels seus elements
        int suma = sumar(q);
        
        // 3.- Mostra per pantalla el contingut de la cua i la suma dels seus elements
        System.out.println(q);       
        System.out.println("Suma: " + suma);
    }
    
    /**
     * VERSIÓ 1: usant una cua auxiliar.
     */ 
    private static int sumar(QueueIntLinked q) {
        int sum = 0;
        // COMPLETAR
        QueueIntLinked aux = new QueueIntLinked();
        while (!q.empty()) { sum = q.element(); aux.add(q.remove()); }
        while (!aux.empty()) { q.add(aux.remove()); }
        return sum;
    }   
    
    /**
     * VERSIÓ 2: No és precís usar una cua auxiliar. Si la cua té n elements, 
     * només cal desencuar n vegades l'element en cap i tornar-lo a encuar.
     */
    private static int sumar2(QueueIntLinked q) {
        int sum = 0;
        int n = q.size();
        // COMPLETAR menudo hack
        for (int i = 0; i < n; i++) { 
            sum = q.element(); q.add(q.remove()); // va afegint i llevant a l'hora}
            
        }
        return sum;
    }
    
    public static QueueIntLinked fusionCues(QueueIntLinked q1, QueueIntLinked q2) {
        QueueIntLinked res = new QueueIntLinked();
        QueueIntLinked aux_q1 = new QueueIntLinked();
        QueueIntLinked aux_q2 = new QueueIntLinked();
        while (!q1.empty() || !q2.empty()) {
            if (!q1.empty()) {
                aux_q1.add(q1.element());
                res.add(q1.remove());
            }
            if (!q2.empty()) {
                aux_q2.add(q2.element());
                res.add(q2.remove());
            }
        }
        while (!aux_q1.empty() || !aux_q2.empty()) {
            if (!aux_q1.empty()) {
                q1.add(aux_q1.remove());
            }
            if (!aux_q2.empty()) {
                q2.add(aux_q2.remove());
            }
        }
        return res;
    } 
    
    public static int tornaElGran(QueueIntLinked c) {
        int maxim = 0;
        
        if (c.empty()) { throw new NoSuchElementException("Cua buida: màxim no definit"); }
        while (!c.empty()) {
            if(c.element() > maxim) { maxim = c.element(); }
            c.add(c.remove());
        }
        return maxim;
    }
}
