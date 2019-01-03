package test;

public class Zi extends Fu {
    int num = 20;
    int mm = 88;
    public Zi(){
        this(66);

    }

    public Zi(int n){
        super();
    }
//    public Zi(int n,int m){
//    }

    public void showNum(){
        int num = 10;
        System.out.println(num);            //10 局部变量
        System.out.println(this.num);      //20 本类的成员变量
        System.out.println(super.num);     //30 父类的成员变量
    }
}