 // This application will print 5 different numbers seperately

      import java.util.Scanner;      

      public class Seperator
      {
        public static void main(String[] args)
        {
         
         Scanner input = new Scanner(System.in);
     
         int x, y, z, p, q, w, a, b, c, d;

         System.out.print("Please the integers: ");
         x = input.nextInt();

         y = x % 10; //this will give the last number
         z = x / 10; // four numbers would be left

         q = z % 10; // this will give us the fourth number
         w = z / 10; // three numbers would be left

         a = w % 10; // this will give us the third number
         b = w / 10; // two numbers would be left

         c = b % 10; // this will give us the 2nd number
         d = b / 10; // this will give us the first number

         System.out.printf("%d   %d   %d   %d   %d", d, c, a, q, y);   
         }                             

       }   