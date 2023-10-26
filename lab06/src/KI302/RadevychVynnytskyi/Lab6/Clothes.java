package KI302.RadevychVynnytskyi.Lab6;

public class Clothes implements Data {
    private String clothesName;
    private int price;
    private double weight;

    public Clothes(String clothesName, int price, double weight) {
        this.clothesName = clothesName;
        this.price = price;
        this.weight = weight;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Clothes: " + clothesName + ", Price: " + price + ", Weight: " + weight);
    }

    @Override
    public int compareTo(Data o) {
        Double w = weight;
        return w.compareTo(o.getWeight());
    }
}
