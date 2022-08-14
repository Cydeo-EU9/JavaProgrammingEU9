package week15;

public class MultiCatchExample02 {
    public static void main(String[] args) {
        // more specialized exception class statement should be first in the order

        String word = "Java";
        word = null;
        try {
            System.out.println(word.substring(20));     // unchecked exception : before compile it is not checked
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("e.getClass().getSimpleName() = " + e.getClass().getSimpleName());
        }catch (NullPointerException n){
            System.out.println("n.getClass().getSimpleName() = " + n.getClass().getSimpleName());
        }catch (RuntimeException runtimeException){
            System.out.println("t.getClass().getSimpleName() = " + runtimeException.getClass().getSimpleName());
        }


        System.out.println("some more code here");



    }

}
