package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        colors.add("Strawberry");
        colors.add("Peach");
        colors.add("Mango");
        colors.add("Apple");
        colors.add("Blueberry");

        Collections.sort(fruits, Collections.reverseOrder());
        for(String fruit : fruits) System.out.println(fruit);
    }
}
