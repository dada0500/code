package juan.java34JiChu.ti0903;

public class t38 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,4,2,1};
        int[] arr = {1,2,3,4,5,2,1};
        System.out.println(isSym(arr));
    }


    public static boolean isSym(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
