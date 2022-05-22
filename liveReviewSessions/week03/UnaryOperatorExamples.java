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

    }
}
