import java.util.*;
public class Swap2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number a: ");
        int a= sc.nextInt();
        System.out.println("Enter Number b: ");
        int b= sc.nextInt();
        System.out.println("Value of A and B before swaping is: "+ a+" " + b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Value of A and B after swaping is: "+ a+" " + b);
    }
    
}
