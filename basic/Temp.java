import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit (C or F):-");
        char u=sc.next().charAt(0);
        System.out.println("Enter Temperature:-");
        float t=sc.nextFloat();
        float out=0.0f;
        if(u=='C'){
            out = (t*9/5)+32;
        }
        else if(u=='F'){
            out =(t-32)*9/5;
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println(out);
    }
}
