public class MainMethodConcept {


    // only for calling purpose
    // no buisness logics can be  written
    // manin method can not return anything
    // CMA - as it is static method it will be in common memory allocation
    // we can have more than one main method in a class but
    // JVM will call only the main method which is in this format  public static void main(String[] args)
    // no need to create an object for it. --- ///JVM ----MainMethodConcept.main();
    // main method can be overloaded - it is possible

    static int a = 10;

    public static void A() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        System.out.println("Hi");
        MainMethodConcept.main(20);
        MainMethodConcept.main(20,30);
    }
    public static void main(int a) {

        System.out.println("Hello");
    }
    public static void main(int a, int b) {

        System.out.println("Hello Sahil");
    }
}
