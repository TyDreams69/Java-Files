import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctAnswer = 0;

        System.out.printf("%s: %s%n %s%n%n", "Test Your Knowledge",
                "Global Warming Facts Quiz",
                "Please read the questions carefully and type the correct option (1-4)");

        System.out.printf("%s%n%s%n %s%n%s%n%s%n%s%n%n", "Question 1", "Which of the following human activities " +
                        "contribute most to climate change?",
                "1) Littering",
                "2) Burning fossil fuels",
                "3) Gardening",
                "4) None of the above");

        System.out.print("\nEnter your answer: ");


        int answer1 = input.nextInt();

        switch (answer1) {
            case 1:
                break;

            case 2:
                correctAnswer++;
                break;

            case 3:
                ;
                break;
            case 4:
        }

        System.out.printf("%n%s%n%s%n %s%n%s%n%s%n%s%n%n", "Question 2", "What is the impact of rising " +
                        "temperatures on our planet?",
                "1) More extreme weather events such as hurricanes and heat waves",
                "2) Rising sea levels and increased flooding",
                "3) Crop failures due to water shortages and droughts",
                "4) All of the above");

        System.out.print("\nEnter your answer: ");

        int answer2 = input.nextInt();

        switch (answer2) {
            case 1:
                break;

            case 2:;
                break;

            case 3:

            case 4:
                correctAnswer++;
                break;
        }

        System.out.printf("%n%s%n%s%n %s%n%s%n%s%n%s%n%n", "Question 3", "Which of the following is a greenhouse gas? ",
                "1) C02",
                "2) CH4",
                "3) Water vapour",
                "4) All of the above");

        System.out.print("\nEnter your answer: ");

        int answer3 = input.nextInt();

        switch (answer3) {
            case 1:
                break;

            case 2:;
                break;

            case 3:

            case 4:
                correctAnswer++;
                break;
        }

        System.out.printf("%n%s%n%s%n %s%n%s%n%s%n%s%n%n", "Question 4", "What is the Greenhouse effect?",
                "1) The name of climate change legislation that was passed by Congress",
                "2) When you paint your house green to become an environmentalist",
                "3) When the gases in our atmosphere trap heat and block it from escaping our planet",
                "4) When you build a green house");

        System.out.print("\nEnter your answer: ");

        int answer4 = input.nextInt();

        switch (answer4) {
            case 1:
                break;

            case 2:

            case 3:
                correctAnswer++;
                break;

            case 4:
        }

        switch (correctAnswer){
            case 4:
                System.out.println("Excellent!! you scored 100%");
                break;

            case 3:
                System.out.println("Very Good! you scored 75%");
                break;

            case 2:

                System.out.println("Time to brush up on your knowledge of global warming");
        }
    }
}
