package week09;

public class PassArg {
    public static void main(String[] args) {

        sum(3,4);

        int x = sum2(3,4); // pass by arguments/values: need to be consistent with the methods parameters

        sum(x,4);

        double y = 3.3;

        sum((int)y,4); // explicit casting



    }

    public static void sum(int a, int b){  // functional method: that it does something but does not return anything
        System.out.println(a+b);
    }

    public static int sum2(int a, int b){ // inside parenthesis is called parameters for the method
        return a+b;
    }

}
