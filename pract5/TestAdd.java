package pract5;

import graph2D.Graph2D;
import java.awt.Color;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Clase programa para facilitar la prueba del codigo desarrollado por el alumno 
 * para el metodo add. El main crea inicialmente una secuencia vacia y se realizan tres pruebas:
 * 1.- Llamar al metodo add sobre la secuencia vacia para añadir un cuadrado gris.
 *     Vemos la secuencia con un cuadrado: Gris.
 * 2.- Llamar al metodo add para añadir un cuadrado verde en el frente. 
 *     Ahora veremos la secuencia Gris -> Verde.
 * 3.- Llamar al metodo add para añadir un cuadrado Rojo en el frente. 
 *     Ahora veremos la secuencia Gris -> Verde -> Rojo.
 *     
 * Esta clase es para uso particular del alumno. 
 * No se entrega.
 *
 * @author PRG
 * @version Curso 2019-20
 */
public class TestAdd {
    private TestAdd() { } // No se usan objetos de esta clase
    
    public static void main(String[] args)  {
        Scanner keyB = new Scanner(System.in);
        Graph2D gd = new Graph2D(-20, 20, -20, 20, 600, 400, Color.WHITE, "Test add");
        // Crea un grupo de poligonos vacio
        OtherPolygonGroup g = new OtherPolygonGroup();      
        drawGroup(gd, g);
        System.out.println("Tienes que ver la ventana vacia, sin ninguna figura.");
        System.out.println("Pulsa INTRO para continuar..."); 
        String s = keyB.nextLine();
        
        //----- Prueba 1 ----
        System.out.println("** Test 1: anyadir un cuadrado gris...");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        // Coordenadas de las esquinas del cuadrado gris   
        double[] x0 = {-8.0, -8.0, 0.0, 0.0};
        double[] y0 = {-8.0, 0.0, 0.0, -8.0};
        Polygon pol0 = new Polygon(x0, y0);
        pol0.setColor(Color.GRAY);
        g.add(pol0);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el grupo tiene solo el cuadrado gris.");        
        System.out.println("    Secuencia: Gris.");
        boolean okFront = g.getFront() != null && equals(g.getFront().data, pol0);
        boolean okBack = g.getBack() != null && equals(g.getBack().data, pol0);
        if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        //----- Prueba 2 ----
        System.out.println("** Test 2: anyadir un cuadrado verde...");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        // Coordenadas de las esquinas del cuadrado verde
        double[] x1 = {-4.0, -4.0, 4.0, 4.0};
        double[] y1 = {-4.0, 4.0, 4.0, -4.0};
        Polygon pol1 = new Polygon(x1, y1);
        pol1.setColor(Color.GREEN);
        g.add(pol1);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el grupo tiene el cuadrado verde."); 
        System.out.println("    Secuencia: Gris -> Verde.");  
        okFront = g.getFront() != null && equals(g.getFront().data, pol1);
        okBack = g.getBack() != null && equals(g.getBack().data, pol0);
        if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        //----- Prueba 3 ----
        System.out.println("** Test 3: anyadir un cuadrado rojo...");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        // Coordenadas de las esquinas del cuadrado rojo
        double[] x2 = {0.0, 0.0, 8.0, 8.0};
        double[] y2 = {0.0, 8.0, 8.0, 0.0};
        Polygon pol2 = new Polygon(x2, y2);
        pol2.setColor(Color.RED);
        g.add(pol2);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el grupo tiene el cuadrado rojo."); 
        System.out.println("    Secuencia: Gris -> Verde -> Rojo."); 
        okFront = g.getFront() != null && equals(g.getFront().data, pol2);
        okBack = g.getBack() != null && equals(g.getBack().data, pol0);
        if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        System.out.println("Fin del proceso!!!");
    }
    
    /** 
     * Muestra en la salida grafica un grupo de poligonos dado.
     * @param gd Graph2D, el grafo.
     * @param p PolygonGroup, el grupo de poligonos.
     */
    private static void drawGroup(Graph2D gd, OtherPolygonGroup g) {        
        gd.clear(); 
        Polygon[] aPol = g.toArray();
        for (int i = 0; i < aPol.length; i++) {
            gd.fillPolygon(aPol[i].verticesX(), aPol[i].verticesY(),
                aPol[i].getColor(), 2);   
        }   
        
    }
   
    /** Comprueba si dos poligonos son iguales.
     *  @param p Polygon.
     *  @param q Polygoon.
     *  @return boolean, true si son iguales; en caso contrario, false. 
     */
    private static boolean equals(Polygon p, Polygon q) {
        return p != null && q != null 
            && p.getColor().equals(q.getColor())
            && Arrays.equals(p.verticesX(), q.verticesX())
            && Arrays.equals(p.verticesY(), q.verticesY());
    }
}
