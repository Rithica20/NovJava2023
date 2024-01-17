package StringConcept;

public class StringMethods {
    public static void main(String[] args) {

        //
        String ts = "this is my java code";
        System.out.println(ts.toUpperCase());
        System.out.println(ts.toLowerCase()); //launch browser //chrome //CHROME


        //substring

        String msg = "hello username is sahil";
        System.out.println(msg.substring(2)); //
        System.out.println(msg.substring(2,  8));

        System.out.println("----------");
        System.out.println(msg.substring(msg.indexOf("is")+3, msg.length()));
        System.out.println(msg.substring(msg.indexOf("sahil")));


        //indexof()

        String s = "Hi ! I like automation";

        System.out.println(s.indexOf('i')); //first occurance
        System.out.println(s.indexOf('i', s.indexOf('i')+1)); //second occurance
        //third occurance

        System.out.println(s.indexOf("like"));


        //contains

        String name = "Hi! My name is sahil";

        if(name.contains("sahil"))
            System.out.println("sahil is present");
        else
            System.out.println("sahil is not present");

        //equals

        String p1 = "Hello Selenium";
        String p2 = "Hello selenium";

        System.out.println(p1==p2); //false
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.equalsIgnoreCase(p2)); //true


        //program

        //split

        String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";

        String[] pl = lang.split("_");
        System.out.println(pl[1]);

        //System.out.println(Arrays.toString(pl));

//		for(int i = 0; i <p1.length(); i++) {
//			System.out.println(pl[i]);
//		}

//		for(String p : pl) {
//			System.out.println(p);
//		}


        String top = "xXtestingXxXSeleniumXXxXAutomationxXXCypress";
        String tp[] = top.split("xX");

        System.out.println(tp[0]);
        System.out.println(tp[1]); //testingX
        System.out.println(tp[2]); //SeleniumXX

        String msg1 = "your name is sahil";

        System.out.println(msg1.split("is")[1].trim());

        String s5 = "Hi sahil this";

        String s6 = s5.replace(" ", "");
        System.out.println(s6);


        //Sahil7678@Kumar@#9876

        //System.out.println(text[1].trim());


        String d1 = "I Love \"Java\" and I am so happy";
        System.out.println(d1);

        //Arrays
        //String


    }
}
