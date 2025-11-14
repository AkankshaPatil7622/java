import java.util.Scanner;

public class looping {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int i;
        System.out.println("search element :");
        int srch=s.nextInt();
        s.close();
        for(i=0;i<6;i++)
        {
            if(srch==arr[i])
            {
                System.out.println("exist");
                break;
            }
            
            else 
            {
                System.out.println("NOT EXIST");
             
            }
            i++;
        }
    }
}
