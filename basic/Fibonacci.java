import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Fibonacci Series:-");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
       // System.out.println(a);
       // System.out.println(b);
        while(n>0){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}
