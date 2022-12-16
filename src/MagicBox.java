import java.util.Random;

public class MagicBox<T> {

    T[] items = null;

    public MagicBox () {
         items = (T[]) new Object[5];
    }

    public boolean add(T item){
        if (checkingForSpace()){
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    return true;
                }
            }
        }
        return false;
    }

    public T pick(){
        if (!checkingForSpace()){
            Random random = new Random();
            int randomInt = random.nextInt(5); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
            return items[randomInt];
        }
        else{
            RuntimeException runtimeException = new RuntimeException("Коробка ещё не полна");
        }
        return null;
    }

    private boolean checkingForSpace () {
        for (T item : items) {
            if (item == null) {
                return false;
            }
        }
        return true;
    }
}
