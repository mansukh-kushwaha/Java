import java.util.Scanner;
public class TBS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of tickets you want to buy:");
        int n = sc.nextInt();
        float total=0.00f;
        float rt=0.00f;
        float ct=0.00f;
        float t=0.00f;
        if(n>=5 && n<=40){
            System.out.println("Do you want refreshment(Rs 50 per member):-");
            char r = sc.next().charAt(0);
            System.out.println("Do you have Any Coupon code:-");
            char c = sc.next().charAt(0);
            System.out.println("Enter the Circle name:-");
            char circle = sc.next().charAt(0);
            if(circle=='k'){
                total=n*75;
                if(r=='y'){
                    rt=n*50;
                    System.out.println("Refreshment cost\t Rs."+rt);
                }
                if(c=='y'){
                    ct=total*0.02f;
                    System.out.println("Coupon code discount\t Rs."+ct);
                }
                if(n>20){
                    t=total*0.10f;
                    System.out.println("Bulk ticket discount\t Rs."+t);
                }
                total=total+rt-ct-t; 
                
                System.out.println("Your total amount\t Rs."+total);
            }
            else if(circle=='q'){
                total=n*150;
                if(r=='y'){
                    rt=n*50;
                    System.out.println("Refreshment cost\t Rs."+rt);
                }
                if(c=='y'){
                    ct=total*0.02f;
                    System.out.println("Coupon code discount\t Rs."+ct);
                }
                if(n>20){
                    t=total*0.10f;
                    System.out.println("Bulk ticket discount\t Rs."+t);
                }
                total=total+rt-ct-t; 
                
                System.out.println("Your total amount\t Rs."+total);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 tickets can be booked");
        }
    }
}
