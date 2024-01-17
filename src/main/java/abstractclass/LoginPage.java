package abstractclass;

public class LoginPage extends Page{
    public LoginPage() {
        System.out.println("this is LoginPage  constructor");
    }

    public LoginPage(int a) {
        System.out.println("this is LoginPage  parameterized constructor"+a);
    }
    int loadingTime = 10;

    @Override
    public void url() {
        System.out.println("login page --- url");

    }

    @Override
    public void title() {

        System.out.println("login page --- title");
    }


    @Override
    public void search() {
        System.out.println("Login class --- search");

    }
}
