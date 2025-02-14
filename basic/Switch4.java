// write a program to create a simple calculator with switch case

import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char op=sc.next().charAt(0);
        switch (op) {
            case '+':
            System.out.println("Addition: "+(num1+num2));
            break;
            case '-':
            System.out.println("Subtraction: "+(num1-num2));
            break;
            case '*':
            System.out.println("Multiplication: "+(num1*num2));
            break;
            case '/':
            System.out.println("Division: "+(num1/num2));
            break;
            default:
            System.out.println("Error! Invalid operator.");
        }
    }
}
