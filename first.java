/**
 * first
 */
public class first {

    /**
     * Innerfirst
     */
    public class Innerfirst {
    private int age=12;
    public static String myname="aknksha";
    public void showAge()
    {
        System.out.println(age);
    }

    Innerfirst()
    {
        System.out.println("my name is akanksha");
        System.out.println("my family is my heaven");
    }
        
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        first f= new first();
        first.Innerfirst n=f.new Innerfirst();
        n.showAge();
        System.out.println(Innerfirst.myname);
        n.age=23;
        System.out.println(n.age);
    }
}