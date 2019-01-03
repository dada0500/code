package ti0908;

public class ti61 {
    public static void main(String[] args) {
        String[] arr = {"it","hei","ma"};

        //while循环遍历字符串数组
        int index = 0;
        while(index <  arr.length){
            System.out.print(arr[index] + "  ");
            index++;
        }

        System.out.println();
        //for循环遍历字符串数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
