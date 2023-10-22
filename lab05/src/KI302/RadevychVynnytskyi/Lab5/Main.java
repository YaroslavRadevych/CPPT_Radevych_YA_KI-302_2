package KI302.RadevychVynnytskyi.Lab5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileHandler object = new FileHandler();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x: ");
            double x = scanner.nextDouble();
            object.tg4XDivX(x);
            System.out.println("Result is: " + object.getResult());
            object.writeText("result.txt");
            object.writeBin("result.bin");

            object.readText("result.txt");
            System.out.println("Result from <<readText>> method: " + object.getResult());

            object.readBin("result.bin");
            System.out.println("Result from <<readBin>> method: " + object.getResult());

        } catch (InputMismatchException ex){
            System.out.println("Wrong data type!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
