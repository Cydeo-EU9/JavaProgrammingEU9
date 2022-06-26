package week07;

public class TaskNestedLoop01 {
    /*
    rowCount:5
    columnCount:5
    1                               : rowCount-1
    2 "4" 6                         : rowCount-1, rowCount-2
    3 "4" 7 "3" 10                  : rowCount-1, rowCount-2, rowCount-3
    4 "4" 8 "3" 11 "2" 13
    5 "4" 9 "3" 12 "2" 14 "1" 15

    What is repeating?
    How is it repeating?
    Algorithm:
    Nested Loop
    Outer loop should handle rows
    inner loop should handle columns
  */

    public static void main(String[] args) {
        int rowCount = 5;
        for(int row=1; row<=rowCount;row++){
            int value = row;  // value variable holds printing value
            for(int col = 1; col<=row ; col++){
                System.out.print(value+" ");
                value += rowCount - col;
            }
            System.out.println();
        }
    }
}
