// write and make a program user give two string like even and odd even denoted even number and odd denoted odd number when user input odd then input a range and calculate even and odd number in java ?(use if else if and for loop)

import java.util.Scanner;
public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter even or odd");
        String s=sc.next();
        int n=0;
        if(s.equals("even")){
            System.out.println("Enter a number to fix last range to find even number from 1:-");
            n=sc.nextInt();
            System.out.println("Even number from 1 to "+n);
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.print(i+"  ");
                }
            }
        }
        else if(s.equals("odd")){
            System.out.println("Enter a number to fix last range to find odd number from 1:-");
            n=sc.nextInt();
            System.out.println("Odd number from 1 to "+n);
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
