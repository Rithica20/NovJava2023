package classesandobjects;

public class Student {
    String name;
    int age;
    char grade;


    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "sahil";
        s2.name = "divya";

//        Student s1 = new Student();
//        s1.age=28;
//        s1.name ="abc";
//        s1.grade='A';
//
        //no ref object
        new Student().name = "sahil";
        new Student().age = 29;
        new Student().grade = 'C';

//
        //null ref object
//        Student s2 = new Student();
//        s2=null;
////
//        s2.name= "divya";
//        s2.age=22;
//        s2.grade='A';
//
//        System.out.println(s2.name);
//        System.out.println(s2.age);
//        System.out.println(s2.grade);


        System.gc();//gc is garbage collector

    }
    }
