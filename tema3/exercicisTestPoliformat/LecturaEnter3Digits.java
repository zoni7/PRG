package tema3.exercicisTestPoliformat;

import java.util.Scanner;
/**
 *  Classe LecturaEnter3Digits: lectura d'un enter de 3 dígits.
 *  @author  Joan Matarredona Comloma
 *  @version Curs 2019/20
 */
public class LecturaEnter3Digits {
    /**
     * Llig des d'un Scanner i torna un valor enter en l'interval [lInf..lSup].
     * @param t Scanner per a lectura des de teclat.
     * @param m String per a petició de valor.
     * @param lInf int que indica el límit inferior de l'interval de lectura.
     * @param lSup int que indica el límit superior de l'interval de lectura. 
     * @return int, enter llegit en l'interval [lInf..lSup].
     */
    public static int llegirInt(Scanner t, String m, int lInf, int lSup)
    throws IllegalArgumentException {
        System.out.print(m);
        int res = t.nextInt();
        if (res < 100 || res > 999) {
            throw new IllegalArgumentException("numero" + res);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in); 
        boolean eixir;
        do{
            try{
                int num = llegirInt(tec, "Introdueix un número de 3 dígits: ", 
                                    100, 999);
                System.out.println("El número llegit és: " + num);
                eixir = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ": Error: no estas en el rang");
                eixir = false;
            } finally {
                tec.nextLine();                
            }
        } while (!eixir);
    }
}


