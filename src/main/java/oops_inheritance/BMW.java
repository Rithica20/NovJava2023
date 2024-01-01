package oops_inheritance;

public class BMW extends Car{
    //method overriding (Runtime Polymorphism/dynamic)
    // when we have a method in parent class and the same method in child class
    //// with:
    // the same name
    //// the same number of parameters
    // the same sequence/order of the parameters
    //// the same return type

    @Override
    public void start() {
        System.out.println("BMW----start");
    }

    public void autoParing() {
        System.out.println("BMW----autoparking");
    }
}
