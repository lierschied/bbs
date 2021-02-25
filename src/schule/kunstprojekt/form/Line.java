package schule.kunstprojekt.form;

import java.awt.*;

/**
 * The type Line.
 */
public class Line extends Form{
    /**
     * The Start.
     */
    public Point start;
    /**
     * The End.
     */
    public Point end;

    /**
     * Instantiates a new Line.
     *
     * @param start the start
     * @param end   the end
     */
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.drawLine(start.x, start.y, end.x, end.y);
    }

}
