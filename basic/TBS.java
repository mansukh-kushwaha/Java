import java.util.Scanner;
public class TBS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:-");
        int age=sc.nextInt();
        int price=0;
        if(age<12){
            price= 400*50/100;
        }
        else if(age>=65){
            price= 400*30/100;
        }
        else{
            price= 400;
        }
        System.out.println("Your Ticket price is "+ price);
    }
}
