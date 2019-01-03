package juan.Java32jichu.T78;

public class ICBC extends Card implements Credit {
    @Override
    void cardholder (Person p) {
        System.out.println (p.getName () + "使用的是" + getName () + "信用卡");
    }

    @Override
    public void prepaid () {
        System.out.println ("信用卡可以先消费");
    }

    public ICBC () {
    }

    public ICBC (String name) {
        super (name);
    }
}
