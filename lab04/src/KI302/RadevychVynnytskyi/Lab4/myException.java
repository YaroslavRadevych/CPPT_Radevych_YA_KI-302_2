package KI302.RadevychVynnytskyi.Lab4;
/**
 * The myException class represents a custom exception related to arithmetic operations.
 */
public class myException extends ArithmeticException{
    public myException(){}
    public myException(String cause){
        super(cause);
    }
}
