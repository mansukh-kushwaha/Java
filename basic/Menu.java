import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number for display food and their price (1-3):-");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Item\t\tPrice");
            System.out.println("Kaju Katli\t450");
        }
        else if(n==2){
            System.out.println("Item\t\tPrice");
            System.out.println("Rasmalai\t650");
        }
        else if(n==3){
            System.out.println("Item\t\tPrice");
            System.out.println("Shahi Korma\t650");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
