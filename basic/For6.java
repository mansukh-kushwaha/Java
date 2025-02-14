// 1000--->500 odd numbers sum
public class For6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1000;i>=500;i--){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
