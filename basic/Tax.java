import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double tax =0.0;
        System.out.println("Enter your income:-");
        int income=sc.nextInt();
        if(income<=10000){
             tax=0;
        }
        else if(income>10000 &&income<=30000){
            tax = (income-10000) * 0.10;
        }
        else if(income>30000 && income<=50000){
            tax = (20000 * 0.10) +((income-30000)*0.20);
        }
        else if (income >50000){
            tax = (20000*0.10)+(20000+0.20)+((income-50000)*0.30);
        }
        System.out.println("Your tax is :" + tax);
    }
}
