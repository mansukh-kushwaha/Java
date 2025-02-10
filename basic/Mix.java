import java.util.Scanner;
public class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter even or odd");
        String s = sc.next();
        int n=1;
        int sum=0;
        int a=0;
        int b=0;
        int i=0;
        if(s.equals("even")){
            System.out.println("Print Even from 1 to 100:\t1\nPrint sum of even of 1 to 100:\t2\nPrint even from random:\t\t3\nPrint sum of random value\t4\nEnter number:-");
            i = sc.nextInt();
            if(i==1){
                while(n<=100){
                    if(n%2==0){
                        System.out.print(n+ " ");
                    }
                        n++;
                }
            }
            else if(i==2){
                while(n<=100){
                    if(n%2==0){
                        sum+=n;
                    }
                    n++;
                }
                System.out.println("Sum Of First 100 Even Digit is : " + sum);
            }
            else if(i==3){
                System.out.println("Enter Staring point");
                a=sc.nextInt();
                System.out.println("Enter Ending point");
                b=sc.nextInt();
                while(a<=b){
                    if(a%2==0){
                        System.out.println("Even number:-");
                        System.out.print(a+ " ");
                    }
                    a++;
                }
            }
            else if(i==4){
                System.out.println("Enter Staring point");
                a=sc.nextInt();
                System.out.println("Enter Ending point");
                b=sc.nextInt();
                while(a<=b){
                    sum+=a;
                    a++;
                }
                System.out.println("Sum Of Digit is : " + sum);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else if(s.equals("odd")){
            System.out.println("Print Odd from 1 to 100:\t1\nPrint sum of Odd of 1 to 100:\t2\nPrint Odd from random:\t\t3\nPrint sum of random value\t4\nEnter number:-");
            i = sc.nextInt();
            if(i==1){
                while(n<=100){
                    if(n%2!=0){
                        System.out.print(n+ " ");
                    }
                        n++;
                }
            }
            else if(i==2){
                while(n<=100){
                    if(n%2!=0){
                        sum+=n;
                    }
                    n++;
                }
                System.out.println("Sum Of First 100 Odd Digit is : " + sum);
            }
            else if(i==3){
                System.out.println("Enter Staring point");
                a=sc.nextInt();
                System.out.println("Enter Ending point");
                b=sc.nextInt();
                while(a<=b){
                    if(a%2!=0){
                        System.out.println("Odd number:-");
                        System.out.print(a+ " ");
                    }
                    a++;
                }
            }
            else if(i==4){
                System.out.println("Enter Staring point");
                a=sc.nextInt();
                System.out.println("Enter Ending point");
                b=sc.nextInt();
                while(a<=b){
                    sum+=a;
                    a++;
                }
                System.out.println("Sum Of Digit is : " + sum);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}
