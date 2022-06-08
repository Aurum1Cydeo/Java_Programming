package self_Practice;

public class emailDomain {
    public static void main(String[] args) {

        domain("nat3082@gmail.com");
        capitalization("JenNifeR ","loPeZ");
    }


//ta//task 1
    public static void domain(String email) {

        String domainName = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println("Domain: " + domainName);
    }
//ta//task 2
    public static void capitalization(String firstName,String lastName){

      String  myFirstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

      String myLastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();


        System.out.println(myFirstName +" " +myLastName);

    }



}
