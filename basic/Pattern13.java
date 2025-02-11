import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no:-");
        int row=sc.nextInt();
        int n=row/2;
        for(int i=1;i<=n;i++)
        {
            for(int s=n-1;s>=i;s--){
                System.out.print("#");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<i;s++){
                System.out.print("#");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
