package practiceConstructors;

public class Credential {

    private String username, password;

    public Credential(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public String toString() {
        return "Credential{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)) {
            System.err.println("Password is not strong");
            System.exit(1);
        }
        this.password = password;
    }

    private boolean isStrongPassWord(String password) {
        char[] arrPassword = password.toCharArray();
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (Character each : arrPassword) {

            if (Character.isLetter(each)) {
                hasLetter = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }

        }
        return hasDigit && hasLetter && hasSpecialChar && password.length() >= 8 && !password.contains(" ");

    }
/*Variables:
    username, password

    Encapsulate all the fields
            (password MUST be a strong password)


    Add a constructor that allows user to set all the fields when the object is created.
            (If the arguments not valid it should not be set to the instances)

    Methods:
    isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
    Characteristics of strong passwords are:
            1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

    toString()*/

}
