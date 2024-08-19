package InterfaceCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExercise {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        for(int i=0; i<6; i++) numbers.add(i + 10);
        System.out.println("Total numbers: " + numbers.size());
    }
}
