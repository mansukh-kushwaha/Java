// write a program to check whether a person is eligible or not for vote
// v :check voter id valid or not  

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter char to check age for vote:-");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'v':
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible for vote");
                }
                else {
                    System.out.println("You are not eligible for vote");
                    }
                    break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
