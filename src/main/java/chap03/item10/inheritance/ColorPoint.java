package chap03.item10.inheritance;

import chap03.item10.Color;
import chap03.item10.Point;

import java.util.Objects;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    //잘못된 코드 - 대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof CounterPoint))
//            return false;
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

    //잘못된 코드 - 추이성 위배
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        if(!(o instanceof ColorPoint))
            return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.BLUE);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.RED);
        System.out.printf("%s %s %s%n",
                p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
