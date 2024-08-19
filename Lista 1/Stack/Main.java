package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (int i=0; i < 4; i++) stack.push("Elemento " + i);
        String itemRemoved = stack.pop();
        System.out.println("Popped from stack: " + itemRemoved);
    }
}
