import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to Reverse it:");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of "+ temp +" is: "+sum);

    }
}
