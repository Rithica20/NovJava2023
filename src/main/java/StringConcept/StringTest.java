package StringConcept;

public class StringTest {
    public static void main(String[] args) {
        String s =  "testing"; //String literal
        String s1 = new String("testing"); // String objects

        if(s == s1) {
            System.out.println("values are equal");
        }
        else {
            System.out.println("values are not equal");
        }

        System.out.println("--------------------");


        String s2 = "testing";

        if(s == s2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }




        String s3 = "java";
        s3 = null;


        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s3" is null
        //at StringConcept.StringTest.main(StringTest.java:36)

//		if(s3.equals("null")) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are not equal");
//		}


        String s4 = "java";
        String s5 = "java";

        String s6 = new String("java"); //1

        //total = 2

        String s7 = "Selenium";

        ////total = 3


        String t2 = new String("sahil");
        t2.intern();

        String z3 = "sahil";


        String top = "divya";
        String top1 = "divya";

        String top3 = new String("rohan");

        top = null;
        top1= null;

        String top4 = "rohan";

        System.out.println("-----------");
        System.out.println(top == top1);
        //System.out.println(top.equals(top1)); //NPE
        System.out.println(top4 == top3); //false
        System.out.println(top4.equals(top3)); //true



        //immutable - you cannot change the value
        //whenever you do any opeartion to a variable of string, the new value stores in heap memory not in string constant pool
        String z = "testing";
        String z1 = z.concat("automation"); //testing automation
        System.out.println(z);

        System.out.println(z1); //testingautomation

        String z4 = "testingautomation";

        String z5 = "testingautomation";

        System.out.println(z1==z4); //false

        System.out.println(z4==z5); //true



        String r = "   cypress   ";
        System.out.println(r.trim()); //cypress
        System.out.println(r); // "   cypress   "


//		//StringBuffer and Stringbuilder //mutable in nature
//
//		StringBuffer bf = new StringBuffer("testing");
//		bf.substring(0, 2);
//		System.out.println(bf);
//
        StringBuilder bf = new StringBuilder("sahil");
        bf.append("kumar");
        System.out.println(bf);


    }
}
