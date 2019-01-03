package juan.A30.T22;

public class Painter {
    private String name;

    public Painter () {
    }

    public Painter (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    void draw (Pen p) {
        System.out.print ("画家" + name + "正在绘画，");
        p.write ();
    }
}
