public class ProductOfOddIntegers {
    public static void main(String[] args) {

        int total = 1;

        for (int counter = 1; counter <= 15; counter+=2) {
            total *= counter;
            System.out.println(total);
        }
    }
}
