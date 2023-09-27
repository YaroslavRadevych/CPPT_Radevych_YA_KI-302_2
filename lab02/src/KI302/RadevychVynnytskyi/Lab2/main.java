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
		assaultRifle ak47 = new assaultRifle("AK-47", 7.62, 4.2, 880, 350, 30, 30, 2700, false, true, false);
		
		mainMenu(ak47);
	}
	
	@SuppressWarnings("null")
	public static void mainMenu(assaultRifle gun) throws InterruptedException, IOException {
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
			System.out.println("11.Exit\n");
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
				assaultRifle ak47 = new assaultRifle("AK-47", 7.62, 4.2, 880, 350, 30, 30, 2700, false, true, false);
				
				assaultRifle m4 = new assaultRifle("M4", 5.56, 3.39, 840, 600, 30, 30, 3100, true, true, false);
				
				m4.compareGuns(ak47, m4);
				
				System.out.println("\nPress 0 - Back to Menu");
				exit = input.nextInt();
				
				if (exit == 0) {
					clearConsole();
					break;
				}
			case 10:
				clearConsole();
				assaultRifle userGun = new assaultRifle();
				System.out.println("Enter name of your gun: ");
				String name = input.nextLine();
				userGun.setName(name);
				input.nextLine();
				
				
				
				System.out.println("Enter cartridge: ");
				double cart = input.nextDouble();
				
				userGun.setCartridge(cart);
				
				System.out.println("Enter mass: ");
				double mass = input.nextDouble();
				
				userGun.setMass(mass);
				
				System.out.println("Enter length: ");
				double length = input.nextDouble();
				
				userGun.setLength(length);
				
				System.out.println("Enter firing range: ");
				int firingRange = input.nextInt();
				
				userGun.setFiringRange(firingRange);
				
				System.out.println("Enter bullets capacity: ");
				int bulletsCapacity = input.nextInt();
				
				userGun.setBulletsCapacity(bulletsCapacity);
				userGun.setBulletsCurrently(bulletsCapacity);
				
				System.out.println("Enter price: ");
				int price = input.nextInt();
				
				userGun.setPrice(price);
				
				System.out.println("Enter if there is a scope: ");
				boolean scope = input.nextBoolean();
				
				userGun.setScope(scope);
				
				System.out.println("Enter if there is a stock: ");
				boolean stock = input.nextBoolean();
				
				userGun.setStock(stock);
				
				System.out.println("Enter if there is a muffler: ");
				boolean muffler = input.nextBoolean();
				
				userGun.setMuffler(muffler);
				
				assaultRifle AK47 = new assaultRifle("AK-47", 7.62, 4.2, 880, 350, 30, 30, 2700, false, true, false);
				
				clearConsole();
				userGun.compareGuns(AK47, userGun);
				
				System.out.println("\nPress 0 - Back to Menu");
				exit = input.nextInt();
				
				if (exit == 0) {
					clearConsole();
					break;
				}
			}
			if (choice == 11) {
				input.close();
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

	
		
	
	

