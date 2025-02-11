import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-2;j++){
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }
    }
}

/*
Output:
1 1 1 2 1 3 
2 1 2 2 2 3
3 1 3 2 3 3
4 1 4 2 4 3
5 1 5 2 5 3
 */