import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:-");
        int row = sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
Output:-
55555
44444
33333
22222
11111
 */