public class Div5 {
    public static void main(String[] args) {
        int n=100;
        while(n>=1){
            if(n%5==0 || n%11==0){
                System.out.print(n+ " ");
            }
            n--;
        }
    }

}
