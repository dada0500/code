package test.outin;

 public class outin {
    protected class out {
        //内部类
        class in{
            private String name;
            public void inMethod (){
                System.out.println ("执行成员内部类的方法");
            }
        }
    }
}
//main
class test{
    public static void main (String[] args) {
        new outin().new out().new in().inMethod ();
    }

}