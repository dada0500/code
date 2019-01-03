package test.innerClass;

public class StaticInnerClass {
    static int x = 100;
    static class innerClass{
        static void doitInner(){
            System.out.println ("外部类属性：" + x);
        }
 /*       public static void main(String args[]){
            doitInner();
        }*/
    }
}
