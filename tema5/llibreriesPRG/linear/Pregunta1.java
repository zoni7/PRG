package linear;


/**
 * Write a description of class Pregunta1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pregunta1
{
      public static ListPIIntLinked traductorBinari(ListPIIntLinked l) {
        ListPIIntLinked res = new ListPIIntLinked();
        l.begin();
        int n = l.size();
        int e1 , e2;
        while (n >= 2) {
            e1 = l.get();
            l.next();
            e2 = l.get();
            l.next();
            res.insert(e1 * 2 + e2);
            n = n - 2;
        }
        if (n == 1) { res.insert(l.get() - 2); }

        return res;
    }
}
