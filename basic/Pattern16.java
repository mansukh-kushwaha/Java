import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 Output:
11111
22222
33333
44444
55555
 */