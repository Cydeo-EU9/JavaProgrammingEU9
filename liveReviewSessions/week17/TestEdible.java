package week17;

public class TestEdible {
    public static void main(String[] args) {

    }
}

interface Edible{
    // Describes how to eat that object
    String howToEat();  // implicitly public abstract

    default void someMethod(){
        System.out.println("I am from Interface, default method");
    }
    static void staticMethod(){
        System.out.println("I am static method from the interface");
    }
}

abstract class Animal{
    // return animal sound
    public abstract String sound(); // we have to put abstract key word
}

class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "Chicken : cock-a-doodle-do";
    }
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
class Tiger extends Animal{
    @Override
    public String sound() {
        return "Tiger : Roars";
    }
}

abstract class Fruit implements Edible{ // implementing abstract methods in interface is optional now
}
class Apple extends Fruit{
 @Override
    public String howToEat() {
        return "Make apple cider and drink";
    }
}
class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }

//    @Override
//    public void someMethod(){
//
//    }
}


