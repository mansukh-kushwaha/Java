import java.util.*;
public class Char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter char");
        char a= sc.next().charAt(0);
        if(a=='a'){
            System.out.println("Apple");
        }
        else if(a=='b'){
            System.out.println("Ball");
        }
        else if(a=='c'){
            System.out.println("Cat");
        }
        else{
            System.out.println("Invalid");
        }
    }
}