package juan.java34JiChu.ti0903;

import juan.java34JiChu.myClass.AllMethod;

public class t39test {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 14, 4, 5, 6, 7, 8,16,18,3, 9};
        int[] b = {33,33,33,33,33,1, 2, 3, 4, 5, 33, 5,1, 2, 3, 4, 5, 33,33,33,33,33,33, 5,33,33,33,33,33,33};

//        for (int i = 0; i < b.length; i++) {
//            System.out.println("================");
//            System.out.println("FOR I" + i + ": ");
            for (int j = 0; j < b.length; j++) {
                if (b[j] != 33) {
                    int temp = b[j];
                    for (int k = j; k > 0; k--) {
                        b[k] = b[k - 1];
                    }
                    b[0] = temp;
//                    b[b.length - 1] = temp;
                }
                System.out.print("for j" + j + ": ");
                new AllMethod().printArr(b);
            }
//            new AllMethod().printArr(b);
//        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",_");
        }
    }
}