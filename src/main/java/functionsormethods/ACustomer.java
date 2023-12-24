package functionsormethods;

public class ACustomer {
    String name;
    int age;


    // cannot create a method within/inside a method
    //we can call a method from another method
    //methods are independent or parallel to each other


    //types of method
    // 1. no return and no input:
    // void - can not return anything -- no return keyword
    public void test() { // 0 parameter
        System.out.println("test method");
        int i = 10;
        System.out.println(i);
    }


    // 2. some return and no input:
    // return type: int
    public int sum() {
        System.out.println("sum method");
        int a = 10;
        int b = 20;
        int c = a + b;// 30
        return c;
    }

    // return type: String
    public String getTrainerName() {
        System.out.println("getting the trainer from NAL");
        String name = "naveen";
        int a = 100;
        return name;
    }

    public short getNumber() {
        System.out.println("getting number");
        return 100;
    }

    // 3. some return and some input:
    // return type: int
    // input params: a,b (int)
    public int add(int a, int b) { // parameters
        System.out.println("adding two numbers");
        int z = a + b;
        return z;
    }

    public int multiply(int a, int b) {
        System.out.println("multiplying two numbers");
        int mul = a * b;
        return mul;

    }

    public double getTotalMarks(double score, int handWritingScore, int attendScore) {
        System.out.println("calculating marks");
        double finalScore = score + handWritingScore + attendScore;
        return finalScore;
    }

    public void getURL() {
        System.out.println("print the url");
        return;
    }


    public static void main(String[] args) {

        ACustomer c = new ACustomer();
        c.name = "Sahil";
        c.age = 29;


        c.test();
        c.test();

        String trainerName =  c.getTrainerName();

        if(trainerName.equals("Sahil")){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


        // System.out.println(c.test()); //Syntax error

        double d =  c.getTotalMarks(90.5,2,3);

        System.out.println(d);

    }
}
