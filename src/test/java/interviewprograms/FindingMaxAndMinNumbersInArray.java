package interviewprograms;

public class FindingMaxAndMinNumbersInArray {

    public static void main(String[] args) {

        int a[] ={10,20,40,5,80,70,100,59};
        int max = a[0];
        int min = a[0];

        for (int i=1;i< a.length;i++){

            if(a[i]>max){
                max = a[i];
            }
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("The maximum number in this array::"+max);
        System.out.println("The minimum number in this array::"+min);
    }
}
