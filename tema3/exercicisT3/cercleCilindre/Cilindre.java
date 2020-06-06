package tema3.exercicisT3.cercleCilindre;

/**
 * Classe Cilindre - Descripcio d'un cilindre
 * 
 * @author PRG
 * @version Curs 2019/20
 */
public class Cilindre extends Cercle {  
    private double altura;

    /**
     * Crea un nou Cilindre donats el seu color, el radi de la seua base 
     * i la seua altura.
     * @param color String que representa el color.
     * @param radiBase double que representa el radi de la base.
     * @param alt double que representa l'altura.
     */
    public Cilindre(String color, double radiBase, double alt) {
        // Opcio a) 
        super(radiBase, color);
        super.tipus = "Cilindre";
        altura = alt;        
        
        // Opcio b) Aquesta no funciona sempre però ja em modificat
        //          els parametres per a que vaja
        //super.color = color;
        //super.radi = radiBase;
        //super.tipus = "Cilindre";
        //altura = alt;
    }
       
    /**
     * Torna l'altura del Cilindre actual.
     * @return double, l'altura.
     */
    public double getAltura() { return this.altura; }
    
    /**
     * Actualitza l'altura del Cilindre actual.
     * @param a double que representa la nova altura.
     */
    public void setAltura(double a) { this.altura = a; }
    
    /**
     * Torna l'area del Cilindre actual.
     * @return double, l'area.
     */
    public double getArea() {             
        return 2 * Math.PI * this.getRadi() * this.getRadi()
            + 2 * Math.PI * this.getRadi() * altura; 
    }
    
    /**
     * Torna el volum del Cilindre actual.
     * @return double, el volum.
     */
    public double getVolum() {         
        return Math.PI * this.getRadi() * this.getRadi() * altura; 
    }
    
    /**
     * Torna un String amb les dades del Cilindre actual.
     * @return String.
     */
    public String toString() {
        return tipus + " de color " + color + " i radi: " + this.getRadi()
            + " i altura: " + altura;     
    }      
}