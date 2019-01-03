package stringmethod;

public class Test2_String {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = getString(arr);
        System.out.println(s);
    }

    public static String getString(int[] arr){
        String s = "[";

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(i == arr.length - 1){
                s += ("word" + num + "]");
            }else{
                s += ("word" + num + "#");
            }
        }
        return s;
    }
}
