package schule.kunstprojekt;

import schule.kunstprojekt.form.square.Rectangle;
import schule.kunstprojekt.form.square.rectangle.Quadrat;
import schule.kunstprojekt.form.Square;
import schule.kunstprojekt.form.Triangle;

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
        Square square = new Rectangle(startSquare,40, 80);
        square.stroke = 2;
        square.color = Color.red;
        square.draw(g);

        Point startQuadrat = new Point(150, 150);
        Quadrat quadrat = new Quadrat(startQuadrat, 40);
        quadrat.stroke = 6;
        quadrat.color = Color.blue;
        quadrat.draw(g);

        Point startTriangle = new Point(200, 150);
        Triangle triangle = new Triangle(startTriangle, 40, 40, 40);
        triangle.stroke = 10F;
        triangle.color = Color.green;
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
