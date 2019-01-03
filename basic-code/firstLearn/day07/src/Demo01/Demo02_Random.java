package Demo01;

import java.util.Random;

public class Demo02_Random {
    public static void main(String[] args) {
        afe();
    }

    private static void afe() {
        ab();
    }

    public static void ab() {
        Random r = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            num = r.nextInt(100) + 1;
            System.out.println(num);
        }
    }
}
