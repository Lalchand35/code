public class stringrev 
{
public static void main(String[]args)
{
    String str="ABCD";
    String rev=" ";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);
    }
    System.out.println("reverse String is:"+rev);
}
}