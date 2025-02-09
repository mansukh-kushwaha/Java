import java.util.Scanner;
public class Bill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item=0;
        int discount=0;
        System.out.println("Enter retailer or customer:-");
        String choice = sc.nextLine();
        if(choice.equals("retailer")){
            System.out.println("Enter Retailer name: ");
            String name=sc.next();
            System.out.println("Enter item peices: ");
            item = sc.nextInt();
            if(item>=1 && item<=15){
                discount=15;
            }
            else if(item>15 && item<=30){
                discount=30;
            }
            else if(item>30 && item<=50){
                discount=50;
            }
            System.out.println("OUTPUT:-\n\n");
            System.out.println("Retailer name:\t\t"+name);
            System.out.println("Peicies:\t\t"+item);
            System.out.println("Discount:\t\t"+discount+"%");
        }
        else if(choice.equals("customer")){
            System.out.println("Enter Customer name: ");
            String cust=sc.next();
            System.out.println("Enter Contact:-");
            long contact=sc.nextLong();
            System.out.println("Enter item peices: ");
            item = sc.nextInt();
            int payment=item*20;
            float total_payment=0.0f;
            if(item>=1000 && item<=2000){
                total_payment=payment-(payment*0.1f);
                discount=10;
            }
            else if(item>2000 && item<3000){
                total_payment=payment-(payment*0.2f);
                discount=20;
            }
            else if(item>=100 && item<1000){
                total_payment=payment-(payment*0.05f);
                discount=5;
            }
            else if(item>=3000){
                total_payment=payment-(payment*0.5f);
                discount=50;
            }
            System.out.println("OUTPUT:-\n\n");
            System.out.println("Name:\t\t\t"+cust);
            System.out.println("contact number:\t\t"+contact);
            System.out.println("Amount(20Rs/each):\t"+payment);
            System.out.println("Discount:\t\t"+discount+"%");
            System.out.println("Total Pay Amount:\t"+total_payment);

        }
        else{
            System.out.println("Invalid");
        }
    }
}
