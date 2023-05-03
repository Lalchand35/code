import java.util.*;

public class hastable {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "lalchand");
        map.put(2, "mishra");
        map.put(3, "kashyap");
        map.put(1, "   ");
        map.put(2, "lalchand");
        System.out.println("Iterator");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // System.out.println(map.getOrDefault(3, "not fund"));
        // System.out.println(map.getOrDefault(9, "is found"));
    }
}