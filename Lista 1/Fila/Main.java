package Fila;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        String itemRemoved = queue.remove();
        System.out.println("Removed: " + itemRemoved);
    }
}
