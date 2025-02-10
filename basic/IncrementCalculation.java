import java.util.Scanner;
public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary:-");
        Float salary=sc.nextFloat();
        System.out.println("Enter Performance Appraisal Rating:-");
        Float rating=sc.nextFloat();
        Float total=0.0f;
        if(salary>0.0f && rating>=1.0f&& rating<=5.0f){
            if(rating>=1.0f && rating<=3.0f){
                total=salary+(salary*0.10f);
            }
            else if(rating>=3.1f && rating<=4.0f){
                total=salary+(salary*0.25f);
            }
            else if(rating>=4.1f && rating<=5.0f){
                total=salary+(salary*0.50f);
            }
            
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("Your Incresed Salary: "+ total);
    }
}
