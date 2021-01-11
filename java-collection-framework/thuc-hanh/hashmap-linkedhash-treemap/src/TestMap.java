import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Tu", 30);
        hashMap.put("Thang",31);
        hashMap.put("Hai",29);
        hashMap.put("Phuoc", 29);
        System.out.println("cac muc trong hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Tu", 30);
        treeMap.put("Thang",31);
        treeMap.put("Hai",29);
        treeMap.put("Phuoc", 29);
        System.out.println("cac muc trong treemap");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Tu", 30);
        linkedHashMap.put("Thang",31);
        linkedHashMap.put("Hai",29);
        linkedHashMap.put("Phuoc", 29);
        System.out.println("cac muc trong linkedhashmap");
        System.out.println(linkedHashMap + "\n");

        Map<String, Integer> linkedHashMap1 = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap1.put("Smith", 30);
        linkedHashMap1.put("Anderson", 31);
        linkedHashMap1.put("Lewis", 29);
        linkedHashMap1.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap1.get("Lewis"));
    }
}
