package juan.java34JiChu.myClass;

public class PrintArr {
    public void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
