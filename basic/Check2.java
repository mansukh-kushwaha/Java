import java.util.Scanner;
public class Check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        char a=sc.next().charAt(0);
        if(a>='a' && a<='z' || a>='A' && a<='Z'){
            System.out.println("This is a character ");
        }   
        else{
            System.out.println("This is a number");
        }
    }
}
