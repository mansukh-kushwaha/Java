import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:-");
        int n=sc.nextInt();
        int x=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
            }
            x--;
            System.out.println();
        }
    }
}
/*
Output:-
6
55
444
3333
22222
111111
 */