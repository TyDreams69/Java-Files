import java.util.Scanner;

public class Analysis {
	public static void main(String[] args) {
		int passes = 0;
		int failures = 0;
		int counter = 1;

		Scanner input = new Scanner(System.in);
		while (counter <= 10){
			System.out.printf("Enter Result #%d  (1 = pass, 2 = fail): ",counter);
			int result = input.nextInt();

			if ( result == 1){
				passes = passes + 1;
				counter = counter + 1;
			}
			else
				if (result == 2){
					failures = failures + 1;
					counter = counter + 1;
				}
			else{
					System.out.println("Enter correct result!");
				}
		}

		System.out.println(passes + " " + " Students passed");
		System.out.println(failures + " " + " Students failed");

		if (passes > 8){
			System.out.print("Bonus to Instructor");
		}
	}
}
