package selfPracticeInheritance.electronics;

public class Laptop extends Computer{
    private boolean hasCamera;
    private boolean isCarryOn;

    public Laptop(String brand, String model, String color, String size, double price, boolean hasCamera, boolean isCarryOn) {
        super(brand, model, color, size, price, true);
        setCarryOn(isCarryOn);
        setHasCamera(hasCamera);
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public boolean isCarryOn() {
        return isCarryOn;
    }

    public void setCarryOn(boolean carryOn) {
        isCarryOn = carryOn;
    }
}
