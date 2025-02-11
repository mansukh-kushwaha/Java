import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x=i*j;
                System.out.print(x+" ");
            }
        System.out.println();
        }
    }
}
