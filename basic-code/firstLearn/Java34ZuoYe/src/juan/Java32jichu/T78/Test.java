package juan.Java32jichu.T78;

public class Test {
    public static void main (String[] args) {
        ICBC bank = new ICBC ("工商银行");
        Person p = new Person ("张三");

        bank.prepaid ();
        bank.save ();
        bank.cardholder (p);
    }
}
