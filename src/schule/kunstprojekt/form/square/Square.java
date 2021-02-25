package schule.kunstprojekt.form.square;

import schule.kunstprojekt.form.Form;
import schule.kunstprojekt.form.Line;
import schule.kunstprojekt.form.Point;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * The type Square.
 */
public class Square extends Form {
    private Line lineA;
    private Line lineB;
    private Line lineC;
    private Line lineD;

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
        List<Line> lines = this.getLines();
        for (Line line : lines) {
            line.color = this.color;
            line.stroke = this.stroke;
            line.draw(g);
        }
    }

    public List<Line> getLines() {
        List<Line> lines = new ArrayList<Line>();
        lines.add(this.lineA);
        lines.add(this.lineB);
        lines.add(this.lineC);
        lines.add(this.lineD);

        return lines;
    }
}
