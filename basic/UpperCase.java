import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Char: ");
        char a= sc.next().charAt(0);
        if(a>=65 && a<=90){
            System.out.println("Upper Case");
        }
        else if(a>=97 && a<=122){
            System.out.println("Lower case");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}