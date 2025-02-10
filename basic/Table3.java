import java.util.Scanner;
public class Table3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Staring point for table:");
        int s=sc.nextInt();
        System.out.println("Enter Ending point for table:");
        int e=sc.nextInt();
        while(s<=e){
            int i=1;
            int table=0;
            while(i<=10){
                table=s*i;
                System.out.println(s+" * "+i+" = "+table);
                i++;
            }
            System.out.println();
            s++;
        }
    }
}