class A
{
    String s= "abc";
    String s2="cde";

    void show1(String name)
    {
        System.out.println("enter your name :" + name);
    }
}
class B extends A
{
    void show2(String sirname)
    {
        System.out.println("sirname is :" + sirname);
    }
}

public class inheritance {
    public static void main(String[] args) {
    
        B b = new B();
        System.out.println("s :" + b.s);
        System.out.println(" s2 :" + b.s2);
        b.show1("akansja");
        b.show2("patil");

    }
}
