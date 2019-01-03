package com.heima.daan;

public class T10_00 {


/*
3.定义测试类Test10
 a)提供main方法,在main方法中
  i.使用满参构造方法创建Person对象,分数传入一个负数,运行程序
  ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
  iii.使用空参构造创建Person对象
  iv.调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
  v.调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 */

        public static void main(String[] args) {
//  i.使用满参构造方法创建Person对象,分数传入一个负数,运行程序
//  Person p = new Person("林思意", -100);
//  ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
//  iii.使用空参构造创建Person对象
            Person p = new Person();
            Person p1 = new Person("nameMM",-99);
            System.out.println (p1);
//  iv.调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
            p.setLifeValue(1000);
//  v.调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
            p.setLifeValue(-100);
        }
    }




class NoLifeValueExption extends RuntimeException {
    public NoLifeValueExption() {
        super();
    }

    public NoLifeValueExption(String message) {
        super(message);
    }
}


/*
 2.定义Person类
 a)属性:名称(name)和生命值(lifeValue)
  b)提供空参构造
  c)提供有参构造;
   i.使用setXxx方法给name和lifeValue赋值
 d)提供setter和getter方法
  i.在setLifeValue(int lifeValue)方法中
   1.首先判断,如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为:生命值不能为负数:xxx.
   2.然后在给成员lifeValue赋值.
 */

class Person {
    // 名称(name)
    private String name;
    // 生命值(lifeValue)
    private int lifeValue;

    // 空参构造
    public Person() {
        super();
    }

    // c)提供有参构造;
    public Person(String name, int lifeValue) {
        super();
// i.使用setXxx方法给name和lifeValue赋值
        setName(name);
        setLifeValue(lifeValue);
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }

    //d)提供setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    // i.在setLifeValue(int lifeValue)方法中
    public void setLifeValue(int lifeValue) {
// 1.首先判断,如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为:生命值不能为负数:xxx.
        if (lifeValue <0) {
            throw new NoLifeValueExption("生命值不能为负数:" + lifeValue);
        }
// 2.然后在给成员lifeValue赋值.
        this.lifeValue = lifeValue;
    }
}
