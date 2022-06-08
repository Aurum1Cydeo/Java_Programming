package lab_day7;

public class CydeoStudent {

   public String name;
   public int age;
   public char gender;
   public boolean isEmployed,isMarried;
   public String batch;
   public String programmingLanguage;
   public int groupNumber;

//set all the fields
    public void setInfo(String name, int age, char gender,
                        boolean isEmployed, boolean isMarried,
                        String batch, String programmingLanguage,
                        int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.programmingLanguage = programmingLanguage;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying "+programmingLanguage);
    }
//displays the student info when the object is passed in print statement
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}
