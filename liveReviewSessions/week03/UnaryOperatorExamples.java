package week03;

public class UnaryOperatorExamples {
    public static void main(String[] args) {
        int a = 25;

        System.out.println(++a);// 26 pre-increment
        System.out.println(--a); // 25 pre-decrement

        int b = 25;

        System.out.println(b++); // first use the value then increase   --- print 25 then increase to 26
        System.out.println(b--); // 26 first use the value then decrease
        System.out.println(b); // 25

        System.out.println("----Unary Tasks-----");
        // Task 18
        int x = 2;
        int y = x++;
        System.out.println("y = " + y); // 2
        System.out.println("x = " + x); // 3

        a = 50;

        a = --a + a++ + a-- + a++; // 49+ 49 + 50 + 49  :
        System.out.println("a = " + a); // 197

    }
}
