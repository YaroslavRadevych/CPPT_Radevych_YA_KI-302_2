package KI302.RadevychVynnytskyi.Lab6;

public class Book implements Data {
    private String bookName;
    private int price;
    private double weight;

    public Book(String bookName, int price, double weight) {
        this.bookName = bookName;
        this.price = price;
        this.weight = weight;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        System.out.println("Book: " + bookName + ", Price: " + price + ", Weight: " + weight);
    }

    @Override
    public int compareTo(Data o) {
        Double w = weight;
        return w.compareTo(o.getWeight());
    }
}
