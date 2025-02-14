// write and make a program user input armstrong = then check number is armstrong and not , when user input pallindrome =check number is pallindrome or not , when user input reverse then check number is reverse or not (through user input ) (use if else if else and while loop and for loop only ) 
import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Armstrong or Pallindrome or Reverse");
        String s = sc.nextLine();
        int n=0;
        int sum=0;
        int temp=0;
        int r=0;
        if(s.equals("Armstrong")) {
            System.out.println("Enter number");
            n = sc.nextInt();
            sum = 0;
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum = sum +(r*r*r);
                n = n / 10;
            }
                if (temp == sum) {
                    System.out.println(temp + " is a Armstrong number");
                } 
                else {
                    System.out.println(temp + " is not a Armstrong number");
                }
        }
        else if(s.equals("Pallindrome")) {
            System.out.println("Enter number");
            n = sc.nextInt();
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum=sum*10+r;
                n = n / 10;
                }
                if (sum == temp) {
                    System.out.println(temp + " is a Pallindrome number");
                }
                else {
                    System.out.println(temp + "  is not a Pallindrome number");
                }
        }
        else if(s.equals("Reverse")) {
            System.out.println("Enter number");
            n = sc.nextInt();
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum=sum*10+r;
                n = n / 10;
            }
            System.out.println("Reverse of "+temp+" is : "+sum);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
