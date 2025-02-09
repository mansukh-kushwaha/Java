import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter Electricity unit: ");
        int unit = sc.nextInt();
        float amount=unit*10;
        float bill = 0.0f;
        int discount=0;
        if(unit >=1 && unit <=10){
            bill=amount-(amount*0.1f);
            discount = 10;
        }
        else if(unit >10 && unit <=20){
            bill=amount-(amount*0.15f);
            discount = 15;
        }
        else if(unit>20 && unit<=40){
            bill=amount-(amount*0.30f);
            discount = 30;
        }
        else if(unit >=41 && unit <=50){
            bill=amount-(amount*0.50f);
            discount = 50;
        }
        System.out.println("OUTPUT:-\n\n");
        System.out.println("Name:\t\t\t"+name);
        System.out.println("Unit:\t\t\t"+unit);
        System.out.println("Amount:\t\t\t"+amount);
        System.out.println("Discount:\t\t"+discount+"%");
        System.out.println("Total Pay Amount:\t"+bill);
    }
    
}
