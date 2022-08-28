package week17;

public class TestEdible {
    public static void main(String[] args) {


          //  Object[] objects = {new Tiger(), new Chicken(), new Apple()};
          // ((Tiger)objects[0])

           // instanceof : this checks if an object belongs to a certain class--> Returns boolean
Tiger tiger = new Tiger();
Chicken chicken = new Chicken();
Apple apple = new Apple();

            // store objects in a data structure: Array
        Object[] objects = {tiger,chicken,apple}; // same with {new Tiger(), new Chicken(), new Apple()}

        tiger.sound();
        chicken.sound();
        chicken.howToEat();  // coming from interface
        apple.howToEat(); // interface

        Edible.staticMethod();  // how we call a static method, with Interface name
       // Chicken.staticMethod();  static classes belongs to the classes or interfaces
        chicken.someMethod(); // I am calling default method with object name
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

abstract class Fruit implements Edible,moreInterface{ // implementing abstract methods in interface is optional now
}
class Apple extends Fruit{
 @Override
    public String howToEat() {
        return "Make apple cider and drink";
    }

    @Override
    public void someMethod2() {

    }
}
class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }

    @Override
    public void someMethod2() {

    }

//    @Override
//    public void someMethod(){
//
//    }


}
interface moreInterface{
    void someMethod2();
}


