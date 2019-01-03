package com.heima.zuoye;


public class T10 {
    public static void main (String[] args) throws NegativeNumber {
//        Person p1 = new Person ("李四",-99);
        Person p2 = new Person ();
//        new Person ("李四",-99);
        System.out.println ( new Person ("张三",-9));
    }


}

class NegativeNumber extends Exception{
    public NegativeNumber () {
    }

    public NegativeNumber (String message) {
        super (message);
    }

    public NegativeNumber (String message, Throwable cause) {
        super (message, cause);
    }

    public NegativeNumber (Throwable cause) {
        super (cause);
    }

    public NegativeNumber (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super (message, cause, enableSuppression, writableStackTrace);
    }
}
class Person{
    private String name;
    private int life;

/*    {
        try {
            ifLife (life);
        } catch (NegativeNumber negativeNumber) {
            negativeNumber.printStackTrace ();
        }
    }*/
    public void ifLife(int life) throws NegativeNumber {
        if(life < 0){
            throw new NegativeNumber (String.valueOf (life),new Exception(),false,true);
        }
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", life=" + life +
                '}';
    }

    public Person () {
    }

    public Person (String name, int life) throws NegativeNumber {
        ifLife (life);
        this.name = name;
        this.life = life;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getLife () {
        return life;
    }

    public void setLife (int life) throws NegativeNumber {
        ifLife (life);
        this.life = life;
    }
}