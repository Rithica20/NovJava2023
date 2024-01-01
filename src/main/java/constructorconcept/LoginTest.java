package constructorconcept;

public class LoginTest {
    // RunnerClass

    public static void main(String[] args) {

        // LoginPage lp = new LoginPage("sahil.kumar@gmail.com", "Sahil12345");

        LoginPage.username = "sahil@yopmail.com";
        LoginPage.password = "sahil12345";

        System.out.println("this is the username" + LoginPage.username);
        System.out.println("this is the username" + LoginPage.password);

        LoginPage.doLogin();


    }
}
