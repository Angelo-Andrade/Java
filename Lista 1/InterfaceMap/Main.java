package InterfaceMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 25);
        ageMap.put("Sara", 30);
        ageMap.put("Alice", 28);

        System.out.println("Sara's age: " + ageMap.get("Sara"));
    }
}
