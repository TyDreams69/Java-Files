import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter three floating integers separate by space: ");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();

        double result = maximum1(firstNum, secondNum, thirdNum);

        System.out.println("The maximum value is " + result);

    }

    public static double maximum(double x, double y, double z) {
        double maximumVal = x;

        if (y > maximumVal)
            maximumVal = y;

        if (z > maximumVal)
            maximumVal = z;

        return maximumVal;

    }

    public static double maximum1(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }
}
