package constructorconcept;

public class Person {
    String name;
    static String collegeName = "abcd";


    //can we use static variables inside constructor ?

    public Person(String name, String collegeName) {
        this.name = name;
        Person.collegeName = collegeName;
    }


    public Person(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

        Person p = new Person("sahil", "abcd");
        Person p1 = new Person("Ritika");

//		System.out.println(p.name);
//		System.out.println(p.collegeName);

        System.out.println(p1.name);
        System.out.println(p1.collegeName); //abcd
    }
    }
