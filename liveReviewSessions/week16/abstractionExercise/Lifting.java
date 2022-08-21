package week16.abstractionExercise;

public abstract class Lifting extends Exercise {

    public Lifting(double weight) {
        super(weight);
    }

    abstract void endLift();
}
