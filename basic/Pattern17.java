import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:-");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
