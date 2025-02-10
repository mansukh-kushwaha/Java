public class Prime {
    public static void main(String[] args) {
        int n=1;
        
        while(n<=100){
            int c=0;
            int m=1;
            while(m<=n){
                if(n%m==0){
                    c++;
                }
                m++;
            }
            if(c==2){
                System.out.print(n+" ");
            }
            n++;
        }

    }
}
