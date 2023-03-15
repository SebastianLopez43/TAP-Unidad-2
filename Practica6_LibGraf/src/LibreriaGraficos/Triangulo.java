package LibreriaGraficos;

import java.awt.*;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 14 2023
 */

public class Triangulo extends Figura {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Los vértices del triángulo son uno de xPoints con uno de yPoints.
        int xPoints[] = {0, 0, getWidth() - 1};
        int yPoints[] = {0, getHeight() - 1, getHeight() - 1};
        // Se conectan las líneas formando un polígono y se rellena al usar el método fill.
        g.drawPolygon(xPoints, yPoints, 3);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
