package fitxersText;

import java.io.File;
/**
 *  Mostra informacio basica sobre un fitxer (nom, directori i tamany en kbytes).
 *  S'executa invocant main amb un parametre que es la ruta relativa del fitxer.
 *  Per exemple, el nom relatiu d'aquest fitxer es fitxersText/InfoFile.java.
 *  @author PRG
 *  @version Curs 2019/20
 */ 
public class InfoFile {
    private InfoFile() { }
    
    public static void main(String[] args) { 
        if (args.length != 1) { 
            System.err.println("Especifica el nom d'un fitxer");    
        }
        else {      
            String filePath = args[0];      
            File f = new File(filePath); /* COMPLETAR - crear el File de filePath */;
            if (f.isFile()) {
                System.out.println("Nom del fitxer: " + f.getName()/* COMPLETAR */);
                System.out.println("Directori: " + f.getParent() /* COMPLETAR */);
                System.out.println("Tamany (kbytes): " + f.length() /* COMPLETAR */);  
                System.out.println("Ruta absoluta: " + f.getPath() /* COMPLETAR */);
            }     
        }   
    }
}