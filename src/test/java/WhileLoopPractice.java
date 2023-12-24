public class WhileLoopPractice {
    public static void main(String[] args) {
        //Q:1 print 10 to 1 using while loop
//        int a=10;
//        while (a>=1){
//            System.out.print(a);
//            a--;
//        }


        //Q:2  print "Hello World" ten times using while loop
//        int b=1;
//        while (b<=10){
//            System.out.println("Hello world");
//            ++b;
//        }
        //to print all even number btwn 0 to 10 using while loop
//        int c=0;
//        while (c<=10){
//            System.out.println(c);
//            c=c+2;
//        }
        //  print all odd number btwn 0 to 10 using while loop
//        int c=1;
//        while (c<=10){
//            System.out.println(c);
//            c=c+2;
//        }
        //Q:3 print all multiples of 5 range 1 to 100
//        int c=0;
//        while (c<=100){
//            System.out.println(c);
//            c=c+5;
//        }
        //Q:4 Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while loop
//        int a1 = 'a';
//        int a2 ='A';
//        int a3='0';
//        while (a1<='z'){
//            System.out.println(a1);
//            a1++;
//        }
//        while (a2<='Z'){
//            System.out.println(a2);
//            a2++;
//        }
//        while (a3<='9'){
//            System.out.println(a3);
//            a3++;
//        }
        //Q:5 Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
//        char ab='a';
//        while (ab<='z'){
//            if (ab=='a'){
//                System.out.println(ab);
//            }
//            if (ab=='e'){
//                System.out.println(ab);
//            }
//            if (ab=='i'){
//                System.out.println(ab);
//            }
//            if (ab=='o'){
//                System.out.println(ab);
//            }
//            if (ab=='u'){
//                System.out.println(ab);
//            }
//            ab++;
//        }
        char ab='a';
        while (ab<='z'){
            if (ab=='a' || ab=='e' || ab=='i' || ab=='o'|| ab=='u'){
                System.out.println(ab);
            }
            ab++;
        }
        //Q:6 Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow"
        int i = 1;
        while (i<=10){
            if(i==7){
                System.out.println("bye, see you tomorrow");
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
