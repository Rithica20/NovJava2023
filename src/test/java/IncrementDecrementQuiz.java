public class IncrementDecrementQuiz {
    public static void main(String[] args) {
//        //Question 1
//        int i = 11;
//        i = i++ + ++i;
//
//        System.out.println(i);//24
//
//        //Question 2
//        int a=11, b=22, c;
//
//        c = a + b + a++ + b++ + ++a + ++b;
//
//        System.out.println("a="+a);//13
//        System.out.println("b="+b);//24
//        System.out.println("c="+c);//103
//
//        //Question 3
//        int i1=0;
//
//        i1 = i1++ - --i1 + ++i1 - i1--;
//        System.out.println(i1);//0
//
//        //Que:4
//
//        boolean b1 = true;
//        //b1++;//Operator '++' cannot be applied to 'boolean'
//        System.out.println(b1);

//        //Que:5
//        int i=1, j=2, k=3;
//
//        int m = i-- - j-- - k--;
//
//        System.out.println("i="+i);//0
//        System.out.println("j="+j);//1
//        System.out.println("k="+k);//2
//        System.out.println("m="+m);//-4
//
//        //Que:6
//        int a=1, b=2;
//        System.out.println(--b - ++a + ++b - --a);//0

//        //Que:7
//        int i=19, j=29, k;
//
//        int m = i-- - j-- - k--;
//        //Variable 'k' might not have been initialized
//
//        System.out.println("i="+i);
//        System.out.println("j="+j);
//        System.out.println("k="+k);

        //Que:8

        int m = 0, n = 0;
        int p = --m * --n * n-- * m--;
        System.out.println(p);

        //Que:9

        int a=1;
        a = a++ + ++a * --a - a--;
        System.out.println(a);

        //Que:10

//        int c = 11++;
        //Complie time error Variable expected
//        System.out.println(c);

        //Que:11
        int ch = 'A';
        System.out.println(ch++);//65

        //Que:12
        System.out.println(++ch);//67

        //Que:13
        double d = 1.5, D = 2.5;
        System.out.println(d++ + ++D);//5.0


    }

}
