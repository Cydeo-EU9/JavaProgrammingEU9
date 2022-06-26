package week07;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
     /*
        Create a loop that will generate 8 character password randomly
      */
        String password = "";

        Random random = new Random();  // create random object

        int randomIndex;

        for(int i=0; i<8 ; i++){
           randomIndex = random.nextInt(source.length()); // generate random index numbers
            password+=source.charAt(randomIndex);
        }

        System.out.println("password = " + password);
    }
}
