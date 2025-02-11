import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:-");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }
}
/*
 Output:
1
2 4
3 6 9 
4 8 12 16
5 10 15 20 25
 */