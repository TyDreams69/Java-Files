import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		int counter = 1;
		double grossPay = 0;
		int rate = 10;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the employee's name: ");

		while (counter <=3){
			String name = input.next();

			System.out.print("Enter the total hours worked by " + name + ": ");
			int hoursWorked = input.nextInt();

			if (hoursWorked <= 40){
				grossPay = hoursWorked * rate;
				System.out.printf("The salary for %s is %.2f%n",name,grossPay);
			}
			else{
				grossPay = (hoursWorked * rate) + (1.5 * rate * (hoursWorked - 40));
				System.out.printf("The salary for %s is %.2f%n",name,grossPay);
			}
			++counter;
			if (counter <=3){
				System.out.print("\nEnter the next employee's name: ");
			}
		}
	}
}
