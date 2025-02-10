import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int c=0;
        while (n>0) {
            c++;
            n/=10;
        }
        System.out.println("Digit in number is: "+ c);
    }
}
