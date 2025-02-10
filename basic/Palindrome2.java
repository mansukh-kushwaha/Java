import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Goutam entered number is:- ");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Tanul say 'It is Palindrome Number'. ");
        }
        else{
            System.out.println("Tanul say 'It is not Palindrome Number'. "); 
            }

    }
}

