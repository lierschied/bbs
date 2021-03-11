package schule.kunstprojekt;

import schule.kunstprojekt.Point;

import java.awt.*;

/**
 * The type Line.
 */
public class Line {
    /**
     * The Start.
     */
    public schule.kunstprojekt.Point start;
    /**
     * The End.
     */
    public schule.kunstprojekt.Point end;
    public Color color;
    public float stroke;

    /**
     * Instantiates a new Line.
     *
     * @param start the start
     * @param end   the end
     */
    public Line(schule.kunstprojekt.Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Draw.
     *
     * @param g the g
     */
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.color);
        g2d.setStroke(new BasicStroke(this.stroke));
        g2d.drawLine(start.x, start.y, end.x, end.y);
    }

}
