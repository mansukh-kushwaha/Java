import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time of day:-");
        String g= sc.next();
        if(g.equals("morning")){
            System.out.println("Good Morning...!");
        }
        else if(g.equals("afternoon")){
            System.out.println("Good Afternoon...!");
        }
        else if(g.equals("evening")){
            System.out.println("Good Evening...!");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
