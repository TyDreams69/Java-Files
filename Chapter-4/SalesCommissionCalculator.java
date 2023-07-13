import java.util.Scanner;

public class SalesCommissionCalculator {
	public static void main(String[] args) {
		double item_1 = 239.99;
		double item_2 = 129.75;
		double item_3 = 99.95;
		double item_4 = 350.90;
		int itemSold;
		int counter = 0;
		double grossSales = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the name of the sales person: ");
		String name = input.nextLine();

		System.out.print("Enter the first item sold by " + name + " or -1 to cancel: ");
		itemSold = input.nextInt();

		while (itemSold != -1) {
			if (itemSold == 1) {
				grossSales += item_1;
			}
			else if (itemSold == 2) {
				grossSales += item_2;
			}
			else if (itemSold == 3) {
				grossSales += item_3;
			}
			else {
				grossSales += item_4;
			}
			++counter;
			System.out.print("Enter the next item sold by " + name + " or -1 to cancel: ");
			itemSold = input.nextInt();
		}

		if ( counter != 0){
			double netPay = 200 + (0.09 * grossSales);
			System.out.println("\nThe total earnings for "+ name + " is " + netPay);
		}
		else
			System.out.println("No item was sold");
	}
}
