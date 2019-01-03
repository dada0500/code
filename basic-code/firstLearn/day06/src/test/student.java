package test;


/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class student {

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是不是爷们儿

    public void asetMale(boolean b) {
        male = b;
    }

    public boolean aisMale() {
        return male;
    }

    public void asetName(String str) {
        name = str;
    }

    public String agetName() {
        return name;
    }

    public void asetAge(int num) {
        age = num;
    }

    public int agetAge() {
        return age;
    }
}
