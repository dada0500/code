package juan.A29.T22;

public abstract class Animal {
    private String name;

    abstract void speak(String str);

    public Animal () {
    }

    public Animal (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
