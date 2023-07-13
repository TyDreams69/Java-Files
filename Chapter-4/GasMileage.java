import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		double combinedMilesPerGallon = 0;
		int milesDriven;
		int gallonsUsed;
		int noOfTrips = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the miles driven or -1 to cancel: ");
		milesDriven = input.nextInt();

		while (milesDriven != -1) {
			System.out.print("Enter the gallons used: ");
			gallonsUsed = input.nextInt();
			double milesPerGallon = (double) milesDriven / gallonsUsed;
			System.out.printf("The miles per gallon for this trip is: %.2f",milesPerGallon);
			combinedMilesPerGallon += milesPerGallon;
			++noOfTrips;
			System.out.print("\nEnter the miles driven for the next trip or -1 to cancel: ");
			milesDriven = input.nextInt();
		}

		if (noOfTrips != 0) {
			System.out.printf("The total miles per gallon for %d trip(s) is %.2f",noOfTrips,combinedMilesPerGallon);
		}
		else
			System.out.print("No data entered");
	}
}
