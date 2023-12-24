import java.util.ArrayList;

public class ArrayListTraversing {
    public static void main(String[] args) {

        ArrayList<Integer> marksList = new ArrayList<Integer>();


        marksList.add(100);//0
        marksList.add(200);//1
        marksList.add(300);//2
        marksList.add(400);//3
        marksList.add(500);//4

        System.out.println(marksList);

        marksList.add(0,600);

        System.out.println(marksList);



//        marksList.remove(0);
//
//        System.out.println(marksList);

//        marksList.add(0, 450);
//
//        System.out.println(marksList);

//        System.out.println(marksList);
//
//        System.out.println(marksList.get(2));

        //index based loop

//        for(int i=0; i <marksList.size(); i++) {
//            System.out.println(marksList.get(i)); //100 200 300 hii 400 500
//            if(marksList.get(i).equals(300)){
//                System.out.println("hii");
//                break;
//            }
//        }

        // for-each loop
//
//        for(Integer e : marksList){
//            System.out.println(e);
//            if(e.equals(300)){
//                System.out.println("Hii");
//                break;
//            }
//        }

    }
}
