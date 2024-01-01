public class GreatestNumber {
    public static void main(String[] args) {
      int a =25;
      int b = 78;
      int c =87;
      int d =97;

      if(a>=b && a>=c && a>=d) {
          System.out.println("Hospital is the greatest number:: " + a);
      }
      else if (b>=a && b>=c && b>=d){
          System.out.println("B is the greatest number:: "+b);
          }
      else if(c>=a && c>=b && c>=d){
          System.out.println("C is the greatest number:: "+c );
      }
      else {
          System.out.println("D is the greatest number:: "+d);
      }
      }

}
