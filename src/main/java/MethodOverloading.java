public class MethodOverloading {
    // Method overloading: Poly(many) + Morphism(forms) --> CompileTime(static binding)
    //within the same class if you have multiple methods:
    // 1. with the same name
    //2.  with the different type of parameters
    //3. differnt number of parameters
    //4. with the different in sequence of paramter
    //5. return type does not matter

    //byte, short, int, long

    public void test(int a){
        System.out.println("int");
    }

    public void test(Integer a){
        System.out.println("Integer");
    }




//    public void test(){ //0 params
//        System.out.println("hello");
//    }
//
//    public void test(String abc){ //1 param
//        System.out.println(abc);
//    }

    //practical usage::

    //1. search
    //2. login
    //3. doPayment


//    public void search(String productName){
//
//    }
//
//    public void search(String brandName, String colorName){
//
//    }
//
//    public void search(String brandName, String colorName, int price){
//
//    }


//    public void login(String un, String pwd){
//
//    }
//
//    public void login(String phoneNumber, int otp){
//
//    }


    //uber booking



    // public void booking()

    //spoint, endpoint, cartype

    //spoint, endpoint

    //spoint, endpoint, cartype, persons




//    //filter
//
//    - rating
//    - rsting, distance
//    - price,

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
//        Person p = new Person();
//        p.test((Integer) 20);
        mo.test(20);// this will print int
        mo.test((Integer) 20);// this will print integer
    }
}
