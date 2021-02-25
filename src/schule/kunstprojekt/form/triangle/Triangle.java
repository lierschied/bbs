package schule.kunstprojekt.form.triangle;

import schule.kunstprojekt.form.*;
import schule.kunstprojekt.form.Point;

import java.awt.*;

public class Triangle extends Form {

    public Line lineA;
    public Line lineB;
    public Line lineC;

    public Triangle(Point start, int lengthA, int lengthB, int lengthC) {
        Point a = start;
        Point b = new Point(start.x+lengthA, start.y);
        Point c = new Point(start.x+lengthA, start.y+lengthB);

        this.lineA = new Line(a, b);
        this.lineB = new Line(b, c);
        this.lineC = new Line(c, a);
    }

    @Override
    public void draw(Graphics g) {
        this.lineA.draw(g);
        this.lineB.draw(g);
        this.lineC.draw(g);
    }
}
