package nums;

/**
 * 通知2~N内的质数个数
 */
public class Zhishu {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }
    public static boolean isPrime(int x){
        for (int i=2;i*i<=x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sum(int n){
        int ans =0;
        for (int i=2;i<=n;i++){
            ans += isPrime(i)? 1:0;//三目运算符
        }
        return ans;
    }
}
