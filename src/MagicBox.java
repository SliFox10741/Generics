import java.util.Random;

public class MagicBox<T> {

    T[] items;

    public MagicBox() {
        this.items = (T[]) new Object[5];   
    }

    public boolean add(T item) {
        if (checkingForSpace()) {
            for (int i = 0; i < items.length; i++) {
                if (this.items[i] == null) {
                    this.items[i] = item;
                    return true;
                }
            }
        }
        return false;
    }

    public T pick() {
        if (!checkingForSpace()) {
            Random random = new Random();
            int randomInt = random.nextInt(5); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
            return this.items[randomInt];
        } else {
            int count = 0;
            for (int i = 0; i < items.length; i++) {
                if (this.items[i] == null) {
                    count++;
                }
            }

            throw new RuntimeException("В коробке есть ещё " + count + " место!!! Заполните и его.");
        }

    }

    private boolean checkingForSpace() {
        for (T item : this.items) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }
}
