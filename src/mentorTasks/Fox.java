package mentorTasks;

public class Fox {
    public boolean wearsCoat, hasAtorch;
    public String coatColor,name;
    public int bagCount;

    public void setFox(String name, boolean wearsCoat, boolean hasAtorch, String coatColor, int bagCount) {
        this.name=name;
        this.wearsCoat = wearsCoat;
        this.hasAtorch = hasAtorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }

    public String toString() {
        return "Fox{" +
                "wearsCoat=" + wearsCoat +
                ", hasAtorch=" + hasAtorch +
                ", coatColor='" + coatColor + '\'' +
                ", name='" + name + '\'' +
                ", bagCount=" + bagCount +
                '}';
    }
}
