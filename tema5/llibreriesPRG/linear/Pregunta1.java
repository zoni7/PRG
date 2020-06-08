package linear;


/**
 * Write a description of class Pregunta1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pregunta1
{
      public static StackIntLinked returnGreaterThan(StackIntLinked p, int x) {
          StackIntLinked res = new StackIntLinked();
          StackIntLinked auxRes = new StackIntLinked();
          StackIntLinked aux = new StackIntLinked();
          
          while(p.size() != 0) {
              if (p.peek() > x) {
                  auxRes.push(p.pop());
              } else {
                  aux.push(p.pop());
              }
          }
          while (aux.size() != 0) {
              p.push(aux.pop());
          }
          while (auxRes.size() != 0) {
              res.push(auxRes.pop());
          }
          return res;
      }
}
