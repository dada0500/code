package juan.java34JiChu.ti0903;

public class t34 {
    public static void main(String[] args) {
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg = getAvg(arr);
        int countAboveAvg = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg){
                countAboveAvg++;
            }
        }
        System.out.println("高于平均分：" + avg + " 的个数有 " + countAboveAvg + " 个");
    }


    //定义getAvg方法获取平均分
    public static int getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }
}
