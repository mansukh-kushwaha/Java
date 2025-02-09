import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter Char: ");
        char a=sc.next().charAt(0);
        if(a=='a'){
            System.out.println("Enter number:-");
            n=sc.nextInt();
            if(n%5==0 && n%11==0){
                System.out.println("Divisible by both 5 & 11.");
            }
            else{
                System.out.println("Not Divisible by both 5 & 11");
            }
        }
        else if(a=='b'){
            System.out.println("Enter number:-");
            n=sc.nextInt();
            if(n%5==0 || n%11==0){
                System.out.println("Divisible by one 5 & 11.");
            }
            else{
                System.out.println("Not Divisible by anyone 5 & 11");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
