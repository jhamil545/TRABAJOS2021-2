
package algebra;
import java.util.Scanner;
/**
 *
 * @author JHAMIL
 */
public class ejercicio {
    static Scanner teclado=new Scanner(System.in);
  public void algebra(){
       
Double a,b;
    
System.out.println("Ingrese valor de a:");
a=teclado.nextDouble();
System.out.println("Ingrese valor de b:");
b=teclado.nextDouble();
      if (a>b) {
          System.out.println("a es mayor que b ");
      }
      if (a<b) {
          System.out.println("a es menor que b ");
      }
      if (a.equals(b)) {
          System.out.println("a es igual con b ");
      }
}
  }
  
