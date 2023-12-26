package constructorpractice;

public class Rectangle {
    //    Assignment 2:
//    Create a Java class named "Rectangle" with the following instance variables:
//    length (double)  width (double)
//    Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
//    Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.
//    Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
//    Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.
    double length;
    double width;
    public  Rectangle(){
        length=0.0;
        width=0.0;
        System.out.println(length);
        System.out.println(width);
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        System.out.println(length);
        System.out.println(width);
    }
    public double calculateArea(){
        double area = length * width;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle r1= new Rectangle(2.0,3.5);
        r1.calculateArea();

    }
}
