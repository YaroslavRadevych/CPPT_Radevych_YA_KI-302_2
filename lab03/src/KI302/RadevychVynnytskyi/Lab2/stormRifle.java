package KI302.RadevychVynnytskyi.Lab2;

import java.io.IOException;
/**
 * Клас `stormRifle` представляє штурмову гвинтівку, яка є підкласом класу `assaultRifle` і реалізує інтерфейс `bodyshotKill та headshotKill`.
 */
public class stormRifle extends assaultRifle implements killPlayer{
    private int headDamage;
    private int bodyDamage;
    public stormRifle(String name, double cartridge, double mass, double length, int firingRange, int bulletsCapacity, int bulletsCurrently, int price, boolean scope, boolean stock, boolean muffler, int headDamage, int bodyDamage) throws IOException {
        super(name, cartridge, mass, length, firingRange, bulletsCapacity, bulletsCurrently, price, scope, stock, muffler);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
    }
    public void bodyShotKill(int xp, int bodyDamage) throws InterruptedException {
        int count = 0;

        System.out.println("Player health points: " + xp + "%");
        System.out.println(getName() + " body damage: " + bodyDamage + "\n");

        for (int i = getBulletsCurrently() - 1; i >= 0; i--){
            setBulletsCurrently(i);
            xp -= bodyDamage;
            System.out.println(i + " bullets left");
            Thread.sleep(700);
            count++;
            if (xp > 0){
                System.out.println("Enemy's health: " + xp + "%");
            } else{
                System.out.println("Enemy's health: 0%");
                System.out.println("Player was killed in " + count  + " shots");
                break;
            }
        }
    }
    public void headShotKill(int xp, int headDamage) throws InterruptedException {
        int count = 0;
        System.out.println("Player health points: " + xp + "%");
        System.out.println(getName() + " head damage: " + headDamage + "\n");
        for (int i = getBulletsCurrently() - 1; i >= 0; i--){
            setBulletsCurrently(i);
            xp -= headDamage;
            System.out.println(i + " bullets left");
            Thread.sleep(700);
            count++;
            if (xp > 0){
                System.out.println("Enemy's health: " + xp + "%");
            } else{
                System.out.println("Enemy's health: 0%");
                System.out.println("Player was killed in " + count  + " shot");
                break;
            }
        }
    }
}
