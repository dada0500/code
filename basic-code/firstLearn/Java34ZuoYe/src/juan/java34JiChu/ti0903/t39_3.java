package juan.java34JiChu.ti0903;

import juan.java34JiChu.myClass.AllMethod;

public class t39_3 {
    public static void main(String[] args) {
        int[] arr = {7,12,22,32,1, 2, 3, 4, 5,18,28,38};
        int[] newArr = createArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] createArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 != 0){
                    int temp = arr[i];
                    for (int j = i; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = temp;
            }
        }
        return arr;
    }

//一，先算出偶数个数，先赋值偶数
/*
    public static int[] createArr(int[] arr){
        int[] newArr = new int[arr.length];

        int evenCount = 0;  //算出偶数个数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }

        //  偶数起始索引  arr.length - evenCount
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                newArr[arr.length - evenCount + j] = arr[i];
                j++;
            }
         }

        //  奇数赋值
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                newArr[j] = arr[i];
                j++;
            }
         }

        return newArr;
    }
*/

// 二，先赋值奇数，再赋值偶数，不用单独计算个数
/*
    public static int[] createArr(int[] arr){
        int[] newArr = new int[arr.length];

//       奇数赋值
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                newArr[j] = arr[i];
                j++;
            }
        }

//        偶数起始索引  j
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }
*/


// 三：奇偶一起赋值
   /* public static int[] createArr(int[] arr){
        int[] newArr = new int[arr.length];
        int j = 0,k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                newArr[j] = arr[i];
                j++;
            }else {
                newArr[arr.length - 1 - k] = arr[i];
                k++;
            }
        }
        return newArr;
    }*/


}
