package schule.kunstprojekt.form;

import java.awt.*;

/**
 * The type Form.
 */
public abstract class Form {
    /**
     * The A.
     */
    public Point a;
    /**
     * The Color.
     */
    public Color color;

    /**
     * Draw.
     *
     * @param g the g
     */
    public abstract void draw(Graphics g);
}
