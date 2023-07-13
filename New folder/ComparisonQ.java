   //this application allows users to input 3 figures, compare them and calculate

    import java.util.Scanner;

     public class ComparisonQ
     {
        public static void main(String[] args)  
        {   
            //Creating a scanner to obtain input from user
            Scanner input = new Scanner(System.in);
          
            int firstNumber; 
            int secondNumber;
            int thirdNumber;
            int sum, average, product;
            
            System.out.print("Enter your first integer: "); //prompt
            firstNumber = input.nextInt(); 
            
            System.out.print("Enter your second integer: ");
            secondNumber = input.nextInt();
           
            System.out.print("Enter your third integer: ");
            thirdNumber = input.nextInt();

            sum = firstNumber + secondNumber + thirdNumber;
            System.out.printf("The Sum is %d%n", sum);

            product = firstNumber * secondNumber * thirdNumber;
            System.out.printf("The product is %d%n%n", product);

            average = (sum / 3);
            System.out.printf("The average is %d%n%n", average);
            


            if (firstNumber > secondNumber && firstNumber > thirdNumber )
            System.out.printf("%d is the largest %n", firstNumber);

            if (firstNumber < secondNumber && firstNumber < thirdNumber )
            System.out.printf("%d is the smallest %n", firstNumber);


            if (secondNumber > firstNumber && secondNumber > thirdNumber )
            System.out.printf("%d is the largest %n", secondNumber);

            if (secondNumber < firstNumber && secondNumber < thirdNumber )
            System.out.printf("%d is the smallest %n", secondNumber);

            if (thirdNumber > firstNumber && thirdNumber > secondNumber )
            System.out.printf("%d is the largest %n", thirdNumber);

            if (thirdNumber < firstNumber && thirdNumber < secondNumber )
            System.out.printf("%d is the smallest %n", thirdNumber);




        }                             

     }