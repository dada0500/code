package demo7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class t03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
