package juan.Java32jichu.T78;

public abstract class Card {
    private String name;

    abstract void cardholder(Person p);

    public Card () {
    }

    public Card (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
