import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (int i=0; i < 4; i++) stack.push("Element 1");
        String itemRemoved = stack.pop();
        System.out.println("Popped from stack: " + itemRemoved);
    }
}