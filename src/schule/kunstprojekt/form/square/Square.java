package schule.kunstprojekt.form.square;

import schule.kunstprojekt.form.Line;
import schule.kunstprojekt.form.Point;

import java.awt.*;

/**
 * The type Square.
 */
public class Square {
    private final Line lineA;
    private final Line lineB;
    private final Line lineC;
    private final Line lineD;

    /**
     * Instantiates a new Square.
     *
     * @param start   the starting point
     * @param lengthA the length a
     * @param lengthB the length b
     */
    public Square(Point start, int lengthA, int lengthB) {

        Point b = new Point(start.x + lengthA, start.y);
        Point c = new Point(start.x + lengthA, start.y + lengthB);
        Point d = new Point(start.x, start.y + lengthB);

        this.lineA = new Line(start, b);    //  d --- c
        this.lineB = new Line(b, c);        //  |     |
        this.lineC = new Line(c, d);        //  |     |
        this.lineD = new Line(d, start);    //  a --- b
    }

    /**
     * Draw.
     *
     * @param g the g
     */
    public void draw(Graphics g) {
        this.lineA.draw(g);
        this.lineB.draw(g);
        this.lineC.draw(g);
        this.lineD.draw(g);
    }
}
