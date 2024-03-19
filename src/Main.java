import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Mercedes");
        car.add("BMW");
        car.add("Opel");

        car.ensureCapacity(6);
        car.add("Audi");
        car.add("Fiat");
        System.out.println(car);

        Collections.sort(car);
        Collections.reverse(car);
        Collections.shuffle(car);
        System.out.println(car);
    }
}