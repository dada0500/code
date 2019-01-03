package com.heima.zuoye;

public class T5 {
    public static void main (String[] args) {
        new Son ().daJiangYou ();
    }
}

//1.	有函数式接口Helper如下
@FunctionalInterface
interface Helper {
    void help();
}

//2.	有父类Father如下
class Father {
    public void askMoney(){
        System.out.println("向家中的财政老大要钱购买家庭物资...");
    }

    public void spendMoney(){
        System.out.println("去村口小卖部付钱给老板打酱油...");
    }
}


//3.	有子类Son如下
class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }
    @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }
    public void helpFather(Helper helper) {
        helper.help();
    }
    //完成帮助Father打酱油的方法
    public void daJiangYou() {
//        super.spendMoney ();
        //*****
        helpFather (super::askMoney);
        helpFather (super::spendMoney);
    }
}