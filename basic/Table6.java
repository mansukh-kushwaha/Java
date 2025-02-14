// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
import java.util.*;
public class Table6 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int table=0;
            for(int i=1;i<=10;i++){
                table=n*i;
                System.out.println(n+"*"+i+"="+table);
            }
    }
}
