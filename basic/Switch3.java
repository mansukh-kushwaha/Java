// e =>even number 
// o=>odd number
import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter e to check even number\nEnter o to check odd number");
        char ch=sc.next().charAt(0);
        System.out.println("Enter number to check:-");
        int n=sc.nextInt();
        switch(ch)
        {
            case 'e':
            if(n%2==0){
                System.out.println(n+" is even number");
            }
            else{
                System.out.println(n+" is not even number");
                }
                break;
            case 'o':
            if(n%2!=0){
                System.out.println(n+" is odd number");
                }
                else{
                    System.out.println(n+" is not odd number");
                    }
                    break;
            default:
            System.out.println("Invalid input");
            

        }

    }
}
