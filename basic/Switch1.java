// write a program to read gender (M/F) and print the corresponding gender using a switch statement

import java.util.Scanner;

public class Switch1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gender (M/F):");
        char gender=sc.next().charAt(0);
        switch(gender){
            case 'M':
            case 'm':
            System.out.println("Male");
            break;
            case 'F':
            case 'f':
            System.out.println("Female");
            break;
            default:
            System.out.println("Invalid gender");
        }
   } 
}
