public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;

        System.out.println("Number\tFactorial");

           for (int counter = 1; counter <= 20; counter++){
               factorial = (long) factorial * counter;
               System.out.println(counter+"\t\t"+factorial);
           }
    }
}
