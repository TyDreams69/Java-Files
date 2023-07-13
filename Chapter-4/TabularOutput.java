import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
       int n = 1;
       String number = "N";
       int counter = 1;

       Scanner input =new Scanner(System.in);

       System.out.println("N    10*N    100*N    1000*N"+"\n");

       while (counter <=5){
           System.out.print((n)+"    "+ (n * 10)+ "      "+ (n * 100)+ "      "+ (n * 1000)+"\n");
           ++counter;
           ++n;
       }
    }
}
