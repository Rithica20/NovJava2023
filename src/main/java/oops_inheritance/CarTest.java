package oops_inheritance;

public class CarTest {
    public static void main(String[] args) {

        BMW b = new BMW();
        b.stop(); //inherited method
        b.refuel(); //inherited method
        b.autoParing(); //individual method
        b.start(); // BMW - start

        System.out.println("---------------------------------");

        //float a = (float) 12;  -- typecasting

        Car c = new Car();
        c.start(); //individual methods
        c.stop();
        c.refuel();

        System.out.println("---------------------------------");


        //WebDriver driver = new ChromeDriver();

        // Top-Casting concept
        Car cb = new BMW();

        cb.start(); // Start - BMW // at complie time this method will point to Car class with is parent but at run time it
        //execute child class BMW method thats why method overriding is said to be run time polymorhsim
        cb.stop();
        cb.refuel();
        //cb.autoparking() -  parent doen't know that child has its own individual methods and hence it cannot call it


        //downcasting
        //BMW bw = (BMW) new Car(); // java.lang.ClassCastException: class oops_inheritance.Car cannot be cast to class oops_inheritance.BMW (oops_inheritance.Car and oops_inheritance.BMW are in unnamed module of loader 'app')
        //at oops_inheritance.CarTest.main(CarTest.java:38)
       // bw.start(); //BMW- start
        //bw.stop();
        //bw.refuel();
        //bw.autoParing();
        //

        Car c1 = new Audi();
        c1.start();
        c1.stop();
        c1.refuel();

        Vehicle v = new Car();
        v.engine();
        v.streo();
        v.topSpeed();




    }
}
