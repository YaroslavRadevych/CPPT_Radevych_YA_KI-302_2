/**
 * The package KI302.RadevychVynnytskyi.Lab4 contains classes and methods for solving tasks
 * related to computation and writing results to a file.
 */
package KI302.RadevychVynnytskyi.Lab4;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The Main class represents the main program class for user interaction.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fileName));
            try {
                System.out.println("Enter x: ");
                double x = in.nextDouble();
                double result = calc.tg4XDivX(x);
                System.out.println(result);
                fout.println(result);
            }
            catch (InputMismatchException ie){
                System.out.println("Enter a number, neither a char or a string");
            }
            finally {
                in.close();
                fout.flush();
                fout.close();
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Wrong file path");
        }
    }
}