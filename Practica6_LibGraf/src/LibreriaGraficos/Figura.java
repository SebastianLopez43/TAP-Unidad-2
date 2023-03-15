package LibreriaGraficos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 14 2023
 */

public class Figura extends JComponent implements MouseListener, MouseMotionListener {
    private int xi, yi;
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }       
    
    public Figura() {
        setSize(360, 360);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(Figura.getSelected() == this)
            g.setColor(Color.red);
        else
            g.setColor(Color.black);
    }
        
    private static Figura selected = null;

    public static Figura getSelected() {
        return selected;
    }
    
    public static void setSelected(Figura aselected) {
        Figura auxi = selected; // selected actual se guarda en auxi.
        selected = aselected; // La nueva figura se guarda en selected.
        if(auxi != null)
            auxi.repaint(); // Llama a repintar a auxi, le regresa su color.
        selected.repaint(); // Llama a repintar a seleccionada, le cambia su color.
    }
    
    public void mouse_Pressed(MouseEvent e) {
        xi = e.getX(); // Guarda la posición en "x" donde se hizo clic.
        yi = e.getY(); // Guarda la posición en "y".
        setSelected(this); // Se manda a marcar y, por consecuencia, repintar.
    }
    
    public void mouse_Dragged(MouseEvent e) {
        int xf, yf, increaseX, increaseY;
        xf = e.getX(); // Posición en "x" donde se posiciona el mouse.
        yf = e.getY(); // Posición en "y" donde se posiciona el mouse.
        increaseX = xf - xi; // Cambio de valor en el eje "x".
        increaseY = yf - yi; // Camcio de valor en el eje "y".
        setLocation(getX() + increaseX, getY() + increaseY);
    }
}