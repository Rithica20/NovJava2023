package constructorpractice;

public class Person {
//    Constructor Assignment :: Assignment 1:

//    Create a Java class named "Person" with the following instance variables:
//    name (StringTest)  age (int)  gender (char)  height (double)
//    Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//    Create a main method that creates two instances of the Person class using the constructor and prints out their information.
//    Questions:
//    What is the purpose of a constructor in Java?
//    constructor used to restrict unneccasry object creation
//    major purpose is to intialize the class level variables
//    Constructor will be called automatically when the object is created

//    How does a constructor differ from a regular method in Java?
//    Constructor - it can be called automatically when it object is created
//    It can have only the class name
//    main use is to intialize the object
//    It doesnt have any return type even void(no blank)
//    Java method- we should call a method in a program
//    It can have any name with camelcase
//    It can be with or without return type
//    Mainly for resusability of code.

//    Can a Java class have multiple constructors? If so, how are they differentiated?
//    yes we can have many constructor in a same class but it should have different arguments

    String name;
    int age;
    char gender;
    double height;

    public Person(String name,int age,char gender,double height){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
    }


    public static void main(String[] args) {
        Person person = new Person("rithica",23,'f',144);
    }

}
