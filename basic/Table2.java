import java.util.Scanner;
public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print table:");
        int n=sc.nextInt();
        int i=1;
        int table=0;
        while(i<=10){
            table=n*i;
            System.out.println(n+" * "+i+" = "+table);
            i++;
        }
    }
}
