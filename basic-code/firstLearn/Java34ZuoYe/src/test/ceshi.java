package test;

public class ceshi  {
    public static void main (String[] args) {
        Per p1 = new Per("张三",22);
        Per p2 = new Per("张三",22);
        System.out.println (p1 == p2);
        System.out.println (p1.equals (p2));
    }
}
