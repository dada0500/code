package juan.java34JiChu.ti0903;
import  juan.java34JiChu.myClass.Min;
import  juan.java34JiChu.myClass.Max;


public class t30 {
    public static void main(String[] args) {
        int[] arr = {4,8,2,9};
        Max getMax = new Max(arr);

        Min getMin = new Min();
        getMin.getMin(arr);
    }
}
