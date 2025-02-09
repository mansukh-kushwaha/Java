import java.util.Scanner;
public class Max5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A:-");
        int a=sc.nextInt();
        System.out.println("Enter value of B:-");
        int b=sc.nextInt();
        System.out.println("Enter value of C:-");
        int c=sc.nextInt();
        System.out.println("Enter value of D:-");
        int d=sc.nextInt();
        System.out.println("Enter value of E:-");
        int e=sc.nextInt();
        if(a>b&& a>c && a>d && a>e){
            System.out.println("A is greater");
        }
        else if(b>c && b>d && b>e){
            System.out.println("B is greater");
        }
        else if(c>d && c>e){
            System.out.println("C is greater");
        }
        else{
            System.out.println("E is greater");
        }
    }
}