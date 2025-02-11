import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no:-");
        int n=sc.nextInt();
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
