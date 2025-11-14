class Main
{
    private int password;
    protected String username;

    void setUser(String u)
    {
        username=u;
    }

    String getUser()
    {
        return username;
    }

   void setPassword(int password)
   {
          this.password=password;
   }

   int getPassword()
   {
        return password;
   }

}

public class oops {

    public static void main(String[] args) {
       
        Main m=new Main();
        m.setPassword(7622);
        m.setUser("akanksha@123");
        int v=m.getPassword();
        String us=m.getUser();
        System.out.println("username :"+ us);
        System.out.println("password :"+ v);

    }
    
}
