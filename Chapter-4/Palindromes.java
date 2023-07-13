import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;

		System.out.print("Enter the five digit numbers: ");

		while (counter == 1) {
			int number = input.nextInt();

			if (number > 9999 && number <= 99999) {
				int c = number % 10;
				int d = number / 10;

				int fourthValue = d % 10;
				int e = d / 10;

				int thirdValue = e % 10;
				int f = e / 10;

				int secondValue = f % 10;
				int firstValue = f / 10;
				++counter;

				if ((firstValue == c) && (secondValue == fourthValue)){
					System.out.print("This value is a Palindrome");
				}
				else{
					System.out.print("This value is not a Palindrome");
				}
			} else {
				System.out.print("You need to input 5 values for this to work!!!, Please enter a new value: ");
			}
		}
	}
}
