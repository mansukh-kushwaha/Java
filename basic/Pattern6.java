import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:-");
        int n=sc.nextInt();
        int row=n/2;
        for(int i=1; i<=row;i++){
            for(int s=row-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=row;i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=row;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
