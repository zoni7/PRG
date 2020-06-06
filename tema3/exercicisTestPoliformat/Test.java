package tema3.exercicisTestPoliformat;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *  Classe Test: lectura d'un enter i divisió.
 *  @author Joan Matarredona Coloma
 *  @version Curs 2019/20
 */
public class Test {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean eixir;
        do {
            try {
                System.out.print("Introdueix un enter: ");
                int valor = tec.nextInt();
                System.out.println("Divisió: " + 5 / valor);
                eixir = true;
            } catch (InputMismatchException e) {
                System.out.println("Atenció: no és un enter");
                eixir = false;
            } catch (ArithmeticException e) {
                System.out.println("Atenció: no es pot dividir per 0");
                eixir = false;
            } finally {
                tec.nextLine();
            }
        } while (!eixir);
    }
}
