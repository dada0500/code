package juan.java34JiChu.ti0831;

/*

20、定义一个方法printHW，
    功能是打印100次“hello world”。
    在main方法中调用printHW方法。（无参数无返回值）
*/

public class t20 {
    public static void main(String[] args) {
        printHW();
    }

    public static void printHW(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello world " + (i + 1));
        }
    }
}
