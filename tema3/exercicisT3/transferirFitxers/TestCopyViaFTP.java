package tema3.exercicisT3.transferirFitxers;

/**
 * Classe TestCopyViaFTP - permet fer la transferencia 
 * del fitxer /tmp/data a la màquina fileserver.upv.es. 
 * En cas d’error, l'operació s'haurà de reintentar un màxim 
 * de 3 vegades i indicar a l'usuari el número d'intent.
 * @author PRG 
 * @version Curs 2019/20
 */
public class TestCopyViaFTP {
    /** No hi ha objectes d'aquesta classe. */
    private TestCopyViaFTP() { }
    
    public static void main(String[] args) {
        String hostName = "fileserver.upv.es";
        String localFilePath = "/tmp/data";
        
        System.out.println("Transferencia de " + localFilePath
                    + " a la maquina " + hostName);
        CopyViaFTP.copyTo(hostName, localFilePath); 
        System.out.println("Transferencia feta");
        
    }
}