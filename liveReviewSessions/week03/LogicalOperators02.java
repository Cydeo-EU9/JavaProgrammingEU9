package week03;

public class LogicalOperators02 {
    public static void main(String[] args) {

        int b = 2;

    //    boolean res = ++b == 2 || --b == 2 && --b == 2 ;
        boolean res = ++b == 2 || b == 2 && --b == 2 ;
  //   false && ------- does not matter
        System.out.println("res = " + res); // false
        System.out.println("b = " + b);  // 3


    }
}
