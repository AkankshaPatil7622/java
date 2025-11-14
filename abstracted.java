public class abstracted
{
    public static void main(String[] args) {
        fordowrk d= new fordowrk();

        d.display();
        System.out.println(d.sum(45, 23));
        System.out.println(d.multi(34,56));;
        
    }
}

abstract class bee 
{
   abstract void display();
   abstract int sum(int a,int b);
}

abstract class dowork extends bee
{
    void display()
    {
        System.out.println("akansha");
    }

    int sum(int a,int b)
    {
        return a+b;
    }

    abstract int multi(int c,int d);
}

class fordowrk extends dowork
{
    int multi(int c,int d)
    {
        return c*d;
    }
}