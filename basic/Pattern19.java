import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(x+" ");
                x+=2;
            }
        System.out.println();
        }
    }
}

/*
Output:-
1 3 5 7 9 
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
 */