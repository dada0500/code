package cn.itcast.nonameClass;

public class Demo2_NoNameClass {
    public static void main (String[] args) {
        useA(new InterA (){
            @Override
            public void method () {

            }
        });
    }

    public static void useA(InterA a){

    }

}



interface InterA{
    void method();
}