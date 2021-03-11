package schule.kunstprojekt.form;

import schule.kunstprojekt.Form;
import schule.kunstprojekt.Line;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * The type Square.
 */
public class Square extends Form {
    public Line lineA;
    public Line lineB;
    public Line lineC;
    public Line lineD;


    /**
     * Draw.
     *
     * @param g the g
     */
    public void draw(Graphics g) {
        java.util.List<Line> lines = this.getLines();
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
        lines.add(this.lineD);

        return lines;
    }
}
