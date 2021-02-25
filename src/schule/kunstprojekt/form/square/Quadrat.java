package schule.kunstprojekt.form.square;

import schule.kunstprojekt.form.Point;

public class Quadrat extends Square
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
