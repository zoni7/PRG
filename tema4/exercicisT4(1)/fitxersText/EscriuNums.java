package fitxersText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Escriu en un fitxer de text (test1.txt) els numeros de l'1 al 999.  
 * @author PRG
 * @version Curs 2019/20
 */ 
public class EscriuNums {
    private EscriuNums() { }
    
    public static void main(String[] args) {
        String fitxer = "fitxersText/test1.txt";
        try {
            System.out.println("Escrivint fitxer " + fitxer);
            PrintWriter pw = new PrintWriter(new File(fitxer)); /* COMPLETAR - crear el PrintWriter de fitxer */;
            for (int i = 1; i < 1000; i++) { 
                pw.printf( "%03d\n", i);/* COMPLETAR - Escriure en pw */ 
            }
            pw.close(); /* COMPLETAR - Tancar pw*/
        } catch (FileNotFoundException ex) {
            System.err.println("Problemes en obrir el fitxer " 
                + fitxer + ". Rao: " + ex.getMessage());
        }  
    }    
}
