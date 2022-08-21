package week16;


class Test{              // we deleted final keyword so we can inherit
    void method(){       // we deleted final keyword so we can override
        System.out.println("Hello");
    }

    void method(int x){
        System.out.println(x);
    }
}

public class FinalKeyword extends Test{

    final int y;
    final static int z;

    public FinalKeyword(){
        y=5;
    }
    static {
        z=10;
    }
    void method(){
        System.out.println("I am trying override thye parent method");
    }

    public static void main(String[] args) {

        final int x ;   // local variable
       // x=5;
       // System.out.println(x);



    }
}
