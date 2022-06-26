package week07;

public class WhileHungry {
    public static void main(String[] args) {
        int bananasEaten = 0; // initialization
        int countToFull = 3;

        while (true){  // condition
            if(bananasEaten==countToFull){
               break;
               // System.exit(0);
            }
            bananasEaten++;  // iteration

            System.out.println("Eating a banana: \uD83C\uDF4C "+ bananasEaten);
        }
    }
}
