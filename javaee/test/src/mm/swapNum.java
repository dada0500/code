package mm;

import java.util.Scanner;

public class swapNum {
    public static void main (String[] args) {

        int[] i = {1, 8, 26, 45, 60, 78, 99};

//        int x = 50;
        int x = 100;
//        int x = 0;

        System.out.println("原数组：");
        print(i);

        i = insert(i, x);

        System.out.println("修改后：");
        print(i);
    }
    /**插入数据并重新排序的方法*/
    private static int[] insert(int[] a,int in) {
        int[] copy = new int[a.length + 1];//新建一个临时数组,长度比原数要大1
        copy[0] = in;//先将要插入的数据放入第一单元格
        //原来数组中的数复制过来,存在第二格为开始的单元格中
        for (int i = 0; i < a.length; i++)
            copy[i + 1] = a[i];
        //对临时数组重新排序
        for (int i = 0; i < copy.length - 1; i++)
            //如果前一数据大于后一数据,就进行交换.
            if (copy[i] > copy[i + 1]) {
                copy[i] += copy[i + 1];
                copy[i + 1] = copy[i] - copy[i + 1];
                copy[i] -= copy[i + 1];
//                i -= i == 0 ? 1 : 2;//逐级上溯
            }
        //返回临时数组,任务完成
        return copy;
    }


    /**
     * JAVA 程序员的五行代码，为何有人说没毛病？有人骂垃圾代码？
     * @param string
     * @return
     */
    private boolean validateString(String string) {
        boolean res = true;

        if (string == null && "".equals(string)) {
            res = false;
        }
        return res;

        // return string == null && "".equals(string);
    }

    private static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        //换行
        System.out.println();

    }
}
