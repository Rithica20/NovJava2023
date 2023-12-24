import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
//        Q1: WAP to delete a specific number from the given array.
//        int p[] = {1,4,5,2,3,22,31, 2};
//        --Need to remove 22 from the p[] array.
//        --output should be: [1, 4, 5, 2, 3, 31, 2]

//        int p[] = {1,4,5,2,3,22,31,2};
//        int p2[]= {1,4,5,2,3,31,2};
//
//        for (int e:p2){
//            if(p[]!=p2){
//
//            }



        /** Q2: Write a program to create a static Array, having following cricket data:
         --name, age, team name, DOB, gender, Strike Rate
         --Try to create multiple Object Arrays for different players 
         --Try to print all the values of each player on the console
         **/
        Object player1[]={"Ms Dhoni",42,"India",1982,'M',147.32};
        Object player2[]={"Virat",38,"India",1982,'M',147.32};
        Object player3[]={"Rohit",32,"India",1982,'M',147.32};
        Object player4[]={"Jadeja",32,"India",1982,'M',147.32};

        System.out.println(Arrays.toString(player1));
        System.out.println(Arrays.toString(player2));
        System.out.println(Arrays.toString(player3));
        System.out.println(Arrays.toString(player4));

        /**
         Q3 : You need to do Concatenation of Array
         Input: nums = [1,2,1]
         Output: [1,2,1,1,2,1]
         Explanation: The array ans is formed as follows:
         - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
         - ans = [1,2,1,1,2,1]
         */
        int[] num = {1,2,1};
        int[] num1= {1,2,1};
        /*
         * int len1= num.length; int len2= num1.length;
         */
        int[] num3= new int[num.length+num1.length];//declares length
        for (int i=0;i<num.length;i++) {
            num3[i]=num[i];  //[1,2,1,0,0,0]
        }
        for (int i=0;i<num1.length;i++) {
            num3[i+num.length]=num1[i];   // [1,2,1,1,2,1]
        }
        System.out.println(Arrays.toString(num3));

    }

    }


