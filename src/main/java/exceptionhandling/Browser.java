package exceptionhandling;

public class Browser {
    public static void main(String[] args) throws Exception {


        String browserName = "chrome";

        boolean flag = true;

        if(browserName.equals("chrome")) {
            System.out.println("launch chrome");
        }
        else {
            System.out.println("browser not found..please pass the correct browser name:: "+browserName);
            //throw new Exception("please pass the correct browser name");
            flag = false; // this also means the same
        }


        if(flag) {
            System.out.println("enter the url");
        }
    }
}
