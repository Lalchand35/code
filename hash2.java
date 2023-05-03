import java.util.*;

public class hash2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "lalchand");
        map.put(2, "mishra");
        map.put(3, "lalchand");
        map.put(4, null);
        map.put(1, "lalchand");
        System.out.println("iterator");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }
}