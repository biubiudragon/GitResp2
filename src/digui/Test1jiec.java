package digui;

public class Test1jiec {
    public static void main(String[] args) {
        System.out.println(resultJc(3));
    }
    public static int resultJc(int num){
        if (num<1){
            return 1;
        }
        return num*resultJc(num-1);
    }
}
