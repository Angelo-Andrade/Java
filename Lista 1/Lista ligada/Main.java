import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i < 4; i++) list.add("Elemento " + i);
        list.addFirst("Element 0");
        for(String element : list) System.out.println(element);
    }
}
