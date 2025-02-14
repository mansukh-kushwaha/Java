import java.util.Scanner;

public class DIv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:-");
        int n = sc.nextInt();
        System.out.println("Enter value of m:-");
        int m = sc.nextInt();
        for(int i=1;i<=100;i++){
            if(i%n==0 || i%m==0){
                System.out.print(i+ " ");
            }
        }
    }
}
