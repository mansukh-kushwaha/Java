// 50--->1000 even number sum
public class For5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=50;i<=1000;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
