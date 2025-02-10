import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:-");
        int n = sc.nextInt();
        int temp=n*n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("Number is Neon");
        }
        else{
            System.out.println("Number is not Neon"); 
            }
    }
}
