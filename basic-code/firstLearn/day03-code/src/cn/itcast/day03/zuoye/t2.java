package cn.itcast.day03.zuoye;

public class t2 {
    public static void main(String[] args) {
        int month = 54;

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月份是春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(month + "月份是夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(month + "月份是秋季");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println(month + "月份是冬季");
                break;
            default:
                System.out.println("数据月份错误");
                break;
        }
    }
}
