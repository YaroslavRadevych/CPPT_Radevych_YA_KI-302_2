/**
 * The package KI302.RadevychVynnytskyi.Lab4 contains classes and methods for solving tasks
 * related to computation and writing results to a file.
 */
package KI302.RadevychVynnytskyi.Lab4;

import javax.swing.*;
import java.io.*;
/**
 * The Main class represents the main program class for user interaction.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String fileName = JOptionPane.showInputDialog("Enter file name: ");
            PrintWriter fout = new PrintWriter(new File(fileName));
            try {
                double x = Double.parseDouble(JOptionPane.showInputDialog("Enter X value: "));
                double result = calc.tg4XDivX(x);

                if (result == 0) {
                    JOptionPane.showMessageDialog(null, "No result", "Result", JOptionPane.INFORMATION_MESSAGE);
                    fout.println("No result");
                } else {
                    JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
                    fout.println(result);
                }
            }
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Enter a number, neither a char or a string", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (NullPointerException npe) {
                System.exit(0);
            }
            finally {
                fout.flush();
                fout.close();
            }
        }
        catch (NullPointerException npe) {
            System.exit(0);
        }
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Wrong file path", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}