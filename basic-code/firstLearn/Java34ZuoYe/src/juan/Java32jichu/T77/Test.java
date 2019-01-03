package juan.Java32jichu.T77;

public class Test {
    public static void main (String[] args) {
        AlienComputer Computer = new AlienComputer("戴尔外星人");
        Movie m = new Movie ("我的父亲母亲","张艺谋");

        Computer.openUSB ();
        Computer.connect ();
        Computer.closeUSB ();
        Computer.playMovie (m);
    }
}
