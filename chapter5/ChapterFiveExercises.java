public class ChapterFiveExercises {
    public static void main(String[] args) {
        int i;
        int counter = 1;

        for (i = 1; i <=20; ++i){
            System.out.print(i);

            if (i % 5 == 0){
                System.out.println();
            }
            else
                System.out.print('\t');
        }

    }
}

