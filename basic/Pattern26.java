import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i%2 +" ");
            }
            System.out.println();
        }
    }
}
/*
 Output:
11111
00000
11111
00000
 */