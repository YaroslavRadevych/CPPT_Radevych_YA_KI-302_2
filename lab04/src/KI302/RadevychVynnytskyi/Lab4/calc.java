package KI302.RadevychVynnytskyi.Lab4;
/**
 * The calc class contains methods for performing mathematical calculations.
 */
import java.io.*;

public class calc {
    /**
     * Calculates the tangent of 4 times the input value divided by the input value.
     *
     * @param x The input value for which to calculate the tangent.
     * @return The result of the tangent calculation.
     * @throws myException If an exception occurs during the calculation.
     */
    public static double tg4XDivX(double x) throws myException {
        double res = 0;
        try {
            res = (Math.tan(4 * x)) / x;
            if (Double.isNaN(res)){
                throw new myException();
            }

        } catch (myException ae) {
            if (x == 0.0){
                System.out.println("Can't divide by zero");
            } else {
                throw new myException("Unknown reason of exception");
            }
        }
        return res;
        }
}

