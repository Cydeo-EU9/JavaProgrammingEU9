package week18.interfaceDemo;

public class Mother extends Parent{

    @Override
    public void raiseKid() {
        System.out.println("Raising the kid");
    }

    @Override
    public void playWithKid() {
        System.out.println("Playing most of the time with kids");
    }

    @Override
    public void feedKid() {
        System.out.println("Preparing the food");
    }
}
