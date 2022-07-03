package selfPracticeInheritance.electronics;

public class IPhone extends Phone {

    private boolean hasItunes;
    private boolean hasIcloud;

    public boolean isHasItunes() {
        return hasItunes;
    }

    public void setHasItunes(boolean hasItunes) {
        this.hasItunes = hasItunes;
    }

    public boolean isHasIcloud() {
        return hasIcloud;
    }

    public void setHasIcloud(boolean hasIcloud) {
        this.hasIcloud = hasIcloud;
    }

    public IPhone( String model, String color, String size, double price,  boolean hasItunes, boolean hasIcloud) {
        super("Apple", model, color, size, price);
        setHasItunes(hasItunes);
        setHasIcloud(hasIcloud);
    }
}
