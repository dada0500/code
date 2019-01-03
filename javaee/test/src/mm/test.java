package mm;

public class test {
    public static void main (String[] args) {
        int i =1;
        i++;
        i -= i == 0 ? 1 : 2;//逐级上溯
        System.out.println (i);

        for (int j = 0; j <  10; j++) {
            j -= j == 0 ? 1 : 2;//逐级上溯
        }
    }
}
