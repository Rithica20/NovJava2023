package access_specifier.Acc1;

public class Car {

    public String name;
    protected int price;
    private int milage;
    String color;

    public static void main(String[] args) {

        Car c = new Car();

        c.name = "sahil";
        c.price = 34;
        c.milage = 45;
        c.color = "blue";
    }
}
