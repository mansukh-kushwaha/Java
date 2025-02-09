import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight(in kg):- ");
        float w= sc.nextFloat();
        System.out.println("Enter your height(in m):-");
        float h=sc.nextFloat();
        float b =w/(h*h);
        if(b<=18.5){
            System.out.println("Underweight");
        }
        else if (b>18.5 && b<=24.9){
            System.out.println("Normal Weight");
        }
        else if (b>=25 && b<29.9){
            System.out.println("Overweight");
        }
        else if(b>=30){
            System.out.println("Obesity");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
