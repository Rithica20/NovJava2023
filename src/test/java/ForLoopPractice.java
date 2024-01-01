public class ForLoopPractice {
    public static void main(String[] args) {
        // Q:1 print 10 to 1 using while loop
        for (int i = 10; i >= 1; i--)
            System.out.println(i);

        // Q:2  print "Hello World" ten times using while loop
        for (int i = 0; i <= 10; i++)
            System.out.println("Hello world");
       // to print all even number btwn 0 to 10 using while loop
        for(int i=0;i<=10;i=i+2)
            System.out.println(i);
        //  print all odd number btwn 0 to 10 using while loop
        for (int i=1;i<=10;i=i+2)
            System.out.println(i);
        //Q:3 print all multiples of 5 range 1 to 100
        for(int i=0;i<=100;i=i+5)
            System.out.println(i);
        //Q:4 Print Hospital-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while loop
        int a1 = 'a';
        int a2 ='A';
        int a3='0';
        for (;a1<='z';a1++)
            System.out.println(a1);
        for (;a2<='Z';a2++)
            System.out.println(a2);
        for (;a3<='9';a3++)
            System.out.println(a3);
//       // Q:5 Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.

        for (char ab='a';ab<='z';ab++){
            if (ab=='a' || ab=='e' || ab=='i' || ab=='o'|| ab=='u'){
                System.out.println("This is a vowel:: "+ab);
            }
        }
//        //Q:6 Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow"
        for (int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println("bye, see you tomorrow");
            }
            System.out.println(i);
        }
    }
}
