// write a java prgram user input neon number :then calucate neon number or user input perfect number then calculate perfect number or user input prime number then agin user input is one or more when a user input one then check a input is prime or not otherwise userinput more then print 1 to 100 prime numbers or when user input a one digit the user input again : count ya sumofdigit when a user input count then count the digit and user input sumofdigit then addition of all the digits when user input fibonacci the user again input to lastnumber ya series of nth term when user input last number then print last number of a sum of fibonacci and user input a series then print a series of fibonacci

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter neon or perfect or prime or one_digit or fibonacci");
        String input=sc.next();
        int n=0;
        int temp=0;
        int sum=0;
        int rem=0;
        int c=0;
        if(input.equals("neon")){
            System.out.println("Enter a number");
            n=sc.nextInt();
            temp=n*n;
            sum=0;
            for(int i=temp;i!=0;i/=10){
                rem=i%10;
                sum=sum+rem;
            }
            if(n==sum){
                System.out.println("Number is Neon");
            }
            else{
                System.out.println("Number is not Neon"); 
                }
        }
        else if(input.equals("perfect")){
            System.out.println("Enter a number");
            n=sc.nextInt();
            temp=n/2;
            sum=0;
            for(int i=1;i<temp;i++){
                if(temp%i==0){
                    sum=sum+i;
                    }
            }
            if(sum==n){
                System.out.println(n+" is a perfect number");
            }
            else{
                System.out.println(n+" is not a perfect number");
            }
        }
        else if(input.equals("prime")){
            System.out.println("Check one or more:-");
            String si= sc.next();
            if(si.equals("one")){
                System.out.println("Enter a number");
                n=sc.nextInt();
                for(int i=1;i<=n;i++){
                    if(n%i==0){
                        c++;
                    }
                }
                if(c==2){
                    System.out.print(n+" ");
                }
            }
            else if(si.equals("more")){
                for(int i=1;i<=100;i++){
                    for(int j=1;j<=i;j++){
                        if(i%j==0){
                            c++;
                        }
                    }
                    if(c==2){
                        System.out.print(i+" ");
                    }
                    c=0;
                }
            } 
            else{
                System.out.println("Invalid input");
            }                      
        }
        else if(input.equals("one_digit")){
            System.out.println("Enter count or sumofdigit:-");
            String si= sc.next();
            if(si.equals("count")){
                System.out.println("Enter a number");
                n=sc.nextInt();
                c=0;
                for(int i=n;i!=0;i/=10){
                    c++;
                }
                System.out.println("Count of one digit number is "+c);
            }
            else if(si.equals("sumofdigit")){
                System.out.println("Enter a number");
                n=sc.nextInt();
                sum=0;
                for(int i=n;i!=0;i/=10){
                    sum=sum+(i%10);
                }
                System.out.println("Sum of digit of number is "+sum);
            }
            else{
                System.out.println("Invalid input");
            }

        }
        else if(input.equals("fibonacci")){
            System.out.println("Enter last number or series:-");
            String si= sc.next();
            if(si.equals("lastnumber")){
                System.out.println("Enter a number");
                n=sc.nextInt();
                int a=0,b=1,ca=0;
                for(int i=1;i<=n;i++){
                    sum+=a;
                    ca=a+b;
                    a=b;
                    b=ca;
                }
                System.out.println("Sum of fibonacci series is "+sum);
            }
            else if(si.equals("series")){
                System.out.println("Enter a number");
                n=sc.nextInt();
                int a=0,b=1,ca=0;
                for(int i=1;i<=n;i++){
                    System.out.println(a);
                    ca=a+b;
                    a=b;
                    b=ca;
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
