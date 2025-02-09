import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number:-");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        float avg = (n1 + n2 + n3 + n4 + n5)/5;
        if(avg>80 &&avg<100){
            System.out.println("Grade A");
        }
        else if(avg<=80 && avg>60){
            System.out.println("Grade B");
        }
        else if(avg<=60 && avg>50){
            System.out.println("Grade C");
        }
        else if(avg<=50 && avg>45){
            System.out.println("Grade D");
            }
        else{
            System.out.println("Fail");
        }
    }
}
