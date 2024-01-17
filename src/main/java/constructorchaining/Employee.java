package constructorchaining;

public class Employee {

    String name;
    int age;
    double salary;

    public Employee(){
        this(23,"rithica");
        System.out.println("This is my default constructor");
    }
    public Employee(int age,String name){
        this(23,"rithica",23.55);
        System.out.println("This is my two parameter constructor");
        this.name = "Mitaj";
        this.age = 35;
    }
    public Employee(int age,String name,double salary){
        System.out.println("This is my three parameter constructor");
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println("this is name:: "+e.name);
        System.out.println("this is age:: "+e.age);
        System.out.println("this is salary:: "+e.salary);

    }
}
