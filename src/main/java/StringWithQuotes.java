public class StringWithQuotes {
    public static void main(String[] args) {
        //Concept :: 1
        //Output :: I love "Java" Concepts

        String s = "I love \"Java\" concepts";
        System.out.println(s);
        String  s1 = "I love \"java\" and \"selenium\" concepts";
        System.out.println(s1);

        //Concept 2:
        String username = "sahil";
        String password = "Sahil@123";

        String url = "https://"+username+":"+password+"www.google.com";
        System.out.println(url);
        //output::
        //https://sahil:Sahil@123www.google.com

        //Concept 3::
        //xpath = //a[@text="sahil];

        String test = "sahil";
        String x = "//a[@text='sahil']";
        System.out.println(x);
    }
}
