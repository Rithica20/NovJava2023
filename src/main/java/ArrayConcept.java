public class ArrayConcept {
    public static void main(String[] args) {

        //static array
        //can store similar type of data


        int[] numbers = new int[4];
        //li = 0
        //hi = 3
        //range = 0 to 3
        //length = 4

        // numbers[-1] = 30; //.ArrayIndexOutOfBoundsException AIOB
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        // numbers[4] = 50; //.ArrayIndexOutOfBoundsException AIOB
        System.out.println(numbers[0]);

        double[] d = new double[4];

        d[0] = 1.1;
        d[1] = 2.2;
        d[2] = 3.6;
        d[3] = 4.8;

        char[] c = new char[4];

        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';
        c[3] = 'd';

        String[] browsers = new String[4];

        browsers[0] = "chrome";
        browsers[1] = "firefox";
        browsers[2] = "safari";
        browsers[3] = "edge";
        //employee
        //age int, name String, active boolean, salary double


        Object[] employee = new Object[4];

        employee[0] = 32;
        employee[1] = "Sahil";
        employee[2] = true;
        employee[3] = 20000.45;

        System.out.println(employee[2]);
    }
}
