import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter = counter + 1;
            System.out.print("Enter next Grade or -1 to quit: ");
            grade = input.nextInt();
        }


        // lets get the average

        if (counter != 0) {
            double average = (double) total / counter;
            System.out.printf("%.2f", average);
        }
        else
            System.out.print("No grades were enter");

    }
}
