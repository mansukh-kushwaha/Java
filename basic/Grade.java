import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subject:-");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();
        float per = (marks1 + marks2 + marks3 + marks4 + marks5)*100/500;
        System.out.println("Your percentage is"+ per+"%");
        if(per>80 &&per<100){
            System.out.println("Grade A");
        }
        else if(per<=80 && per>60){
            System.out.println("Grade B");
        }
        else if(per<=60&& per>50){
            System.out.println("Grade C");
        }
        else if(per<=50 && per>45){
            System.out.println("Grade D");
            }
        else if(per<=45 && per>25){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
