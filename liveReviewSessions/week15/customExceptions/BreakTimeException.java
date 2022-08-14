package week15.customExceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(String message){
        super(message);  // calling super class constructor
    }
}
