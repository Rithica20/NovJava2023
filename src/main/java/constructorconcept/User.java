package constructorconcept;

public class User {
    String name;
    int age;
    String city;
    double salary;
    char gender;
    boolean isActive;

    // 1. name should same as class name
    // 2. can not return anything/no void
    // 3. How to call a constructor ? we need to create the object of the class and
    // respective const.. will be called
    //4. Is constructor overloading possible ? - Yes it is possible


    //constructor has restricted the object creation
    // major purpose - to intialize the class level variables

    public User(String name, int age) { // 2-arg constructor

        this.name = name;
        this.age = age;

    }

    public User(String name, int age, String city) { // 3-arg constructor

        System.out.println("this is my default/no-arg constructor");
    }

    public static void main(String[] args) {

        User u1 = new User("sahil",29);

        System.out.println(u1.name);
        System.out.println(u1.age);


//		u1.name = "sahil";
//		u1.age=29;
//		u1.city="mohali";

        User u2 = new User("Ritika",23);
//		u2.name = "sahil";
//		u2.age=29;
//		u2.city="mohali";

        User u3 = new User("Divya",25);
//		u3.name = "sahil";
//		u3.age=29;
//		u3.city="mohali";



    }
}
