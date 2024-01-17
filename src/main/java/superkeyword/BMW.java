package superkeyword;

public class BMW extends Car{
    //Concept :: 1
    //we can super incase of variables - YES

    //Concept :: 2 incase of methods - YES


    //Concept :: 3 incase of constructor - YES

    int min_speed = 200;

    public BMW() {
        super(30);
        System.out.println("BMW default constructor");
    }

    public BMW(int i) {
        System.out.println("BMW parametrized constructor");
    }

    public void displaySpeed() {

        System.out.println(super.min_speed); //100
        System.out.println(min_speed); //200
    }

    public void speed(int i) {
        System.out.println("BMW Speed");
        super.speed();
        System.out.println(super.min_speed);
        Car.OverSpeed();
    }
}
