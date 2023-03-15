package LibreriaGraficos;

import java.awt.*;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 14 2023
 */

public class Circulo extends Figura {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int d = getWidth() - 1;
        if (getHeight() < getWidth()) // Pregunta por la dimensión menor.
            d = getHeight() - 1;
        g.drawOval(0, 0, d, d);
        g.fillOval(0, 0, d, d);
    }
}
