import java.util.Scanner;
public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter number");
        int m = sc.nextInt();
        if(n>m){
            System.out.println(n +" is Greater than "+ m);
        }
        else if(n<m){
            System.out.println(m +" is Greater than "+ n);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
