import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A:-");
        int a=sc.nextInt();
        System.out.println("Enter value of B:-");
        int b=sc.nextInt();
        System.out.println("Enter value of C:-");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else if(b>c){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}