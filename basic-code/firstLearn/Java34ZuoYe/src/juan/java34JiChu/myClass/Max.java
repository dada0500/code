package juan.java34JiChu.myClass;

public class Max {
    private int[] arr;

    public Max() {

    }

    public Max(int[] arr) {

        this.arr = arr;
        this.getMax();
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        this.getMax();
    }

    public void getMax(){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println("数组中的最大值是：" + max);
    }

}
