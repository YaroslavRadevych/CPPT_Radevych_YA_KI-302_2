package KI302.RadevychVynnytskyi.Lab4;
/**
 * The calc class contains methods for performing mathematical calculations.
 */
import javax.swing.*;

public class calc {
    /**
     * Calculates the tangent of 4 times the input value divided by the input value.
     *
     * @param x The input value for which to calculate the tangent.
     * @return The result of the tangent calculation.
     * @throws ArithmeticException If an exception occurs during the calculation.
     */
    public static double tg4XDivX(double x) {
        double res = 0;
        try {
            if (x == 0.0) throw new ArithmeticException();
            res = (Math.tan(4 * x)) / x;
        } catch (ArithmeticException ae) {
            if (x == 0.0){
                JOptionPane.showMessageDialog(null, "Can't divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The error cause is unknown", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return res;
    }
}

