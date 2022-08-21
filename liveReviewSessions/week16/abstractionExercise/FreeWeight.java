package week16.abstractionExercise;

public class FreeWeight extends Lifting{


    public FreeWeight(double weight) {
        super(weight);
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*6*(weight/100));
    }

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
