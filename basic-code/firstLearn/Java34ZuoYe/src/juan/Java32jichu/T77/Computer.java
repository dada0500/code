package juan.Java32jichu.T77;

public abstract class Computer {
    private String brand;
    abstract void playMovie(Movie movie);

    public Computer () {
    }

    public Computer (String brand) {
        this.brand = brand;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
}
