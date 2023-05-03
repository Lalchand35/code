interface inter 
{
public void display();
}
class most implements inter 
{
    public void display()
    {
        System.out.println("hello");
    }
}
class host implements inter{
    public void display()
    {
        System.out.println("i m this");
    }
public static void main(String[]args)
{
most m= new most();
m.display();
host h=new host();
h.display();
}
}
