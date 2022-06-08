package self_Practice;
public class Browser {
    public static void main(String[] args) {

        String browser= "edge";
        String browserName="";

        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari"
                || browser == "edge") {
            if(browser == "chrome") browserName= "Chrome Browser";
            else if(browser =="firefox") browserName= "Firefox Browser";
            else if(browser =="opera") browserName= "Opera Browser";
            else if(browser =="firefox") browserName= "Firefox Browser";
            else    browserName= "Edge Browser";

            System.out.println(browserName +" is selected");


        } else
            System.out.println("Invalid browser name");








    }
}