package avengers_25_08_2022;

public class Test {
    public static void main(String[] args) {

        CustomMethods.methodC();  // how we call static method

        CustomMethods object = new CustomMethods();

        object.methodE(); // instance method
    }
}
