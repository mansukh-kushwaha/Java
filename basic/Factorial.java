import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for factorial:-");
        int num=sc.nextInt();
        int fact=1;
        while (num>0) {
            fact=fact*num;
            num--;            
        }
        System.out.println(fact);
    }
}