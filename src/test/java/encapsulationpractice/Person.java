package encapsulationpractice;

public class Person {
    /**
     * Objective: The objective of this assignment is to create a class that uses encapsulation to protect its data and provide getter and setter methods for accessing the data.
     * Instructions:
     * Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).
     * Create getter and setter methods for each attribute.
     * Write a method called "printInfo" that prints out the name, age, and gender of the person.
     * Create an instance of the "Person" class and set its attributes using the setter methods.
     * Call the "printInfo" method to verify that the data was set correctly.
     * Questions:
     * What is encapsulation and how does it relate to object-oriented programming?
     *Encapsulation is that few of the data varaibles and methods are kept to be as private and
     * exposing it through the public methods or with an public constructor
     *
     * Why is it important to use getter and setter methods instead of accessing attributes directly?
     * Getters and setters allow the programmer to change the implementation of a class later on more easily.
     * If the class is used elsewhere, and if there are no getters and setters,
     * then the programmer has to change every other class which uses it. With getters and setters,
     * the using classes can remain unchanged.
     *
     * How can encapsulation improve the security and reliability of a program?
     *Encapsulation allows you to hide the internal implementation details of a class and expose only what is necessary
     * Encapsulation enables controlled access to the internal state of an object. You can provide limited and well-defined access points (public methods) to manipulate the object's data.
     * Encapsulation makes it easier to maintain and update the code because changes to the internal implementation of a class do not affect the external code that uses the class.
     *
     * What is the difference between a private attribute and a public attribute?
     *  Public attributes are accessible from outside the class. They can be accessed and modified directly by code outside the class.
     *  Private attributes are not accessible directly from outside the class. They are meant to be used only within the class.
     * How does encapsulation help with code maintainability and scalability?
     * The internal details of a class are hidden from the outside world, and only  (public methods) is exposed.
     * This modular design makes it easier to understand, modify, and extend the code because developers can focus on
     * individual classes without being concerned about the internal implementation details.
     * Encapsulation helps in organizing code by clearly defining the responsibilities of each class.
     * Each class encapsulates a specific set of functionalities, making it easier to locate and manage code related to a particular concern.
     * This separation of concerns enhances code readability and maintainability.
     */

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printInfor(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}
