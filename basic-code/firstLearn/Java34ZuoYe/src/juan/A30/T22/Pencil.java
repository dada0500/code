package juan.A30.T22;

public class Pencil extends Pen {
    public Pencil () {
    }

    public Pencil (Float price, String color) {
        super (price, color);
    }

    @Override
    public void write () {
        System.out.println ("在使用的是价格为" + getPrice () + "的" + getColor () + "颜色的铅笔");
    }
}
