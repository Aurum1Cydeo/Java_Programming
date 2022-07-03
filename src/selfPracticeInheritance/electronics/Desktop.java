package selfPracticeInheritance.electronics;

public class Desktop extends Computer {
    private boolean hasDvdRom;

    public Desktop(String brand, String model, String color, String size, double price, boolean hasBattery,  boolean hasDvdRom) {
        super(brand, model, color, size, price, hasBattery);
        this.hasDvdRom = hasDvdRom;
    }

    public boolean isHasDvdRom() {
        return hasDvdRom;
    }

    public void setHasDvdRom(boolean hasDvdRom) {
        this.hasDvdRom = hasDvdRom;
    }
}
