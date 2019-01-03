package juan.Java32jichu.T78;

public interface Credit {
    void prepaid ();

    default void save () {
        System.out.println ("可以存钱");
    }
}
