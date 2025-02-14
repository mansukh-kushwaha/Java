/*Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
7. Provide a valid car number, Fails to provide a valid input then display that number is not a
valid car number.
Note : The input other than 4 digit positive number[includes negative and 0] is considered as
invalid.*/

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        int c=1;
        for(int i=1;i<n;i++){
            sum+=n%10;
            c++;
            n=n/10;
            System.out.println(c);
        }
        if(c==4){
            if(sum%3==0 || sum%5==0 || sum%7==0)
            {
                System.out.println(num+" is my lucky number");
            }
            else
            {
                System.out.println(num+" is not my lucky number");
            }
        }
        else{
            System.out.println(num+"is not my valid car number");
        }
    }
}
