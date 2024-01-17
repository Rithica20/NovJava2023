package stringpractice;

public class StringsAreEqual {
    public static void main(String[] args) {
        //Write a program to check two different strings equality.
        String s = "rithica";
        String s1 = "RITHICA";

        System.out.println(s.equals(s1));

        //Remove all spaces in a String   For example:“ Hello Everyone “ Expected result: “HelloEveryone”.
        String s2= " Hello Everyone ";
        System.out.println(s2.trim());
        System.out.println(s2.replace(" ", ""));

        //Write a program that will print out the last character and first character of a word.

        String a= "Java";

        char lastchar = a.charAt(a.length()-1);
        System.out.println(lastchar);
        char firstchar = a.charAt(0);
        System.out.println(firstchar);

        //Write a program to verify a word or a character contained in the sentence.

        String string = "Selenium with java";

        if(string.contains("java")){
            System.out.println("He is a java programmer");
        }
        else System.out.println("he is not an java programmer");

        //Write a function/ method to reverse your own name.

        String name = "rihtica";
        String str ="";

        for (int i=name.length()-1;i>=0;i--){
            str = str + name.charAt(i);
            System.out.println(str);
        }

        // Write a program that gives you the last half of the string.

        String b = "half string";
        String str1 = b.substring(b.length()/2);
        System.out.println(str1);

        //Write a program to get the 3rd “ e “ of the string .

        String person ="engineer";
        System.out.println("----------");
        System.out.println(person.indexOf('e')); //first occurance
        System.out.println(person.indexOf('e', person.indexOf('e')+1)); //second occurance
        //third occurance
        System.out.println(person.indexOf('e', (person.indexOf('e', person.indexOf('e')+1))));

        //Write a method which gives an index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.

        // the answer is indexOf() this method gives -1 if string is not present and return int if string is present


        //Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .

        String msg ="I love java program";
        String[] splitmsg= msg.split(" ");
        for (String s4 :splitmsg){
            System.out.println(s4);
        }

        //Assume that a string consists of 3 words, print out the middle one.

        String word = "I am Java";
        String[] words = word.split(" ");
        String middleword = words[1];
        System.out.println(middleword);

        //get only numeric part from this String:

        String st = "your transaction id is: 12345 and reference id is 34567";

        String numericPart = st.replaceAll("[^0-9]", "");
        System.out.println("Numeric Part: " + numericPart);
    }

}
