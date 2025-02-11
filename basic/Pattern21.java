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
/*
Output:-
1 2 3 4 5 
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
 */