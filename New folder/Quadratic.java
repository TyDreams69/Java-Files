  
  // Quadratic.java
 
  // This program solves a quadratic equation using the almighty formular

  // a, b, c = known numbers, where a != 0 
   
   import java.util.Scanner;

   public class Quadratic
   {
   	public static void main(String[] args)
        {
		Scanner input = new Scanner(System.in);

                double a, b, c, x, q, w, d, e, f, p;
                

                System.out.print("enter the value for a: "); //prompt
                a = input.nextInt();

                System.out.print("enter the value for b: ");
                b = input.nextInt();
                
                System.out.print("enter the value for c: ");
                c = input.nextInt();  

                p = (b * b) - 4 * a * c; // b^2-4ac

                q = Math.sqrt(p); // assigns squareroot of variable p  to q

                // to get the value of x which can be either variable w or d

                w = (- b - q) / (2 * a); // the formular to get w
                d = (- b + q) / (2 * a); // the formular to get d    

                System.out.printf("x is %f or %f ", w, d);
               
	}
   }	