package juan.java34JiChu.ti0903;

import juan.java34JiChu.myClass.AllMethod;

public class t37 {
    public static void main(String[] args) {
        int n = getCount();
        int[] arr = getArr(n);
        new AllMethod().printArr(arr);
    }

    public static boolean isSXH(int num){
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int he = ge * ge * ge + shi * shi * shi + bai * bai * bai;

        if(num > 99 && num <1000){
            if( he == num ){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("数据错误！接收100-999的数");
            return false;
        }
    }


    public static int getCount(){
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            if(isSXH(i)){
                count++;
            }
        }
        return count;
    }


    public static int[] getArr(int count){
        int[] arr = new int[count];
        if(count == 0) return arr;
        //把是水仙花的数存入数组
//        int j = count - 1;
        int j = 0;
        for (int i = 100; i <= 999; i++) {
            if(isSXH(i)){
                arr[j] = i;
//                j--;
                j++;
            }
        }
        return arr;
    }
}
