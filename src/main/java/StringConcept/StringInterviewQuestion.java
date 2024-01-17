package StringConcept;

public class StringInterviewQuestion {
    public static void main(String[] args) {

        String s1 = "JavaProgram";
        String s2 = "Java";
        String s3 = s2.concat("Program");
        String s4 = "Java"+"Program";

        System.out.println(s1==s2); //false
        System.out.println(s1==s4); //true




    }
}
