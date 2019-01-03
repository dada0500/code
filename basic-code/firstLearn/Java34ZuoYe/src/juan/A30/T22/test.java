package juan.A30.T22;

public class test {
    public static void main (String[] args) {
        Brush b1 = new Brush (5.8F,"红色");
        Pencil p1 = new Pencil (2.5F,"黑色");
        Painter pa = new Painter ("王流秋");
        pa.draw (b1);
        pa.draw (p1);

    }
}
