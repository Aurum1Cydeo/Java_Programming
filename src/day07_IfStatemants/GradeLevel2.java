package day07_IfStatemants;

public class GradeLevel2 {
    public static void main(String[] args) {
        int gradeLevel =18;// 1~18
        String result = "";
        if (gradeLevel<=5 ){
            result = "Elementary School";
        } else if (gradeLevel <= 8) {
            result ="Middle School";
        } else if ( gradeLevel <=12) {
            result = "High school";
        }else if (gradeLevel<= 16 ){
            result = "College";
        } else  {
            result="Grad school";
        }
        System.out.println(result);
        }

    }

