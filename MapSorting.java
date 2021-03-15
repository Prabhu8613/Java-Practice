import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = getUnsortedMap();
        System.out.println("---------------------------------");
        System.out.println("Unsorted Map");
        unsortedMap.forEach((key, value) -> System.out.println(key + value));

        Map<String, Integer> ascendingOrder = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> ascendingOrder.put(x.getKey(), x.getValue()));
        System.out.println("---------------------------------");
        System.out.println("Ascending Order Sorted Map");
        ascendingOrder.forEach((key, value) -> System.out.println(key + value));

        Map<String, Integer> decendingOrder = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> decendingOrder.put(x.getKey(), x.getValue()));
        System.out.println("---------------------------------");
        System.out.println("Descending Order Sorted Map");
        decendingOrder.forEach((key, value) -> System.out.println(key + value));
        System.out.println("---------------------------------");
    }

    private static Map getUnsortedMap() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alex", 1);
        unsortedMap.put("Ram", 2);
        unsortedMap.put("Serious", 3);
        unsortedMap.put("Jamuna", 4);
        unsortedMap.put("Xavier", 5);
        unsortedMap.put("Brian", 6);
        return unsortedMap;
    }
}
