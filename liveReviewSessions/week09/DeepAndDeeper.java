package week09;

public class DeepAndDeeper {
    public static void main(String[] args) {

        System.out.println("Not at deep");

        deep();

        System.out.println("Not at deep");


    }

    public static void deep(){
        System.out.println("Deep");
        deeper();
        System.out.println("Deep");
    }

    public static void deeper(){
        System.out.println("Deeper");
    }

}
