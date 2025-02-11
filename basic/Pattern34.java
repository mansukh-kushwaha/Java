import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=n;
            for(int s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}
/*
Output:-
    5
   54
  543
 5432
54321
 */