package week03;

public class LogicalOperators {
    public static void main(String[] args) {
        
        int A = 20;
        int O = 30;
        int P = 30;

        // Interview Question asked, tricky

        boolean comp = A < O || --O >=P; // true || false : Logical OR if the first Expression is True; it does not compile second part of OR operator

        System.out.println("comp = " + comp);
        System.out.println("O = " + O);


        boolean compTwo = A > O || O-- >= P;  // false || true : true   O = 29
        System.out.println("compTwo = " + compTwo);
        System.out.println("O = " + O);


        boolean compThree = A > O && ++O >= P; // false && compiler does not check
        System.out.println("compThree = " + compThree);
        System.out.println("O = " + O);  // 29

    }

}
