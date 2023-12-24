public class WhileLoop {
    public static void main(String[] args) {

//        //1 2 3 4 5 6 7 8 9 10
//
//
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);

        //use cses of while loop

        // we have to use while loop when number of iterations are not fixed
        //wait for the element on the page: 0, 2, 5, 10, 20
        //wait for the page loading: 0, 5, 10, 20
        //drop down values:
        //webtable pagination:
        //calendar:
        //carousel:-> the sliding ad panel in e-commerce websites
//        int i = 0;
//        while (i < 100){
//            System.out.println(i);
//        }// This is an infinte loop with result 0 why it is infinte
        // loop because we havent incremented the variable i
        // so the loop will not break as break statement is also not given
        // so it will print 0 infinte times

        int l = 1;
        while (l < 100) {
            System.out.println(l);
            l++;
            ++l;
            l = l + 1; // all these three statement will do same actions increment l as 1
        }

        int a = 1;
        while (a <= 10) {
            if (a == 5) {
                System.out.println("hi");
                break; // break statement is allowed inside loops not in conditional stataements
                // here if statement is used i  nside the loop so break is allowed
                // break statement will terminate the entire loop
            }
            System.out.println(a);///1 2 3 4 hi
            a++;
        }

//        while (true) {
//            System.out.println("Welcome to Taj Hotel 24*7");// infinte loop
//            // practical use case: message board in hotels,bars etc.
//        }

        int count=0;

        while(count <= 100){

            System.out.println(count);
            if(count == 25){
                System.out.println(25);
                break;
            }
            if(count == 50){
                System.out.println(50);
                break;
            }
            if(count == 100){
                System.out.println(100);
            }
            count++;
        }
    }
}
