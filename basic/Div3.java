public class Div3 {
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            if(n%7==0 && n%3==0){
                System.out.print(n+ " ");
            }
            n++;
        }
    }
}
