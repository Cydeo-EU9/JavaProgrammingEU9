package week18.interfaceDemo;

public class Father extends Parent implements Worker {


    @Override
    public void raiseKid() {
        System.out.println("Helping mom to raise the kids");
    }

    @Override
    public void playWithKid() {
        System.out.println("Playing with the kid occasionally");
    }

    @Override
    public void feedKid() {
        System.out.println("Providing supplies to Home");
    }

    @Override
    public void work(String work) {
        System.out.println("Working very hard as "+ work);
    }

    @Override
    public double getPaid() {
        return 100_000.0;
    }
}
