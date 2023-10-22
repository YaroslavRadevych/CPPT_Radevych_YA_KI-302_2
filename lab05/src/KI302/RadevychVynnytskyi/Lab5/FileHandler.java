package KI302.RadevychVynnytskyi.Lab5;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileHandler {
    private double result;

    public void writeText(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.println(result);
        f.close();
    }

    public void readText(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()){
                Scanner scanner = new Scanner(f);
                result = scanner.nextDouble();
                scanner.close();
            } else {
                throw  new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void writeBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    public void readBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    public double tg4XDivX(double x) {
        try {
            if (x == 0.0) throw new ArithmeticException();
            result = (Math.tan(4 * x)) / x;
        } catch (ArithmeticException ae) {
            if (x == 0.0){
                System.out.println("Can't divide by zero");
            } else {
                System.out.println("Error cause is unknown");
            }
        }
        return result;
    }
    public double getResult(){
        return result;
    }

}
