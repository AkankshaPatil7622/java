// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// // import java.util.Scanner;

// public class practice {
//     public static void main(String args[])
//     {
//         // Scanner s= new Scanner(System.in);
//         // System.out.println("enter :");
//         // int x=s.nextInt();
//         // int y=s.nextInt();
//         // System.out.println(x);
//         // System.out.println(y);
//         // s.close();
//         System.out.println("enter :");
//         InputStreamReader in = new InputStreamReader(System.in);
//         BufferedReader br =new BufferedReader(in);
//         String input=br.readLine();
//         int num=Integer.parseInt(input);
    
// }
// }


void printSquare(int n) {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println("*");
        }
        System.out.println();
    }
  
}