import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check Palindrome");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome"); 
            }

    }
}

