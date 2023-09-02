import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {

        SecureRandom randomNum = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++){
            int face = 1 + randomNum.nextInt(6);
            System.out.print(face + " ");

            if (counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
