import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x=2;
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x=x+2;
            }
            System.out.println();
        }
    }
}
/*
 Output:
2
24
246
2468
246810
 */