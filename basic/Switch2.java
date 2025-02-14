/*
write a program to check whether the number is even or odd 
type1: 1 even number 
2 :odd number 

type2: e =>even number 
o=>odd number */

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for check even number\nEnter 2 for check odd number");
        int x=sc.nextInt();
        System.out.println("Enter number");
        int n=sc.nextInt();
        switch (x) {
            case 1:
            if (n % 2 == 0) {
            System.out.println("Even number");
            }
            else {
                System.out.println("not even number");
                }
            break;
            case 2:
            if (n % 2 != 0) {
            System.out.println("Odd number");
            }
            else {
                System.out.println("not odd number");
                }
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
