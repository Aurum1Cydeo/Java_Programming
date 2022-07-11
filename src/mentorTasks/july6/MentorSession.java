package mentorTasks.july6;

public abstract class MentorSession {
    public MentorSession() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void nonAbstract(){
        System.out.println("This is normal method of abstract class");
    }
}

