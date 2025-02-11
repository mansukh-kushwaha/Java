import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x*x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
/*
Output:-
1
4 9
16 25 36
 */