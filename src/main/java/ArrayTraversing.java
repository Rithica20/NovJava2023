public class ArrayTraversing {
    public static void main(String[] args) {


        int[] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;


        //System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers);


        //To iterate and array : we need for loop


        // index based loop

        for (int i=numbers.length-1; i>=0; i--){

            System.out.println(numbers[i]);

        }


        //for-each loop

//        int[] numbers = new int[4];
//
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//
//        for (int e : numbers){
//            if (e == 20)
//            {
//                System.out.println(e);
//                break;
//            }
//            System.out.println(e);
//        }

//        double[] d = new double[4];
//
//        d[0] = 1.1;
//        d[1] = 2.2;
//        d[2] = 3.6;
//        d[3] = 4.8;
//
//        for(double d1: d){
//            System.out.println(d1);
//        }


//        String[] browsers = new String[4];
//
//        browsers[0] = "chrome";
//        browsers[1] = "firefox";
//        browsers[2] = "safari";
//        browsers[3] = "edge";
//
//
//        for(String s : browsers){
//
//            if(s.equals("chrome")){
//                System.out.println("launch chrome");
//            }
//        }
    }
}
