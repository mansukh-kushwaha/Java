import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter address:");
        String address=sc.next();
        System.out.println("Enter your bank:");
        String bank=sc.next();
        System.out.println("Enter your salary: ");
        float sal=sc.nextFloat();
        System.out.println("Enter holidays:-");
        int hol=sc.nextInt();
        float alot=0.0f;
        if(hol<=1){
            alot=sal;
        }
        else if(hol>1 && hol<=5){
            alot=sal-(sal*0.05f);
        }
        else if(hol>5 && hol<=14){
            alot=sal-(sal*0.1f);
        }
        else if(hol==15){
            alot=sal-(sal*0.5f);
        }
        else{
            alot=0.0f;
        }
        System.out.println("Name:\t\t"+name);
        System.out.println("Address:\t"+address);
        System.out.println("Bank Details:\t"+bank);
        System.out.println("Salary:\t\t"+sal);
        System.out.println("Alotted Salary:\t"+alot);
        System.out.println("Your Holidays:\t"+hol);
    }
}
