package coins;

/**
 * 总共有n枚硬币，将他们摆成一个阶梯形状，第K行就必须正好有k个硬币
 * 给定数字n,找出可形成完整阶梯的总行数
 */
public class Pailie {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(7));
    }
    /**
     * 直接遍历，每排玩一行，计算剩余的硬币，如果剩余硬币的个数，小于或者等于行数，就截止了
     * @param n
     * @return
     */
    public static int arrangeCoins(int n){
        for (int i = 1;i<=n;i++){
            n = n-i;
            if (n <= i){
                return i;
            }
        }
        return 0;
    }
}
