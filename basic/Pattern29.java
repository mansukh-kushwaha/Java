import java.util.Scanner;

public class Pattern29 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=n;
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
                x--;
            }
            
            System.out.println();
        }
    }
}

/*
 Output:
5
54
543
5432
54321
 */