package staticmethodsandmethodcalling;

public class Browser {
    //calling static and non-static methods in two different classes
    public void b1() {
        System.out.println("b1 method");
        Employee e = new Employee();
        e.a1();// calling of non-static to non-static in different class
    }
    public void b2() {
        System.out.println("b2 method");
        Employee.t3();//calling of static method  from non-static method of another class

    }
    public static void b3() {
        System.out.println("b3 method");
        Employee.t2();//calling of static method to static method from different class
        Employee e2 = new Employee();
        e2.a2();//calling of non-static method from static method of another class
    }
    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.b1();

    }
}
