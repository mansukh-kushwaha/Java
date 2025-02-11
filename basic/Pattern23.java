import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            int x=i;
            for(int j=1;j<=row;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
/*
Output:-
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9 
 */