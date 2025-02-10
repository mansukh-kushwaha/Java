import java.util.Scanner;
public class Div6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        System.out.println("Enter number2:");
        int b=sc.nextInt();
        int n=100;
        while(n>=1){
            if(n%a==0 || n%b==0){
                System.out.print(n+ " ");
            }
            n--;
        }
    }
}

