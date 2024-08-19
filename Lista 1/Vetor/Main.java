package Vetor;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 4; i++) {
            vector.add(i + 10);
        }

        for (int i = 0; i < vector.size(); i++) {
            System.out.println((i + 1) + ": " + vector.get(i));
        }
    }
}
