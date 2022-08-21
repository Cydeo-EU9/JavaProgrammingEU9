package week16.abstractionExercise;

public abstract class Exercise {

    public double weight;

    public int minutes = 10;

    public Exercise(double weight){
        this.weight=weight;
    }

    public static void giveUpAndEatJunkFood(){
        System.out.println("If you don't feel like use the default static method");
    }
    public void start(){
        System.out.println("Warming up and starting the exercise");
    }

    public abstract int getCaloriesCount(int minutes);
    // no  body, no implememtation, sub classes will override, they are created in a way that, they meant to be overriden

    public abstract void perform();
}
