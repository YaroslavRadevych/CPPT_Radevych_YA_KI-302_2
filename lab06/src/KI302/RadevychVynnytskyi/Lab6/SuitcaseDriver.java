package KI302.RadevychVynnytskyi.Lab6;

public class SuitcaseDriver {
    public static void main(String[] args) {
        Suitcase<? super Data> suitcase = new Suitcase<Data>();
        suitcase.addData(new Clothes("Jeans", 100, 765));
        suitcase.addData(new Book("Thinking in Java", 55, 645));
        suitcase.addData(new Clothes("Shirt", 65, 434));
        suitcase.addData(new Book("The Iliad", 54, 327));

        Data res = suitcase.findMin();
        System.out.println("\nThe lightest thing in a suitcase: ");
        res.print();
    }
}
