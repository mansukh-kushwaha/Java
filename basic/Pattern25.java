import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
               System.out.print(j%2 +" ");
            }
            System.out.println();
        }
    }
}
/*
Output:
10101
10101
10101
10101
10101
 */