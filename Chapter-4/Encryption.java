import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the four integers: ");
		int originalNum = input.nextInt();

		int fourthNum = originalNum % 10;
		int originalNum1 = originalNum / 10;

		int thirdNum = originalNum1 % 10;
		int originalNum2 = originalNum1 /10;

		int secondNum = originalNum2 % 10;
		int firstNum = originalNum2 / 10;

		// lets encrypt the values
		firstNum = (firstNum + 7) % 10;
		secondNum = (secondNum + 7) % 10;
		thirdNum = (thirdNum + 7) % 10;
		fourthNum = (fourthNum + 7) % 10;

		// let's swap the first number with the third
		int exchange = thirdNum;
		thirdNum = firstNum;
		firstNum = exchange;

		// let's swap the second number with the fourth number
		int exchange2 = fourthNum;
		fourthNum = secondNum;
		secondNum = exchange2;


		System.out.printf("%d%d%d%d",firstNum,secondNum,thirdNum,fourthNum);

	}
}
