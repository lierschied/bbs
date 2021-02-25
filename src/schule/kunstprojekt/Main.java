package schule.kunstprojekt;

import schule.kunstprojekt.form.Point;
import schule.kunstprojekt.form.square.Quadrat;
import schule.kunstprojekt.form.square.Square;
import schule.kunstprojekt.form.triangle.Triangle;

import javax.swing.*;
import java.awt.*;

/**
 * The type Main.
 */
public class Main extends JFrame {
    /**
     * Instantiates a new Main.
     */
    public Main() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void paint(Graphics g) {
        super.paint(g);

        Point startSquare = new Point(100, 150);
        Square square = new Square(startSquare,40, 80);
        square.draw(g);

        Point startQuadrat = new Point(150, 150);
        Quadrat quadrat = new Quadrat(startQuadrat, 40);
        quadrat.draw(g);

        Point startTriangle = new Point(200, 150);
        Triangle triangle = new Triangle(startTriangle, 40, 40, 40);
        triangle.draw(g);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        new Main();

    }
}
