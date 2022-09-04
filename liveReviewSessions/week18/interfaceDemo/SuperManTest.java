package week18.interfaceDemo;

public class SuperManTest {
    public static void main(String[] args) {

        Father superManOne = new Father();  // object reference type and object type is same
        superManOne.work("SDET");
        System.out.println("Makes "+superManOne.getPaid()+" Dollars");

        // polymorphism ----- Dynamic, Run Time
        // object reference type is Interface/Parent Class  =  Object Type is from child classes

        Parent superManTwo = new Father();

        superManTwo.playWithKid();
        ((Father)superManTwo).work("QA Engineer"); // Reference type decides what can be accessible.

        Worker superManThree = new Father();

        superManThree.work("Developer");
        ((Father)superManThree).playWithKid();

        superManTwo = new Mother(); // now our object reference can point to another object from the family
        superManTwo.playWithKid();

        // Object type decides to use most specific one.

        Parent father = new SuperFather();  // polymorphic way

        father.playWithKid();






    }
}
