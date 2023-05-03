import java.util.*;
public class hash 
{
public static void main(String[]args)
{
    HashSet h =new HashSet<>();
    h.add("mishra");
    h.add("lalchand");
    h.add(1);
    h.add(null);
    h.add(null);
    System.out.println(h);
    h.add("chandu");
    h.add(null);
    System.out.println(h);
}
}