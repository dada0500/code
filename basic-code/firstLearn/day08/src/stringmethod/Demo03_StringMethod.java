package stringmethod;

public class Demo03_StringMethod {
    public static void main(String[] args) {
        String tel = "15533336666";

        String start = tel.substring(0,3);
        String end = tel.substring(7);

        System.out.println(start + "****" + end);
        System.out.println(tel.charAt(3));
    }
}
