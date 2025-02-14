/*
A
b C
D e F
g H i J
K l M n O
 */

import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter row");
        int n=sc.nextInt();
        char o='a';
        char e='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0){
                    System.out.print(e+" ");
                }
                else{
                    System.out.print(o+" ");
                }
                e++;
                o++;
            }
            System.out.println();
        }
    }
}
