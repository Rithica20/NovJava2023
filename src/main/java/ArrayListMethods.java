import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        //Concept 1:: Assigning the virtual capacity
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
        //vc=5, pc=0
        //vc=0, pc=5 ..vc=pc/2 = 2 .....load factor
        //vc=2, pc=5

        //Concept 2:: to delete an value   we need to pass in object
        ArrayList<Integer> marksList = new ArrayList<Integer>();


        marksList.add(100);//0
        marksList.add(200);//1
        marksList.add(300);//2
        marksList.add(400);//3
        marksList.add(500);//4

        System.out.println(marksList);

        marksList.remove((Object) 300); //because if it is integer remove method considers it as index so we need to
        // specify the Wrapper class of that data type

        System.out.println(marksList);

//
//        ArrayList<String> browserName = new ArrayList<>();
//
//        browserName.add("chrome");
//        browserName.add("firefox");
//        browserName.add("edge");
//
//        System.out.println(browserName);
//
//        browserName.remove("chrome");
//
//        System.out.println(browserName);

        //Concept 3:: To have an ArrayList Literals

        // int[] arr = {1,2,3,4,5};

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        for (Integer e : arrayList1) {
            System.out.println(e);
        }

        ArrayList<String> browserName = new ArrayList<>(Arrays.asList("chrome", "firefox", "edge", "safari", "opera"));

        System.out.println(browserName); //normal list

        //Concept 4:: TO reverse Array List
        Collections.reverse(browserName); //reverse
        System.out.println(browserName); //reversed list


        //index based loop

        for (int i = browserName.size() - 1; i >= 0; i--) {
            System.out.println(browserName.get(i));
        }


        //Concept 5 :: To convert an Array to ArrayList

        String[] browsers = {"chrome", "firefox", "edge"};
        List<String> browserList = Arrays.asList(browsers);
        System.out.println(browserList);
        System.out.println(browserList.size());


        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numbersList = Arrays.asList(numbers);
        System.out.println(numbersList);
        System.out.println(numbersList.size());

        Object[] employee = {"sahil", 29, 20000.00, 'm', true};
        List<Object> employeeList = Arrays.asList(employee);
        System.out.println(employeeList);
        System.out.println(employeeList.size());

        //Concept 6 :: One more method to declare ArrayList

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("sahil");
//        arrayList2.add("divya");
//        arrayList2.add("sahil");

        ArrayList<String> arrayList2 = new ArrayList<>(){
            {
                add("sahil");
                add("divya");
                add("Rithica");
            }
        };

        //JDK 1.9 or Java19
        //Concept 7 :: Immutable List :: You cannot add or remove the element from the list

        List<Integer> listOf = List.of(1,2,3,4,5);
        System.out.println(listOf);
        System.out.println(listOf.size());

        //Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        //	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        //	at ArrayListMethods.main(ArrayListMethods.java:114)
//        listOf.add(6);
//        System.out.println(listOf.size());



        //Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        //	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        //	at ArrayListMethods.main(ArrayListMethods.java:114)
//        listOf.remove((Object)5);
//        System.out.println(listOf.size());


        //Concept 8:: trimToSize()

        ArrayList arrayList3 = new ArrayList(100);

        arrayList3.add("chrome");
        arrayList3.add("firefox");
        arrayList3.add("edge");
        //vc = 97, pc = 3

        System.out.println(arrayList3); //
        System.out.println(arrayList3.size()); //3

        arrayList3.trimToSize();
        //vc = 3, pc = 3

        System.out.println(arrayList3); //
        System.out.println(arrayList3.size()); //3


        //Concept 9: Swap the list
        System.out.println("*****************");

        ArrayList arrayList4 = new ArrayList(Arrays.asList(1,2,3,4,5));

        System.out.println(arrayList4);

        Collections.swap(arrayList4, 0, 1);

        System.out.println(arrayList4);

        Collections.reverse(arrayList4);

        System.out.println(arrayList4);


        //Concept 10 :: Sorting the list

        ArrayList arrayList5 = new ArrayList(Arrays.asList(22,12,45,64,78));

        Collections.sort(arrayList5);
        System.out.println(arrayList5);

        Collections.reverse(arrayList5);
        System.out.println(arrayList5);

        //sorting, reversing, swapping


        //Assignment
        //add a value in the middle of the list
        //1,2,3,4,5,6,7


        ArrayList arrayList6 = new ArrayList(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(arrayList6);

        int mid = arrayList6.size()/2;

        arrayList6.add(mid, 10);

        System.out.println(arrayList6);




//        ArrayList<Integer> arr = new ArrayList<>(1,2,3,4,5,6);
//        arr.add(3,10); or
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);arr.add(6);arr.add(7);
//        sysout(arr);
//        arr.add(index:3 value:10)

    }
}
