import java.util.*;

public class hash3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "lalchand");
        map.put(2, "mishra");
        map.put(3, "kashyap");
        System.out.println("iterator");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }
}