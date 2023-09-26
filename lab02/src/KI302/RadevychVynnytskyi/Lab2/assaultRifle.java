/**
 * The assaultRifle class represents a model of an assault rifle.
 */
package KI302.RadevychVynnytskyi.Lab2;
import java.io.IOException;
/**
 * This class defines the properties and behaviors of an assault rifle.
 * It includes attributes like name, cartridge, mass, length, firing range, bullets capacity,
 * bullets currently loaded, price, scope, stock, and muffler.
 *
 * @author RadevychVynnytskyi Yaroslav
 * @version 1.0
 * @since 1.0
 */
public class assaultRifle {
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
	 /**
     * Constructs an assaultRifle object with default values.
     *
     * @throws IOException if there is an error creating the log file.
     */
	
	public assaultRifle() throws IOException {
		name = "";
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
	}
	
	public void fullAutoFire() throws InterruptedException {
		for (int i = getBulletsCurrently(); i >= 0; i--) {
			System.out.println(i + " bullets left");
			Thread.sleep(50);
			setBulletsCurrently(i);
		}
		System.out.println("Run out of bullets!");
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
		}

	public void installMuffler(boolean muffler) {
		if (muffler == false) {
				muffler = true;
				setMuffler(muffler);
				System.out.println("Muffler is installed");
		} else {
				System.out.println("Muffler is alredy installed");
		}
	}
	
	public void unistallMuffler(boolean muffler) {
		if (muffler == true) {
			muffler = false;
			setMuffler(muffler);
			System.out.println("Muffler is uninstalled");
		} else {
			System.out.println("There is no muffler on this gun");
		}
	}
	
	public void installScope(boolean scope) {
		if (scope == false) {
			scope = true;
				setScope(scope);
				System.out.println("Scope is installed");
		} else {
				System.out.println("Scope is alredy installed");
		}
	}
	
	public void unistallScope(boolean scope) {
		if (scope == true) {
			scope = false;
			setScope(scope);
			System.out.println("Scope is uninstalled");
		} else {
			System.out.println("There is no scope on this gun");
		}
	}
	
	public void reloadGun() {
		if (getBulletsCurrently() != 30) {
			setBulletsCurrently(getBulletsCapacity());
			System.out.println("The assault rifle is reloaded"); 
		} else {
			System.out.println("The magazine is full");
		}
	}
	
	public void compareGuns(assaultRifle a, assaultRifle b) {
		a.getInfo();
		System.out.println();
		b.getInfo();
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



