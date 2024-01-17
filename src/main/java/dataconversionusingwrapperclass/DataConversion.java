package dataconversionusingwrapperclass;

public class DataConversion {
    public static void main(String[] args) {

        String x = "100";

        System.out.println(x + 20); // 10020 //120

        // string to int
        // using wrapper classes

        // int ---> Integer
        // double --> Double
        // float --> Float
        // char --> Character
        // boolean ---> Boolean


        int a = Integer.parseInt(x); //100

        System.out.println(a+20);  //120


        System.out.println("--------------------------");

        String test = "100A";

        //int k = Integer.parseInt(test); //NumberFormatException

        //System.out.println(k);


        String s = "12.33";
        System.out.println(s+10);

        //StringTest to Double

        double d = Double.parseDouble(s);
        System.out.println(d+10);



        //STring to boolean
        String headless = "true";

        if(Boolean.parseBoolean(headless)) {
            System.out.println("headless browser");
        }
        else {
            System.out.println("launching normal browser");
        }

        //byte ---- Byte - 1byte = 8 bits ==  -128 to 127

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        //int to StringTest

        int i = 100; // "100"
        String x1 = String.valueOf(i);
        System.out.println(x1+20); //10020


    }
}
