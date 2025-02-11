import java.util.Scanner;

public class Pattern33 {
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=1;
            for(int s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
                x++;
            }
            
            System.out.println();
        }
    }
}
/*
Output:-
    1
   12
  123
 1234
12345
 */