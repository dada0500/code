package juan.java34JiChu.ti0903;

public class t39 {
    public static void main(String[] args) {
      int[] arr = {12,22,32,1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr = {1, 2, 4, 4, 5};

        int[] newArr = createArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

//一，先算出偶数个数，先赋值偶数
/*    public static int[] createArr(int[] arr){
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
    }*/

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
    public static int[] createArr(int[] arr){
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
    }

}
