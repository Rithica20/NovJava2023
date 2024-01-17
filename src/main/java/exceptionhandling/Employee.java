package exceptionhandling;

public class Employee {
    public void display(int p) {

        try {
            int a = 10;
            int b = 20;
            int c = a+b;
            int cd = c/p;

            int bank_Account = 2000;
        }
        catch(Exception e) {
            System.out.println("exception occured");
            e.printStackTrace();
        }
    }


    int emp_id=200;


    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1=null;

        int c = 0;

        try {

            System.out.println("A");
            System.out.println("A");
            System.out.println("A");

            System.out.println(e1.emp_id); //NPE

            int a = 10;
            int b = 0;

            c = a/b; //AE
        }
        catch (NullPointerException e) {
            System.out.println("NPE is coming ");
            e.printStackTrace();
        }

        catch (ArithmeticException e) {
            System.out.println("AE is coming ");
        }
        catch (Throwable e) { //Runtime //Exception // Throwable    //Object
            System.out.println("Exception is coming");
        }


        System.out.println("c is:: "+c);

        System.out.println("Bye..program is ended");
    }
}
