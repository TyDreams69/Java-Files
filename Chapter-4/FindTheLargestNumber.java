import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        int largest = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of unit sold by the first employee: ");

        while (counter <= 10){
            int number = input.nextInt();
            if (number > largest){
                largest = number;
                System.out.print("Enter the number of unit sold by the next employee: ");
            }
            else
                System.out.print("Enter the number of unit sold by the next employee: ");
            ++counter;
        }

            System.out.println("\n\nThe largest number is " +  largest);
    }
}
