import java.util.Stack;
//import java.util.Stack;
public class Stack1
{
public static void main(String[]args) 
{
Stack s= new Stack();
s.push("m");
s.push("l");
s.push("Java");
System.out.println(s);
System.out.println(s.search("m"));
System.out.println(s.search("java"));
System.out.println(s.search("l"));
}
}
