package schule.kunstprojekt.form.triangle;

import schule.kunstprojekt.form.*;
import schule.kunstprojekt.form.Point;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
        List<Line> lines = this.getLines();
        for (Line line : lines) {
            line.color = this.color;
            line.stroke = this.stroke;
            line.draw(g);
        }
    }

    public java.util.List<Line> getLines() {
        List<Line> lines = new ArrayList<Line>();
        lines.add(this.lineA);
        lines.add(this.lineB);
        lines.add(this.lineC);

        return lines;
    }
}
