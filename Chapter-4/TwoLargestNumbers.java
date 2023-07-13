import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        int firstLargest = 0;
        int secondLargest = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        while (counter <= 10) {
            System.out.print("Enter the number of unit sold by the first employee: ");
            int number = input.nextInt();
            
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            }
            
            else
                if(number > secondLargest){
                    secondLargest = number;
            }
            ++counter;
        }

        System.out.println("\nThe two largest numbers are " +  firstLargest + " and "+  secondLargest);
    }
}


