package nums;
import java.util.Arrays;
/**
 * 寻找数组的中心索引
 * 数组中某一个下标，左右两边的元素之和相等，该下标即为中心索引
 * 分析：先统计这个数组的和，然后从第一个数开始叠加，总和递减当前的元素，叠加递增当前的元素。
 *       知道两个值相等
 */
public class ShuzuIndex {
    public static void main(String[] args) {
        int [] arr = {1,3,5,3,1};
        int sumright= Arrays.stream(arr).sum();
        int sumleft =0;
        for (int i=0;i<arr.length;i++){
            sumleft += arr[i];
            if (sumleft==sumright){
                System.out.println(i);
            }
            sumright = sumright-arr[i];
        }
        System.out.println(-1);
    }
}
