package ti0908;
/*

68、定义2个长度为5的字符串数组arrA和arrB，arrA包含元素{"a","b","c","d","e"};arrA中的所有元素按逆序存储在数组arrB中，并按arrB下标增长的顺序在控制台打印输出arrB数组中所有元素
*/


public class T68 {
    public static void main(String[] args) {
        String[] arrA = {"a","b","c","d","e"};
        String[] arrB = new String[arrA.length];
/*
        int index = 0;  // arrB 的索引序号
        for (int i = arrA.length - 1; i >= 0; i--) {
            arrB[index] = arrA[i];
            System.out.print(arrB[index] + "  ");
            index++;
        }
*/

//        System.out.println("======");
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = arrA[arrB.length-1-i];
            System.out.print(arrB[i]+" ");
        }
    }
}
