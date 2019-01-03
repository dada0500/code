package testpro;

public class Demo_02 {
    public static void main(String[] args) {
        char[] arrChar = {'a','b','c','d'};

//        System.out.println(arrChar.length);
        for (int i = 0, j = arrChar.length - 1;  i < j; i++,j--) {
            char temp = arrChar[i];
            arrChar[i] = arrChar[j];
            arrChar[j] = temp;
        }

        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(arrChar[i]);
        }
    }
}

