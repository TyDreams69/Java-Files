    import java.util.Scanner;

    public class LargestSecond {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int counter = 1;
            int largest = 0;
            int secondLargest = 0;

            while (counter <= 10) {
                System.out.println("Enter number #" + counter + ":");
                int number = scanner.nextInt();

                if (number > largest) {
                    secondLargest = largest;
                    largest = number;
                } else if (number > secondLargest) {
                    secondLargest = number;
                }

                counter++;
            }

            System.out.println("The largest number is: " + largest);
            System.out.println("The second largest number is: " + secondLargest);
            scanner.close();
        }
    }

