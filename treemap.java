import java.*;
import java.util.Map;
import java.util.TreeMap;

//import sun.reflect.generics.tree.Tree;
public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "lalchand");
        map.put(2, "mishra");
        map.put(3, "kahyap");
        map.put(4, "  ");
        map.put(1, "shyam");
        System.out.println("iterator");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());

        }
    }
}
