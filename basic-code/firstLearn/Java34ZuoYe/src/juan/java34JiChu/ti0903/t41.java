package juan.java34JiChu.ti0903;

public class t41 {
    public static void main(String[] args) {
        //(3)	 在main方法中定义数组，如int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};。然后调用getAllCount方法，统计只出现一次的元素有多少个。
//        int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int arr[]={1,3,4,5};
        System.out.println("只出现一次的元素个数 ：" + getAllCount(arr));

    }

    //(1)	 定义方法public static int getCount(int[] arr,int num)，求出指定元素在数组中出现的次数.
    public static int getCount(int[] arr,int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    //(2)	定义方法public static int getAllCount(int[] arr)，统计数组中出现次数为1的元素一共有多少个。(推荐-遍历数组，然后调用第一个方法，求出数组中每个元素在数组中出现的次数，如果只出现了一次，就统计)
    public static int getAllCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(getCount(arr,arr[i]) == 1){
                count++;
            }
        }
        return count;
    }
}
