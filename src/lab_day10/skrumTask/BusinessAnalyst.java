package lab_day10.skrumTask;

public final class BusinessAnalyst  extends Employee implements ScrumMember,WFH{
    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" gathering requirement documents");
    }
    public void analyze(){
        System.out.println(getName()+" analyze requirement documents");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
