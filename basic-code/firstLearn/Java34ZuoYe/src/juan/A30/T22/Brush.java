package juan.A30.T22;

public class Brush extends Pen {
    public Brush () {
    }

    public Brush (Float price, String color) {
        super (price, color);
    }

    @Override
    public void write () {
        System.out.println ("现在使用的是价格为" + getPrice () + "的" + getColor () + "颜色的画笔");
    }
}
