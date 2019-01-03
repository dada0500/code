package zuoye;

 /*1.定义一个用于存放班级分数的数组
         int[] score = {80,90,85,90,78,88,89,93,98,75};
         2.求出班级不及格人数(分数低于60分的就是不及格)
         3.求出班级的平均分
         4.求出班级的总分数
*/
public class t4 {
    public static void main(String[] args) {
        int[] score = {80,47};
//        int[] score = {80,90,85,90,78,88,89,93,98,75,60,59,48};

        //不及格人数
        int count = 0;
        for (int i = 0; i < score.length;i++) {
            if(score[i] < 60){
                count++;
            }
        }
        System.out.println("不及格人数：" + count);

        //班级的总分数
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        //班级的平均分
        double avg = (double) sum / (double) score.length;

        System.out.println("班级的平均分" + avg);
        System.out.println("班级的总分数" + sum);
    }
}
