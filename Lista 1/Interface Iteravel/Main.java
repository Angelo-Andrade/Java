package IntefaceIteravel;

public class Main {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(3);
        for(int i=0; i<4; i++) collection.add("Item 1");

        for (String item : collection) {
            System.out.println(item);
        }
    }
}
