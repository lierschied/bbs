package schule.kunstprojekt.form.square.rectangle;

import schule.kunstprojekt.Point;
import schule.kunstprojekt.form.square.Rectangle;

public class Quadrat extends Rectangle
{
    /**
     * Instantiates a new Square.
     *
     * @param start   the starting point
     */
    public Quadrat(Point start, int length) {
        super(start, length, length);
    }
}
