/**
 * The main class represents the entry point of the program and provides a menu-driven interface
 * to interact with an assault rifle object.
 */
package KI302.RadevychVynnytskyi.Lab2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class main {
    /**
     * The main method where the program execution begins.
     *
     * @param args Unused command-line arguments.
     * @throws IOException          if there is an error related to file input/output.
     * @throws InterruptedException if a thread is interrupted during execution.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO Auto-generated method stub
        stormRifle ak47 = new stormRifle("AK-47", 7.62, 4.2, 880, 350, 30, 30, 2700, false, true, false, 111, 34);
        mainMenu(ak47);
    }

    @SuppressWarnings("null")
    public static void mainMenu(stormRifle gun) throws InterruptedException, IOException {
        while(true) {
            System.out.println("Main Menu: \n");
            System.out.println("1. Display Info");
            System.out.println("2. Automatic fire");
            System.out.println("3. Single fire");
            System.out.println("4. Install muffler");
            System.out.println("5. Remove muffler");
            System.out.println("6. Install scope");
            System.out.println("7. Remove scope");
            System.out.println("8. Reload the gun");
            System.out.println("9. Compare AK-47 with M4");
            System.out.println("10.Compare AK-47 with your gun");
            System.out.println("11.Shoot in the head");
            System.out.println("12.Shoot in the body");
            System.out.println("13.Exit\n");
            System.out.println("_________________");
            System.out.println("Select option: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            int exit = 0;

            switch(choice) {
                case 1:
                    clearConsole();
                    gun.getInfo();
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 2:
                    clearConsole();
                    gun.fullAutoFire();
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 3:
                    clearConsole();
                    System.out.println("How many shots should be done? ");
                    int shots = input.nextInt();
                    gun.singleFire(shots);
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 4:
                    clearConsole();
                    gun.installMuffler(gun.getMuffler());
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 5:
                    clearConsole();
                    gun.unistallMuffler(gun.getMuffler());
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 6:
                    clearConsole();
                    gun.installScope(gun.getScope());
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 7:
                    clearConsole();
                    gun.unistallScope(gun.getScope());
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 8:
                    clearConsole();
                    gun.reloadGun();
                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 9:
                    clearConsole();
                    assaultRifle m4 = new stormRifle("M4", 5.56, 3.39, 840, 600, 30, 30, 3100, true, true, false, 92, 28);
                    m4.compareGuns(gun, m4);

                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 10:
                    clearConsole();
                    Scanner gunName = new Scanner(System.in);
                    System.out.println("Enter name of your gun: ");
                    String name = "";
                    if (gunName.hasNextLine()){
                        name = gunName.nextLine();
                    } else {
                        System.out.println("Invalid input. Please enter a string.");
                        break;
                    }

                    System.out.println("Enter cartridge: ");
                    double cart = 0.0;
                    if (input.hasNextDouble()){
                        cart = input.nextDouble();
                    } else {
                        System.out.println("Invalid input. Please enter a double.");
                        break;
                    }

                    System.out.println("Enter mass: ");
                    double mass = 0.0;
                    if (input.hasNextDouble()) {
                        mass = input.nextDouble();
                    } else {
                        System.out.println("Invalid input. Please enter a double.");
                        break;
                    }

                    System.out.println("Enter length: ");
                    double length = 0.0;
                    if (input.hasNextDouble()) {
                        length = input.nextDouble();
                    } else {
                        System.out.println("Invalid input. Please enter a double.");
                        break;
                    }

                    System.out.println("Enter firing range: ");
                    int firingRange = 0;
                    if (input.hasNextInt()) {
                        firingRange = input.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        break;
                    }

                    System.out.println("Enter bullets capacity: ");
                    int bulletsCapacity = 0;
                    if (input.hasNextInt()) {
                        bulletsCapacity = input.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        break;
                    }

                    System.out.println("Enter price: ");
                    int price = 0;
                    if (input.hasNextInt()) {
                        price = input.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        break;
                    }

                    System.out.println("Enter if there is a scope: ");
                    boolean scope = false;
                    if (input.hasNextBoolean()) {
                        scope = input.nextBoolean();
                    } else {
                        System.out.println("Invalid input. Please enter a boolean.");
                        break;
                    }

                    System.out.println("Enter if there is a stock: ");
                    boolean stock = false;
                    if (input.hasNextBoolean()) {
                        stock = input.nextBoolean();
                    } else {
                        System.out.println("Invalid input. Please enter a boolean.");
                        break;
                    }

                    System.out.println("Enter if there is a muffler: ");
                    boolean muffler = false;
                    if (input.hasNextBoolean()){
                        muffler = input.nextBoolean();
                    } else {
                        System.out.println("Invalid input. Please enter a bool.");
                        break;
                    }

                    assaultRifle userGun = new stormRifle(name, cart, mass, length, firingRange, bulletsCapacity, bulletsCapacity, price, scope, stock, muffler, 92, 28);
                    clearConsole();
                    userGun.compareGuns(gun, userGun);

                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 11:
                    clearConsole();
                    gun.headShotKill(100,  111);

                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }
                case 12:
                    clearConsole();
                    gun.bodyShotKill(100, 34);

                    System.out.println("\nPress 0 - Back to Menu");
                    exit = input.nextInt();

                    if (exit == 0) {
                        clearConsole();
                        break;
                    }

            }
            if (choice == 13) {
                input.close();
                gun.closeLogFile();
                clearConsole();
                System.out.println("Exit...");
                break;
            }
        }
    }

    @SuppressWarnings("deprecation")
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // If the OS is Windows, use the "cls" command
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // If the OS is not Windows (e.g., Linux or macOS), use "clear"
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
}






