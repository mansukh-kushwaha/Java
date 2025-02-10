import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staring point");
        int a=sc.nextInt();
        System.out.println("Enter Ending point");
        int b=sc.nextInt();
        while(a<=b){
            System.out.print(a+ " ");
            a++;
        }
    }
}
