package selfPracticeInheritance.electronics;

public class SmartTv extends TV{
    private boolean isConnectedToPhone;

    public SmartTv(String brand, String model, String color, String size, double price,  boolean isConnectedToPhone) {
        super(brand, model, color, size, price, false, true);
        this.isConnectedToPhone = isConnectedToPhone;
    }

    public boolean isConnectedToPhone() {
        return isConnectedToPhone;
    }

    public void setConnectedToPhone(boolean connectedToPhone) {
        isConnectedToPhone = connectedToPhone;
    }
}
