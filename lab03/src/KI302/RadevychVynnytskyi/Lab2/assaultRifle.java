package KI302.RadevychVynnytskyi.Lab2;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
/**
 * Абстрактний клас `assaultRifle` представляє базовий клас для опису автоматичних гвинтівок.
 * Цей клас містить загальні властивості і методи, які можуть бути у спадкоємцях.
 */
abstract public class assaultRifle {
    private String name;
    private double cartridge;
    private double mass;
    private double length;
    private int firingRange;
    private int bulletsCapacity;
    private int bulletsCurrently;
    private int price;
    private boolean scope;
    private boolean stock;
    private boolean muffler;
    private PrintWriter fout;

    /**
     * Constructs an assaultRifle object with default values.
     *
     * @throws IOException if there is an error creating the log file.
     */

    public assaultRifle() throws IOException {
        name = null;
        cartridge = 0.0;
        mass = 0.0;
        length = 0.0;
        firingRange = 0;
        bulletsCapacity = 0;
        bulletsCurrently = 0;
        price = 0;
        scope = false;
        stock = false;
        muffler = false;
        fout = new PrintWriter(new File("Log.txt"));
    }

    public assaultRifle(String name, double cartridge, double mass, double length, int firingRange, int bulletsCapacity, int bulletsCurrently, int price, boolean scope, boolean stock, boolean muffler) throws IOException {
        this.name = name;
        this.cartridge = cartridge;
        this.mass = mass;
        this.length = length;
        this.firingRange = firingRange;
        this.bulletsCapacity = bulletsCapacity;
        this.bulletsCurrently = bulletsCurrently;
        this.price = price;
        this.scope = scope;
        this.stock = stock;
        this.muffler = muffler;
        fout = new PrintWriter(new File("Log.txt"));
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Cartridge: " + cartridge);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Length: " + length + " mm");
        System.out.println("FiringRange: " + firingRange + " m");
        System.out.println("Capacity of magazine: " + bulletsCapacity + " bullets");
        System.out.println("Bullets Balance: " + bulletsCurrently);
        System.out.println("Price: " + price + " $");
        System.out.println("Scope: " + scope);
        System.out.println("Stock: " + stock);
        System.out.println("Muffler: " + muffler);
        logActivity("Info printed");
    }

    private void logActivity(String message) {
        fout.println(message);
        fout.flush();
    }

    /**
     * Closes the log file.
     */
    public void closeLogFile() {
        fout.close();
    }

    public void fullAutoFire() throws InterruptedException {
        for (int i = bulletsCurrently; i >= 0; i--) {
            System.out.println(i + " bullets left");
            Thread.sleep(50);
            setBulletsCurrently(i);
        }
        System.out.println("Run out of bullets!");
        logActivity("Auto Fire executed");
    }


    public void singleFire(int shots) throws InterruptedException {

        if (shots <= getBulletsCurrently()) {
            for (int i = getBulletsCurrently(); i >= getBulletsCurrently() - shots; i--) {

                System.out.println(i + " bullets left");
                Thread.sleep(700);
            }
            setBulletsCurrently(getBulletsCurrently() - shots);
        } else {
            System.out.println(getBulletsCurrently() + " bullets left. You can't do more shots than bullets left");
        }
        logActivity("Single Fire executed");
    }

    public void installMuffler(boolean muffler) {
        if (muffler == false) {
            muffler = true;
            setMuffler(muffler);
            System.out.println("Muffler is installed");
            logActivity("Muffler installed");
        } else {
            System.out.println("Muffler is alredy installed");
        }

    }

    public void unistallMuffler(boolean muffler) {
        if (muffler == true) {
            muffler = false;
            setMuffler(muffler);
            System.out.println("Muffler is uninstalled");
            logActivity("Muffler uninstalled");
        } else {
            System.out.println("There is no muffler on this gun");
        }
    }

    public void installScope(boolean scope) {
        if (scope == false) {
            scope = true;
            setScope(scope);
            System.out.println("Scope is installed");
            logActivity("Scope installd");
        } else {
            System.out.println("Scope is alredy installed");
        }
    }

    public void unistallScope(boolean scope) {
        if (scope == true) {
            scope = false;
            setScope(scope);
            System.out.println("Scope is uninstalled");
            logActivity("Scope uninstalled");
        } else {
            System.out.println("There is no scope on this gun");
        }
    }

    public void reloadGun() {
        if (getBulletsCurrently() != 30) {
            setBulletsCurrently(getBulletsCapacity());
            System.out.println("The assault rifle is reloaded");
            logActivity("Gun reload");
        } else {
            System.out.println("The magazine is full");
        }
    }

    public void compareGuns(assaultRifle a, assaultRifle b) {
        a.getInfo();
        System.out.println();
        b.getInfo();
        logActivity("Guns comparison");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCartridge(double cartridge) {
        this.cartridge = cartridge;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setFiringRange(int firingRange) {
        this.firingRange = firingRange;
    }

    public void setBulletsCapacity(int bulletsCapacity) {
        this.bulletsCapacity = bulletsCapacity;
    }

    public int getBulletsCapacity() {
        return bulletsCapacity;
    }

    public int getBulletsCurrently() {
        return bulletsCurrently;
    }

    public void setBulletsCurrently(int bulletsCurrently) {
        this.bulletsCurrently = bulletsCurrently;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public boolean getMuffler() {
        return muffler;
    }

    public void setMuffler(boolean muffler) {
        this.muffler = muffler;
    }

    public boolean getScope() {
        return scope;
    }

    public void setScope(boolean scope) {
        this.scope = scope;
    }

}



