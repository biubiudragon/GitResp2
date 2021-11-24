package nums;

public class Maopao {
    public static void main(String[] args) {
        int [] arr ={1,3,5,3,8,2,5};
        for (int num: mp(arr)
             ) {
            System.out.print(num);
        }
    }
    public static int [] mp(int [] arr){
        boolean flag = true;
        for (int i =0;i<arr.length-1&&flag;i++){
            flag = false;
            for(int j= 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                    flag = true;
                }
            }
        }
        return arr;
    }
    public static void swap(int i,int j,int [] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
