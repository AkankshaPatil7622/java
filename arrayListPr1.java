import java.util.ArrayList;
import java.util.Scanner;


public class arrayListPr1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1=new ArrayList<>();
        Scanner s= new Scanner(System.in);
        s.close();
        int num=0;
        System.out.println("add elements :");
        for(int i=0;i<=10;i++)
        {
            num= s.nextInt();
            list1.add(num);
        }
        
        for(Integer v: list1)
        {
            System.out.println(v);
        }
       
    }
}
