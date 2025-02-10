public class Div4 {
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            if(n%5==0 && n%11==0){
                System.out.print(n+ " ");
            }
            n++;
        }
    }

}
