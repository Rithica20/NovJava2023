public class ConditionalOperators {
    public static void main(String[] args) {
        //Conditional Operator ....... >,<,>=,<= ---- primitive datatype
        //StringTest
        int x = 10;
        int y = 10;
        //System.out.println(x==y);

//        if(x==y){
//            System.out.println("values are equal");
//        }
//        else {
//            System.out.println("values are not equal");
//        }
//
//        if(x>=y){
//            System.out.println("x is greater or equal to y");
//        }
//        else {
//            System.out.println("x is smaller than y");
//        }


        boolean flag = false;
        if(flag) {
            System.out.println("Hiii");
        }
        else {
            System.out.println("hello bye");
        }

        double d1 = 12.33;
        double d2 = 12.34;
        if(d1==d2) {
            System.out.println("both are eq");
        }
        else {
            System.out.println("both are not eq");
        }

        char c1 = 'a';//97
        char c2 = 'a';
        if(c1 == 98) {
            System.out.println("c1 and c2 are eq");
        }
        //nested-if else situation
        int marks = 84;
        if(marks < 100){
            System.out.println("correct marks"); //
            if(marks > 90) {
                System.out.println("A Grade");

                if (marks >= 95) {
                    System.out.println("eligible for scolorship");
                } else {
                    System.out.println("not eligible for scolorship");
                }
            }
            else {
                System.out.println("B Grade");
            }
        }
        else {
            System.out.println("incorrect marks");
        }

        //parallel if situtation

//        StringTest browser = "opera";
//
//        if(browser.equals("chrome")){
//            System.out.println("launch chrome");
//        }
//        if(browser.equals("firefox")){
//            System.out.println("launch firefox");
//        }
//        if(browser.equals("edge")){
//            System.out.println("launch edge");
//        }
//        if(browser.equals("safari")){
//            System.out.println("launch safari");
//        }
//        else {
//            System.out.println("please enter valid browser name"+ browser);
//        }
        // launch chrome
        // please enter valid browser name chrome



        //      if - elseif
//		StringTest browser = "edge";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		else {
//			System.out.println("plz pass the right browser...."+ browser);
//		}

//        StringTest browser = "sahil";
////required: 'char, byte, short, int, Character, Byte, Short, Integer, StringTest, or an enum'
//        switch (browser){
//
//            case "chrome":
//                System.out.println("launch chrome");
//                break;
//            case "firefox":
//                System.out.println("launch firefox");
//                break;
//            case "edge":
//                System.out.println("launch edge");
//                break;
//            default:
//                System.out.println("plz pass the right browser...."+ browser);
//        }

        int marks1 = 95;
        switch (marks1) {
            case 10:
                System.out.println("grade D");
                break;
            case 95: {
                if (marks1 > 90) {
                    System.out.println("grade A");
                } else {
                    System.out.println("Grade B");
                }
            }
            break;

            default:
                System.out.println("FAIL");
                break;
        }

    }

}

