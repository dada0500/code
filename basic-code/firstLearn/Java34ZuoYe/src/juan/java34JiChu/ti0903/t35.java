package juan.java34JiChu.ti0903;

public class t35 {
    public static void main(String[] args) {
        int[] arr = {1,7,3,2,7,5};
        int x = 7;
        int n = getIndex(arr,x);
        System.out.println("元素" + x + "第一次在数组中出现的索引是" + n);
    }

    public static int getIndex(int[] arr,int num){
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]  == num){
                n = i;
                break;
            }
        }
        return n;
    }
}
