package pract3;

//package pract3;

import java.util.Locale;
/** Classe MeasuringSortingAlgorithms: Estudi empiric de costs
 *  dels metodes d'ordenacio.
 *  @author PRG - ETSInf
 *  @version Curs 2019-2020
 */
public class MeasuringSortingAlgorithms {
    // Constants que defineixen els parametres de mesura
    public static final int MAXTALLA = 10000, INITALLA = 1000;
    public static final int INCRTALLA = 1000;
    public static final int REPETICIONSQ = 200, REPETICIONSL = 20000;
    public static final double NMS = 1e3;  // relacio micro - nanosegons


    /** No hi ha objectes d'aquesta classe. */
    private MeasuringSortingAlgorithms() { }

    /** Crea un array d'int de talla t amb valors a 0.
     *  @param t int, la talla.
     *  @result int[], l'array generat.
     */
    private static int[] createArray(int t) {
        int[] a = new int[t];
        return a;
    }

    /** Omple els elements d'un array a d'int amb
     *  valors aleatoris entre 0 i a.length-1.
     *  @param a int[], l'array.
     */
    private static void fillArrayRandom(int[] a) {
        // COMPLETAR
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.floor(Math.random()*a.length*1000);
        }
    }

    /** Omple els elements d'un array a de forma creixent,
     *  amb valors des de 0 fins a.length-1.
     *  @param a int[], l'array.
     */
    private static void fillArraySortedInAscendingOrder(int[] a) {
        // COMPLETAR
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    /** Omple els elements d'un array a de forma decreixent,
     *  amb valors des de a.length-1 fins 0.
     *  @param a int[], l'array.
     */
    private static void fillArraySortedInDescendingOrder(int[] a) {
        // COMPLETAR
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = a.length - 1 - i; // per a que s'ordene al reves
        }
    }

    public static void measuringSelectionSort() {
        long ti = 0, tf = 0, tt = 0, tp = 0 ;// Temps inicial, final, total i promedi
        int[] res = new int[10];
        // Imprimir capçalera de resultats
        System.out.println("# Seleccio. Temps en microsegons");
        System.out.print("# Talla    Promedi \n");
        System.out.print("#------------------\n");

        // COMPLETAR
        int[] a = createArray(100);
        fillArrayRandom(a);
        ti = System.nanoTime();
        MeasurableAlgorithms.selectionSort(a);
        tf = System.nanoTime();
        tt = (tf - ti);

        //MOSTRAR EL TEMPS PER PANTALLA
        System.out.println("EL temps trancurregut es " + tt +
        " nanosegons i la talla de l'array es " + a.length);


        // Promedi


        for (int i = 0; i < REPETICIONSQ; i ++) {
            a = createArray(100);
            fillArrayRandom(a);
            ti = System.nanoTime();
            MeasurableAlgorithms.selectionSort(a);
            tf = System.nanoTime();
            tt = (tf - ti);
            tp += tt;
        }

        System.out.print("El temps promedi de 200 repeticions es " +
        tp/REPETICIONSQ + " nanosegons");

        //ACTIVITAT 8
        System.out.print("# Seleccio directa. Temps en microsegons\n# Talla Promedi\n# -------------\n");
       
        for (int talla = INITALLA; talla <= MAXTALLA; talla += INCRTALLA) {
            int k = 0;
            int[]v = createArray(talla);
           
            while (k < REPETICIONSQ) {                
                fillArrayRandom(v);
                ti = System.nanoTime();
                MeasurableAlgorithms.selectionSort(v);
                tf = System.nanoTime();
                tt += (tf - ti);              
                k++;
            }
            
            System.out.printf("%8d %10.3f\n",
                        talla,(tt/REPETICIONSQ) / NMS);
        }

    }

    public static void measuringInsertionSort() {

        long ti = 0, tf = 0, tt = 0, tt2 = 0, tt3 = 0; // Temps inicial, final i total
        // Imprimir capçalera de resultats
        System.out.println("# Insercio. Temps en microsegons");
        System.out.print("# Talla   Millor     Pitjor     Promedi \n");
        System.out.print("#---------------------------------------\n");

        // COMPLETAR
        for(int talla = INITALLA; talla <= MAXTALLA; talla += INCRTALLA){
            int[] a = createArray(talla); // array promedi           
            int[] m = createArray(talla); // array millor            
            int[] p = createArray(talla); // array pitjor    
            
            for (int i = 0; i <= REPETICIONSL; i++) {                              
                // Creem array cas cas millor                    
                fillArraySortedInAscendingOrder(m);

                //cas millor
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(m);
                tf = System.nanoTime();
                tt += (tf - ti);
   
            }
            
            for (int i = 0; i <= REPETICIONSQ; i++) {
                
                // Creem array cas cas pitjor
                fillArraySortedInDescendingOrder(p);

                //Cas pitjor
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(p);
                tf = System.nanoTime();
                tt2 += (tf - ti);

                //PROMEDI                    
                fillArrayRandom(a);
                ti = System.nanoTime();
                MeasurableAlgorithms.insertionSort(a);
                tf = System.nanoTime();
                tt3 += (tf - ti);
                
            }
            System.out.printf("%8d %10.3f %10.3f %10.3f \n", talla, (tt/REPETICIONSL) / NMS,(tt2/REPETICIONSQ) / NMS,(tt3/REPETICIONSQ) / NMS);
    
           
        }
    }
    
    public static void measuringMergeSort() {
        int INITALLAMERGE = (int)Math.pow(2, 10);
        int MAXTALLAMERGE = (int)Math.pow(2, 19);
        long ti = 0, tf = 0, tt = 0;
        int[] a;// Temps inicial, final i total
    
        int[] res = new int[10];
        // Imprimir capçalera de resultats
        System.out.println("# Mergesort. Temps en microsegons");
        System.out.print("# Talla     Promedi \n");
        System.out.print("#-------------------\n");
    
        // COMPLETAR
        for (int i = 0; i <= 200; i++) {
            int k = 0;
            while (INITALLAMERGE <= MAXTALLAMERGE) {
                a = createArray(INITALLAMERGE);
                fillArrayRandom(a);
                ti = System.nanoTime();
                MeasurableAlgorithms.mergeSort(a, 0, a.length - 1);
                tf = System.nanoTime();
                tt = tf - ti;
                res[k] += tt;
                System.out.println(INITALLAMERGE + "     " + tt);
                INITALLAMERGE *= 2;
                k++;
            }
        }

        int j = 0;
        for (int i = INITALLAMERGE; i <= MAXTALLAMERGE; i *= 2 ) {
            System.out.println(INITALLAMERGE + "     " + res[j]/200 );
            j++;
        }
    }

    public static void help() {
        String msg = "Us: java MeasurigSortingAlgorithms num_algorisme";
        System.out.println(msg);
        System.out.println("   on num_algorisme es:");
        System.out.println("   1 -> Insercio");
        System.out.println("   2 -> Seleccio");
        System.out.println("   3 -> MergeSort");
    }

    public static void main(String[] args) {
        if (args.length != 1) { help(); }
        else {
            try {
                int a = Integer.parseInt(args[0]);
                switch (a) {
                    case 1:
                        measuringInsertionSort();
                        break;
                    case 2:
                        measuringSelectionSort();
                        break;
                    case 3:
                        measuringMergeSort();
                        break;
                    default:
                        help();
                }
            } catch (Exception e) {
                help();
            }
        }
    }
}
