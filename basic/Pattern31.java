import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x++;
            }
            x-=1;
            System.out.println();
        }
    }
}
/*
Output:-
1
23
345
4567
56789
 */