package classesandobjects;

public class Employee {
    //class - template/ blueprint / category
    //Object - sahil/rithica/divya :: physical entity created from class(Category)
    //Every Object has its own properties

    //class level variables
    String name;
    int age;
    String city;
    public static void main(String[] args) {



        // Employee employee = new Employee();

        //Employee - class name
        // employee - reference name
        //new - keyword to create an object
        //new Employee - Object


        Employee employee = new Employee();

        employee.name = "Sahil";
        employee.age = 29;
        employee.city = "Mohali";

        Employee employee1 = new Employee();

        employee1.name = "divya";
        employee1.age = 33;
        employee1.city= "xyz";

        System.out.println("------------------------------------------");


        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.city);

        System.out.println("------------------------------------------");

        System.out.println(employee1.name);
        System.out.println(employee1.age);
        System.out.println(employee1.city);

    }
}
