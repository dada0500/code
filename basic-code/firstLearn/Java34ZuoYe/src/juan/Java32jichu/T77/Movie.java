package juan.Java32jichu.T77;

public class Movie {
    private String name;
    private String director;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDirector () {
        return director;
    }

    public void setDirector (String director) {
        this.director = director;
    }

    public Movie (String name, String director) {
        this.name = name;
        this.director = director;
    }

    public Movie () {
    }
}
