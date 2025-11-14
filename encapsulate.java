class val1
{
    private String username;
    private int Password;

    void setteruser(String username,int Password)
    {
        this.username=username;
        this.Password=Password;
    }

    void getteruser()
    {
        System.out.println("username :" + username);
        System.out.println("passsword :" + Password);
    }
}

public class encapsulate {
    public static void main(String[] args) {
        val1 v= new val1();
        v.setteruser("akanksha@1234", 1234546);
        v.getteruser();
    }
}
