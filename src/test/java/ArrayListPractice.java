import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        /**
         * 1. Write a Java program to create a new array list, which contains all color names.
         *--add some colors (string)
         *---and print out the colorslist using loop
         */
        ArrayList colors = new ArrayList<>(Arrays.asList("black","white","red","pink","peach"));
        System.out.println(colors);
        for (Object e:colors){
            System.out.println(e);
        }
        //2.Write a Java program to retrieve an element at a specified index from a given array list.
        System.out.println(colors.get(2));
        //3.Write a Java program to update specific array element by given element.
        colors.set(2,"blue");
        System.out.println(colors);
        //4. Write a Java program to remove the third element from an array list
        colors.remove(2);
        //5.Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
        for (Object e:colors){
            System.out.println(e);
            if (e.equals("white")){
                System.out.println("The color white is found");
                break;
            }
        }
        /**
         * Reverse this array List:
         *
         * ArrayList<String> studentNames = new ArrayList<String>();
         *studentNames.add("Varun");
         *studentNames.add("Reena");
         *studentNames.add("Naveen");
         *studentNames.add("Robin");
         *studentNames.add("Peter");
         */

        ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Varun");
        studentNames.add("Reena");
        studentNames.add("Naveen");
        studentNames.add("Robin");
        studentNames.add("Peter");

        System.out.println(studentNames);
        Collections.reverse(studentNames);
        System.out.println(studentNames);

        //7.Write a Java program to extract a portion of an array list.
        ArrayList girls = new ArrayList(Arrays.asList("fathu","yuveka","sandy","saje","prathiba"));
        System.out.println(girls.subList(1,3));

        //8.Write a Java program to empty an array list.
        studentNames.removeAll(studentNames);
        System.out.println(studentNames);
        //or
        studentNames.clear();

        //9.Write a Java program to trim the virtual capacity of an array list the current list size.
        ArrayList girls1 = new ArrayList(Arrays.asList("fathu","yuveka","sandy","saje","prathiba"));
        //as we know by default VC will be 10
        girls1.trimToSize();

        //10.Write a Java program to print all the elements of an arrayList using the position of the elements.
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }


    }
}
