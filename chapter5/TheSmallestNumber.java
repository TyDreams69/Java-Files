import java.util.Scanner;

public class TheSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallestNumber;

        System.out.print("Enter the number: ");
        int counter = input.nextInt();

        smallestNumber = counter;

        for (smallestNumber = counter; counter > 1; --counter){
            System.out.print("Enter the next number: ");
             int number = input.nextInt();
            if (number < smallestNumber){
                smallestNumber = number;
            }
        }
        System.out.println("\n\nThe smallest number is " +  smallestNumber);
        }
    }

