import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no:-");
        int n=sc.nextInt();
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
    }
}
