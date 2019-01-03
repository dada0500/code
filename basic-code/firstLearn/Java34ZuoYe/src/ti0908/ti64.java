package ti0908;

public class ti64 {
    public static void main(String[] args) {
        char[] charArr = {'a','b','c','d'};
        String str = getString(charArr);
        System.out.println(str);
    }

    public static String getString(char[] charArr){
        String str = "";
        for (int i = 0; i < charArr.length; i++) {
            str += charArr[i];
        }
        return str;
    }
}
