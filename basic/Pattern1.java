import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:-");
        int row = sc.nextInt();
        for(int i=1; i<=row;i++){
            for(int s=row-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Output:-
    *
   **
  ***
 ****
*****
 */