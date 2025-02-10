import java.util.Scanner;
public class Num3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem+1;
            n=n/10;
        }
        while(sum>0){
            rem=sum%10;
            n=n*10+rem;
            sum/=10;
        }
        System.out.println(n);
    }
}
