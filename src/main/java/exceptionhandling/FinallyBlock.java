package exceptionhandling;

public class FinallyBlock {
    public static void main(String[] args) {

//		try {
//		int i = 9/0;
//		}cat



        try {
            int i = 9/0;
        }
        catch (ArithmeticException e) {
            System.out.println("AE is coming");
            e.printStackTrace();
        }

        finally {
            System.out.println("i am in finally block");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("test");
                e.printStackTrace();
            }
            finally {
                System.out.println("this is secong finally block");
            }
        }



    }
}
