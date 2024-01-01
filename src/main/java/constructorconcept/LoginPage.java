package constructorconcept;

public class LoginPage {
    static String username;
    static String password;


    //1. Constructor - to intialize the class level variables
    private LoginPage(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //2. Methods - to write a buisness logic / feature logic
    public static void doLogin() {

        System.out.println("I am logging into the app");
        System.out.println("this is my username"+username);
        System.out.println("this is my password"+password);
    }
}
