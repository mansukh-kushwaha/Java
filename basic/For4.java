// 100---->1odd number print sum
public class For4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=100;i>=1;i--){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
