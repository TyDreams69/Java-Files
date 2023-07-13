import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        System.out.print("Enter the four integers: ");
        Scanner input = new Scanner(System.in);

        int originalNum = input.nextInt();

        int fourthNum = originalNum % 10;
        int originalNum1 = originalNum / 10;

        int thirdNum = originalNum1 % 10;
        int originalNum2 = originalNum1 /10;

        int secondNum = originalNum2 % 10;
        int firstNum = originalNum2 / 10;

        // lets encrypt the values
        firstNum = firstNum + 10 - 7;
        if (firstNum > 10){
            firstNum = firstNum % 10;
        }
        secondNum = secondNum + 10 - 7;
        if (secondNum > 10){
            secondNum = secondNum % 10;
        }
        thirdNum = thirdNum + 10 - 7;
        if (thirdNum > 10){
            thirdNum = thirdNum % 10;
        }

        fourthNum = fourthNum + 10 - 7;
            if (fourthNum > 10){
                fourthNum = fourthNum % 10;
            }

        // let's swap the third number with the first
        int exchange = firstNum;
        firstNum = thirdNum;
        thirdNum = exchange;

        // let's swap the second number with the fourth number
        int exchange2 = secondNum;
        secondNum = fourthNum;
        fourthNum = exchange2;


        System.out.printf("%d%d%d%d",firstNum,secondNum,thirdNum,fourthNum);
    }
}
