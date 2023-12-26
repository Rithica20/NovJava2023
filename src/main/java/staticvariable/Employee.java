package staticvariable;

public class Employee {

    //instance variable
    String name;
    int age;
    final static String organizationName ="GL";

    public void getEmail(){
        System.out.println("getting an email");
    }

    public static void sendEmail(){
        System.out.println("sending an email with no  body");
    }

    public static void sendEmail(String body){
        System.out.println("sending an email with no  body" + body);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name ="sahil";
        e1.age= 29;

        Employee e2 = new Employee();
        e2.name ="sagar";
        e2.age= 25;

        Employee e3 = new Employee();
        e3.name ="rajat";
        e3.age= 45;

        //how to call static variable
        //1. By Class Name
        //System.out.println(Employee.organizationName);
        //2. We can directly call them but in a print statement
        System.out.println(organizationName);

//        Employee.sendEmail("abc");
//        sendEmail("abc");



    }
}
