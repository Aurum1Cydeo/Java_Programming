package selfPracticeInheritance.electronics;

public class Samsung extends Phone {
private boolean hasSamsungPass;

    public boolean getHasSamsungPass() {
        return hasSamsungPass;
    }

    public void setHasSamsungPass(boolean hasSamsungPass) {
        this.hasSamsungPass = hasSamsungPass;
    }

    public Samsung(String model, String color, String size, double price, boolean hasSamsungPass) {
        super("Samsung", model, color, size, price);
        this.hasSamsungPass = hasSamsungPass;
    }
}
