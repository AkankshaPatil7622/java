// import java.util.regex.Pattern;

public class pattern {

   class solution{
    void printSquare(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      
    }

    
   }
    public static void main(String[] args) {
        pattern p =new pattern();
        pattern.solution  s =p.new solution();
        s.printSquare(3);

    }
}
