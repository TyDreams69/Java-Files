public class TrianglePrintingProgramB {
    public static void main(String[] args) {
        int b = 10;
        for (int i = 1; i <=10; i++){
            for( int a = 1; a<=b; a++){
                System.out.print("*");
            }
            System.out.println();
            b--;
        }
    }
}
