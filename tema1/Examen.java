package tema1;




/**
 * Write a description of class Examen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examen
{
    public static boolean sumSimetrics(int[] v, int x, int ini, int fi) {
        boolean res;
        if (ini >= fi) { res = true; }
        else { 
            if (v[ini] + v[fi] == x) { 
                res = sumSimetrics( v, x, ini + 1, fi - 1);
            }
            else {res = false;}                
        }
        return res;
    }
    
    public static boolean progresioGeo(int x, int[] v, int pos) {
        boolean res;
        if (pos == v.length) { res = true; }
        else {
            if (v[pos] == v[pos - 1] * x) { res = progresioGeo( x, v, pos + 1); }
            else { res = false;}
        
        }
        return res;
    
    }
    
    public static int sumaFinsMax(int[] v, int pos, int x) {
        int res = 0;
        if (pos == v.length ) { return res;}
        else{
           if(v[pos] < x) { 
                sumaFinsMax(v, pos + 1, x);
                return res = res + v[pos];
               
            
            } else { return res; }
        }
  
    }
    
    // 2017/2018 EXAM
    
    public static int comparaLength(String[] v, int n, int pos) {
        if (pos == v.length) return 0;
        else {
            if (v[pos].length() == n ) { return 1 + comparaLength(v, n, pos + 1); }
            else { return comparaLength(v, n, pos + 1); }
        }
    
    
    }
    
    // 2017/2018 EXAM
    
    public static int multiplesDeX(int[] a, int x, int pos) {
        if (pos >= a.length) return 0;
        else {
            if (a[pos] % x == 0)  { return 1 + multiplesDeX(a, x, pos + 1); }
            else { return multiplesDeX(a, x, pos + 1); }
        } 
    }
    
    //An other way, this one return the number of numbers
    
    public static void multiplesDeX2(int[] a, int x, int pos) {
        if (pos == a.length) {;}
        else {
            if (a[pos] % x == 0)  { System.out.print(" " + a[pos]); }
            multiplesDeX(a, x, pos + 1);
        } 
    }
}
