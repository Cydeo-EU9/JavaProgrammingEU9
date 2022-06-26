package week07;

public class TaskNestedLoop02 {
    /*
   	Write a Java program to print the following pattern
       	1
		10
		101
		1010
		10101
		101010

		101010
		10101
		1010
		101
		10
		1

		we have 6 rows, 6 columns
		pattern odd columns : "1", even column "0"
     */
    public static void main(String[] args) {

       /* for (int i = 0; i <= 5; i++) {
       for (int j = 0; j <= i; j++) {
          int m=3;
                int dummy=j + 1 + i +m;

                if (j %2== 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
     }
            System.out.println();


        }*/

        for (int i = 1; i <= 6; i++) {  // handles rows

            for (int j = 1; j <= i; j++) {  // handles column: column number is dependent of row number

                if (j % 2 == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        for (int i = 6; i >= 1; i--) {  // handles rows

            for (int j = 1; j <= i; j++) {  // handles column: column number is dependent of row number

                if (j % 2 == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();


        }

    }
}
