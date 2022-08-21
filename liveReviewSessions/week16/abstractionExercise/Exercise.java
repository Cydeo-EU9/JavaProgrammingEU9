package week16.abstractionExercise;

public abstract class Exercise {

    public double weight;

    public Exercise(double weight){
        this.weight=weight;
    }

    public void start(){
        System.out.println("Warming up and starting the exercise");
    }

    abstract int getCaloriesCount(int minutes);
    // no  body, no implememtation, sub classes will override, they are created in a way that, they meant to be overriden

    abstract void perform();
}
