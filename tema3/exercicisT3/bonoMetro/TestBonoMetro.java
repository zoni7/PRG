package tema3.exercicisT3.bonoMetro;


/**
 * Classe TestBonoMetro - permet comprovar la funcionalitat
 * de la classe BonoMetro.
 * 
 * @author PRG 
 * @version Curs 2019/20
 */
public class TestBonoMetro {
    /** No hi ha objectes d'aquesta classe. */
    private TestBonoMetro() { }
    
    public static void main(String[] args) {
        // Es crea un BonoMetro amb 3 viatges i es pica 4 vegades
        BonoMetro b = new BonoMetro(3);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Picant el viatge #" + i);
            // COMPLETAR: Crida al mètode picar
            try{
                b.picar();
            } catch (SaldoEsgotatException e) {
                
            } finally {
            b.recarregar(10);
            } 
        }
    }    
}