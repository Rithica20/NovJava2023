package exceptionhandling;

public class ThrowsKeyword {
    public void m1() throws ArithmeticException  {
        System.out.println("m1");
        m2();
    }

    public void m2() throws ArithmeticException {
        System.out.println("m2");
        m3();
    }

    public void m3() throws ArithmeticException {
        System.out.println("m3");
        try {
            int i = 9/0;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
        System.out.println("hello");
        int i = 9/0;

//		catch(Exception e) {
//			e.printStackTrace();
//		}		System.out.println("hello");
//		}
    }


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
