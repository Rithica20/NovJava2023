import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>(); //class in java by default
        //dynamic array
        System.out.println(al.size());

        //create an object of ArrayList using new keyword

        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al.size());

        al.add(40);
        al.add(50);
        al.add(60);


        System.out.println(al.size());


        //System.out.println(al.get(4));
        //System.out.println(al.get(-1)); //IOB
        //System.out.println(al.get(7)); //IOB

        al.add("sahil"); //by default, it will add to last memory address

        System.out.println(al);

        ArrayList<Object> empDataList = new ArrayList<Object>();
        empDataList.add("Manisha");
        empDataList.add(25);
        empDataList.add(34.55);
        empDataList.add('f');
        empDataList.add(true);


        System.out.println(empDataList);

        ArrayList<String> monthsList = new ArrayList<String>();
        monthsList.add("JAN");
        monthsList.add("FEB");


    }
}
