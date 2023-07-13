public class AirConditionerTest {
    public static void main(String[] args) {
        AirConditioner elijah = new AirConditioner("Hisense");

        elijah.turnOn();
        elijah.isOn();
        elijah.setProductName("LG");
        System.out.print(elijah.getProductName());
    }
}
