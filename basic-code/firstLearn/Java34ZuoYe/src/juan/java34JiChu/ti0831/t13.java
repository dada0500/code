package juan.java34JiChu.ti0831;
/*
    13、求1~100以内(包含1和100)能同时被3，5整除的数的和，
        并将求出的和打印到控制台上。
*/
public class t13 {
    public static void main(String[] args) {
        System.out.println(sum35());
    }


    public static int sum35(){
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0  &&  i % 5 == 0){
                sum += i;
            }
        }

        return sum;
    }
}
