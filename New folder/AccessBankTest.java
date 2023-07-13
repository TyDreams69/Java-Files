// Let's test the methods created on AccessBank class
 
    import java.util.Scanner;
  
    public class AccessBankTest
    {
        public static void main(String[] args)
        {
            AccessBank customer1 = new AccessBank("Elijah Jolayemi", 1000);
            AccessBank customer2 = new AccessBank("Shade Ajigbade", 300);
            AccessBank customer3 = new AccessBank("Fola Agoro", 1200);

            System.out.printf("%n%s bal: $%.2f%n", customer1.getName(), customer1.getBalance());
            System.out.printf("%s bal: $%.2f%n", customer2.getName(), customer2.getBalance());
            System.out.printf("%s bal: $%.2f%n%n", customer3.getName(), customer3.getBalance());


            //Lets make a deposit for the three customers
            Scanner input = new Scanner(System.in);
            Double depositAmt;
            
            System.out.print("Enter deposit amount for Elijah: "); //prompt...
            depositAmt = input.nextDouble();
            customer1.deposit(depositAmt);

            System.out.printf("%nadding $%.2f to %s bal%n", depositAmt, customer1.getName());

            System.out.printf("%s new bal: $%.2f%n%n", customer1.getName(), customer1.getBalance());

            System.out.print("Enter deposit amount for Shade: "); //prompt...
            depositAmt = input.nextDouble();
            customer2.deposit(depositAmt);

            System.out.printf("%s new bal: $%.2f%n%n", customer2.getName(), customer2.getBalance());

            System.out.print("Enter deposit amount for fola agoro: "); //prompt...
            depositAmt = input.nextDouble();
            customer3.deposit(depositAmt);

            System.out.printf("%s new bal: $%.2f%n%n", customer3.getName(), customer3.getBalance());

            System.out.print("ALL CUSTOMER CURRENT BALANCE IS...");
            System.out.println();

            System.out.printf("%n%s bal: $%.2f%n", customer1.getName(), customer1.getBalance());
            System.out.printf("%s bal: $%.2f%n", customer2.getName(), customer2.getBalance());
            System.out.printf("%s bal: $%.2f%n%n", customer3.getName(), customer3.getBalance());

            //Now Lets withdraw...

            System.out.print("Please enter withdrawal amount for Elijah: "); //prompt...
            double withdrawal;
            withdrawal = input.nextDouble();
            
            System.out.println();
            
            
            System.out.printf("%nwithdrawing %.2f from %s bal%n", withdrawal, customer1.getName());
            customer1.withdraw(withdrawal);
           
           System.out.printf("%n%n%s bal: %.2f%n", customer1.getName(), customer1.getBalance());    
        }
       
        


    }
