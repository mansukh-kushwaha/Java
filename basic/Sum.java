// Write a program to calculate the sum of first 10 natural number.
import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
}
