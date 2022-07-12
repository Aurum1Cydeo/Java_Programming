package mentorTaskRealEstateJuly_13;

public abstract class House {


    private String name;

    public House(String name) {
       setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +
                '}';
    }
}
