public class SumOdd {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        while(n<=100){
            if(n%2!=0){
                sum+=n;
            }
            n++;
        }
        System.out.println("Sum Of First 100 Odd Digit is : " + sum);
    }
}
