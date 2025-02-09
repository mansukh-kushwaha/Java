import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        int cm=sc.nextInt();
        if(cm>183){
            System.out.println("You are tall");
        }
        else if(cm<183 && cm>168){
            System.out.println("You are average");
        }
        else if(cm<168){
            System.out.println("You are short");
        }
    }
}
