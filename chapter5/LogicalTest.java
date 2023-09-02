import java.util.Scanner;

public class LogicalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LogicalOperatora client1 = new LogicalOperatora("Ma",2222222, "Benz Amg");
        LogicalOperatora client2 = new LogicalOperatora("Pa",3333333, "Camero");
        LogicalOperatora client3 = new LogicalOperatora("Bj",1111111, "Rolls Royce");

        noFaultState(client1);
        noFaultState(client2);
        noFaultState(client3);
    }

    public static void noFaultState(LogicalOperatora policy){
        System.out.printf("Account#: %d  Car: %s  state: %s %s a no-fault state%n%n",policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState(),
                policy.isNoFaultState() ? "is": "is not!");
    }
}
