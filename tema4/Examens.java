package tema4;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class Examens here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examens
{
    public static void sumInt(String fileIn, String fileOut) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileIn));
        PrintWriter out = new PrintWriter(new File(fileOut));
        int suma = 0;
        while(in.hasNext()) {
            try{
                int aux = in.nextInt();
                out.println(aux);
                suma += aux;
            } catch (InputMismatchException e) {
                out.println("Error: token incorrecte" + in.next());
            
            }
        }
        out.println(suma);
        in.close();
        out.close();
    }
    
    public static void filtraErrors(String fileIn , String fileOut) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileIn));
        PrintWriter out = new PrintWriter(new File(fileOut));
        int cont = 1;
        while(in.hasNextLine()) {
            String s = in.nextLine();
            String[] tokens = s.split("([\t])+ ");
            if (tokens.length != 4) {
                out.println("error línia" +  cont + ": Incorrecte el nombre de dades");            
            } else {
                try{
                    int edat, punts, campionats;
                    edat = Integer.parseInt(tokens[1]);
                    punts = Integer.parseInt(tokens[2]);
                    campionats = Integer.parseInt(tokens[3]);
                    if (edat < 0 || punts < 0 || campionats < 0) {
                        out.println("Error línea" + cont + ": Valor negatiu. ");
                    }
                } catch (NumberFormatException e) {
                    out.println("Error de línea" + cont + "Format d'enter no vàlid.");
                }
            }
            cont++;
        }
        in.close();
        out.close();
    }
    
    // 17/18
    public static File fromArrayToTextFile(int[] a) {
        File res = new File("ArrayElements.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("ArrayElements.txt"));
            for(int i = 0; i < a.length; i++ ){
                pw.println(a[i]);
            }
           
        } catch (FileNotFoundException e) {
            System.err.print("Error en obrir" + res);
        
        } finally { if (pw != null)  pw.close(); }                
        return res;
    
    }
    
    public static void fitxerNou(String ftx) {
        File dades = new File(ftx);
        File res = new File(ftx + "_nou");
        
        PrintWriter pw = null;
        Scanner in = null;
        try {
            in = new Scanner(dades);
            pw = new PrintWriter(res);
                while (in.hasNext()) {
                    try { pw.println(in.nextDouble()); }
                    catch (InputMismatchException e) { ; }
                    finally { in.nextLine(); }
                }
        
        } catch (FileNotFoundException e) {
            System.err.print("Error en obrir" + ftx);            
        } finally { 
            if (pw != null) {
                pw.close(); 
            }
            if (in != null) {
                in.close();
            }
        }
    
    }
    // 16/17
    public static int lligISuma(String nomFitxer) {
        int suma = 0;
        Scanner in = null;
        File dades = new File (nomFitxer);
        try {
            in = new Scanner(dades);//.useLocale(Locale.US) Hi ha que importar
            while (in.hasNextLine()) {
                String l = in.nextLine();
                    String[] tokens = l.split(" ");
                                  
                for (int i = 0; i < l.length(); i++) {
                    try {
                        suma += Integer.parseInt(tokens[i]);
                    } 
                    catch (InputMismatchException e) { System.err.println("Error: " + tokens[i]);}
                }                                                
            }
            
        } catch (FileNotFoundException e) {
        
        } finally {if (in != null)  in.close();}
        return suma;
    }
    
    public static void corregirFitxer() {
        File data = new File("valors.txt");
        File correctData = new File("valors.txt_nou");
        
        PrintWriter out = null;
        Scanner in = null;
        
        try{
            in = new Scanner(data);//.useLocale(Locale.US);
            out = new PrintWriter(correctData);
            
            while(in.hasNextLine()) {
                try{
                    out.println(in.nextDouble());
            
                } catch (InputMismatchException e) {
                    
                } finally { in.nextLine(); }
            }
        } catch (FileNotFoundException e) {
            
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
        
        
    }
    
    public static int sum(String s) throws FileNotFoundException {
        int suma = 0;
        File f = new File(s);
        Scanner in = new Scanner(f);
        
        while (in.hasNextLine()) {
            try {
                suma += in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e + "::" + in.nextLine());
            }
        }
        in.close();
        return suma;
    }
    
    public static void escriureAmbMajuscules(String nomF1) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomF1));
        while(in.hasNextLine()) {
            System.out.println(in.nextLine().toUpperCase()); 
        }
        in.close();
    }
}
