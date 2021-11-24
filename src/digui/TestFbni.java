package digui;

public class TestFbni {
    public static void main(String[] args) {
        System.out.println(result(3));
    }

    /**
     * 判断斐波那契数列第n个的数字
     * @param n
     * @return
     */
    public static int result(int n){
        if (n==1||n==2){
            return 1;
        }
        return result(n-1)+result(n-2);
    }
}
