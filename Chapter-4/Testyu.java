import java.util.Scanner;

public class Testyu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter the integer: ");
        n = input.nextInt();
        int factorial = computeFactorial(n);

        System.out.println("The factorial is "+ factorial);
        }



    public static int computeFactorial(int num){
        int factorial = 1;

        while ( num > 1){
          factorial = factorial * num;
            --num;
        }
        return factorial;
    }
}