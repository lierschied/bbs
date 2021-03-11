package schule.kunstprojekt.form.square;

import schule.kunstprojekt.Line;
import schule.kunstprojekt.Point;
import schule.kunstprojekt.form.Square;

public class Rectangle extends Square {

    /**
     * Instantiates a new Square.
     *
     * @param start   the starting point
     * @param lengthA the length a
     * @param lengthB the length b
     */
    public Rectangle(Point start, int lengthA, int lengthB) {
        Point b = new Point(start.x + lengthA, start.y);
        Point c = new Point(start.x + lengthA, start.y + lengthB);
        Point d = new Point(start.x, start.y + lengthB);

        this.lineA = new Line(start, b);    //  d --- c
        this.lineB = new Line(b, c);        //  |     |
        this.lineC = new Line(c, d);        //  |     |
        this.lineD = new Line(d, start);    //  a --- b
    }
}
