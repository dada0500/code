package juan.Java32jichu.T77;

public interface USB {
    void openUSB();
    void closeUSB();
    default void connect(){
        System.out.println ("可以连接任意USB设备");
    }
}
