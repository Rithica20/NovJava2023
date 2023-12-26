package staticmethodsandmethodcalling;

public class Employee {
    public static void t1(Employee t) {
        System.out.println("t1");
        t.a1();
    }
    public static void t2() {
        System.out.println("t2");
    }
    public static void t3() {
        System.out.println("t3");
    }

    public void a1() {
        System.out.println("a1");
    }

    public void a2() {
        System.out.println("a2");
        t2();
    }

    public void a3() {
        System.out.println("a3");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        System.gc();

        Employee.t1(emp);
    }
}
