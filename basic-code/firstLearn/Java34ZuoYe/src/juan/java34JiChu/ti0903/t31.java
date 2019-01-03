package juan.java34JiChu.ti0903;

public class t31 {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] / 10 % 10 != 7  && arr[i] % 10 != 7 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("数组中元素的个位和十位不能包含7,并且只能为偶数的元素和是：" + sum);
    }
}
