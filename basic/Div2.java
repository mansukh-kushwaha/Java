import java.util.*;
public class Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int a= sc.nextInt();
            if(a%7==0 || a%3==0){
                System.out.println("Divisible by anyone 3 or 7");
            }
            else{
                System.out.println("Not Divisible by any of them 3 or 7");
            }
        }
}
