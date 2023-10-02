package KI302.RadevychVynnytskyi.Lab2;
/**
 * Інтерфейс, який описує можливості для вбивства гравця в грі.
 * Інтерфейс визначає методи для виконання вбивства гравця з використанням різних типів влучань.
 */
public interface killPlayer {
    void bodyShotKill(int xp, int bodyDamage) throws InterruptedException;
    void headShotKill(int xp, int headDamage) throws InterruptedException;
}
