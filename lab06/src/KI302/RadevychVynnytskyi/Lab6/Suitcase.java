package KI302.RadevychVynnytskyi.Lab6;

import java.util.ArrayList;

public class Suitcase <T extends Data> {
    private ArrayList<T> arr;

    public Suitcase() {
        arr = new ArrayList<T>();
    }

    public T findMin() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(min) < 0) {
                    min = arr.get(i);
                }
            }
            return min;
        } return null;
    }

    public void addData(T data) {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }

    public void deleteData(int i) {
        arr.remove(i);
    }
}
