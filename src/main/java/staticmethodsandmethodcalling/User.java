package staticmethodsandmethodcalling;

public class User {
    //calling static and not static methods in same class
    public void u1() {
        System.out.println("u1");
        //u2(); //calling of non-static to non-static in same class
        User.t1();
    }
    public void u2() {
        System.out.println("u2");
        u3();
    }
    public void u3() {
        System.out.println("u3");
        t1(); //calling of static method  from non-static method of another class we can call directly
    }
    public static void t1() {
        System.out.println("t1");
        //User.t1(); // calling of static method to static method we can call directly
        // but it is recommoneded to call with class name and methodname

    }
    public static void t2(User user2) {
        System.out.println("t2");
        User us = new User();
        us.u1();//calling of non-static method from static method of another class by creating object
        //User.t2();
//		User user2 = new User();
//		user2.u2();
        user2.u2();
    }
    public static void search(User user2) { //user2 = user it is almost like int a if we pass a is 10 then it will be like a=10
        System.out.println("t3");
        // to call a non static method inside static method we need to create object everytime
        //suppose if we have 100 user then it will create 100 objects
        //so we can pass reference so that we can aviod creating unnecessary objects
        user2.u3();

    }
    public static void main(String[] args) {

        User u1 = new User();
        //user.u1();
        //u1=u2;

        //u1.u1(10); //call by value if we pass value then it is call by value

        User.search(u1); //call by reference
        User.t2(u1);

    }
}
