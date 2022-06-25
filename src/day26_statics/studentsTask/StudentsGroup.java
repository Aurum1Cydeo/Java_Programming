package day26_statics.studentsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//StudentsGroup HAS A STUDENT//HAS A RELETIONSHIP

    public String groupName;
    public int groupId;
    public ArrayList <Student> students=new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {//creates the StudentsGroup objects by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        //students=new ArrayList<>();//size is 0
    }

    public void addStudents(Student student){//takes one student objects,and adds it to the arrayList of students
        students.add(student);
    }

    public void addStudents(Student[]students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudents(String name,int age,char gender,String id){
       // Student student=new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }//takes name,age,gender ,id of student info ,creates student object by using the given info ,then adds the student object to the arraylist


    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    }// Takes the id and then removes the student object with the specified id from arraylist of students


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
