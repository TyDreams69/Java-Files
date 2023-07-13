public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;

    public AirConditioner (String productName){
        this.productName = productName;
    }

    public AirConditioner(boolean isOn, String productName, int temperature){
        if (isOn && temperature > 15 && temperature < 27){
            this.isOn = true;
            this.temperature = temperature;
        }
        this.productName = productName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature(){
        if (isOn() && temperature < 26) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature() {
        if (isOn() && temperature > 16) {
            temperature = temperature - 1;
        }
    }

    public void turnOn() {
        if (!isOn()) {// if method will only work if the AC is off
            isOn = true;
            temperature = 16;
        }
        else {
            System.out.println("The Ac is already on!");
        }
    }

    public void turnOff() {
        if (isOn()) // this method will only work if the AC is on
            isOn = false;
        else {
            System.out.println("The Ac is already off!");
        }

    }
}



