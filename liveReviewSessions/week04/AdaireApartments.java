package week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {

        int floorNumber; // Declaring my variable no value

        Scanner input = new Scanner(System.in);

        // ask the user for which floor the user is living

        System.out.println("which floor are you living?");

        floorNumber = input.nextInt();

        // with if else statements

        if(floorNumber == 1){   // condition
            System.out.println("You are living at First Floor");  // action
        }else if(floorNumber==2){
            System.out.println("You are living at Second Floor");
        }else if(floorNumber==3){
            System.out.println("You are living at Third Floor");
        }else {
            System.err.println("There is NO such floor");
        }

        input.close();


    }
}
