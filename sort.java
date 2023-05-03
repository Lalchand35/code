import java.util.*;
//import java.TreeSet;

public class sort {
    public static void main(String[] args) {
        // SortedSet set = new TreeSet();
        SortedSet set = new TreeSet<>();
        set.add("lalcnd");
        // set.add(null);
        // set.add(10);
        set.add("mishra");
        set.add("chandu");
        set.add("ramu");
        set.add("kashyap");
        System.out.println(set);
        for (Object object : set) {
            System.out.println(object);
        }
        System.out.println("first element" + set.first());
        System.out.println("last element" + set.last());

    }
}