// write and make a program user input any number and user input like factorial then calculate a factorial of code and user input a string like reverse then calculate a reverse number only.
import java.util.Scanner;
public class For8 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorial or Reverse");
        String s = sc.nextLine();
        int n=0;
        int sum=1;
        int temp=0;
        if(s.equals("factorial")) {
            System.out.println("Enter a number");
            n = sc.nextInt();
            for(int i=1;i<=n;i++) {
                sum = sum * i;
            }
            System.out.println("Factorial of "+n+" is "+sum);
        }
        else if(s.equals("reverse")) {
            System.out.println("Enter a number");
            n = sc.nextInt();
            temp=n;
            int rev = 0;
            while(n>0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println("Reverse of "+temp+" is "+rev);
        }
        else{
            System.out.println("Invalid input");
        }
    } 
}
