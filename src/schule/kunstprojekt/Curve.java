package schule.kunstprojekt;

public class Curve extends Line {
    public double curvuture;
    /**
     * Instantiates a new Line.
     *
     * @param start the start
     * @param end   the end
     */
    public Curve(Point start, Point end, double curvuture) {
        super(start, end);
        this.curvuture = curvuture;
    }
}
