package selfPracticeInheritance.electronics;

public class PersonalComputer extends Computer{
    private boolean hasCamera;

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public PersonalComputer(String brand, String model, String color, String size, double price, boolean hasBattery,  boolean hasCamera) {
        super(brand, model, color, size, price,true);
        setHasCamera(hasCamera);
    }
}
