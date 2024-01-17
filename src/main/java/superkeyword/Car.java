package superkeyword;

public class Car extends Vehicle{
    int min_speed = 100;

    public Car() {
        System.out.println("Car default constructor");
    }

    public Car(int i) {
        System.out.println("Car paramterized constructor");
    }



    public void speed() {
        System.out.println("car speed");
        System.out.println(min_speed);
    }

    public static void OverSpeed() {
        System.out.println("car speed");
    }
}
