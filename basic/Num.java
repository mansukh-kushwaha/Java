import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        if(a>0){
            System.out.println("Positive integer");
        }
        else if(a<0){
            System.out.println("Negative integer");
        }
        else{
            System.out.println("Zero");
        }
    }
}
