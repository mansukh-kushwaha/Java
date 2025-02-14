import java.util.Scanner;

public class Table8 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting number for table print:-");
        int n=sc.nextInt();
        System.out.println("Enter Ending number for table print:-");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
