package Ventana;

import LibreriaGraficos.*;
import java.util.Random;
import javax.swing.JFrame;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 14 2023
 */

public class Ventana extends JFrame {
    Random random;
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        random = new Random();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnDrawing = new java.awt.Panel();
        jpnButtons = new java.awt.Panel();
        btnRectangle = new java.awt.Button();
        btnCircle = new java.awt.Button();
        btnTriangle = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jpnDrawingLayout = new javax.swing.GroupLayout(jpnDrawing);
        jpnDrawing.setLayout(jpnDrawingLayout);
        jpnDrawingLayout.setHorizontalGroup(
            jpnDrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jpnDrawingLayout.setVerticalGroup(
            jpnDrawingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        getContentPane().add(jpnDrawing, java.awt.BorderLayout.CENTER);

        jpnButtons.setBackground(java.awt.Color.orange);

        btnRectangle.setBackground(new java.awt.Color(204, 0, 51));
        btnRectangle.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnRectangle.setForeground(new java.awt.Color(255, 255, 255));
        btnRectangle.setLabel("Rectángulo");
        btnRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectangleActionPerformed(evt);
            }
        });
        jpnButtons.add(btnRectangle);

        btnCircle.setBackground(new java.awt.Color(51, 102, 255));
        btnCircle.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnCircle.setForeground(new java.awt.Color(255, 255, 255));
        btnCircle.setLabel("Círculo");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });
        jpnButtons.add(btnCircle);

        btnTriangle.setBackground(new java.awt.Color(255, 255, 0));
        btnTriangle.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnTriangle.setLabel("Triángulo");
        btnTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriangleActionPerformed(evt);
            }
        });
        jpnButtons.add(btnTriangle);

        getContentPane().add(jpnButtons, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectangleActionPerformed
        Rectangulo rect = new Rectangulo();
        rect.setSize(50, 60);
        rect.setLocation((int)(random.nextFloat()*getWidth()), (int)(random.nextFloat()*getHeight()));
        jpnDrawing.add(rect);
        jpnDrawing.repaint();
    }//GEN-LAST:event_btnRectangleActionPerformed

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        Circulo circle = new Circulo();
        circle.setSize(50, 50);
        circle.setLocation((int)(random.nextFloat()*getWidth()), (int)(random.nextFloat()*getHeight()));
        jpnDrawing.add(circle);
        jpnDrawing.repaint();
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriangleActionPerformed
        Triangulo trian = new Triangulo();
        trian.setSize(50, 50);
        trian.setLocation((int)(random.nextFloat()*getWidth()), (int)(random.nextFloat()*getHeight()));
        jpnDrawing.add(trian);
        jpnDrawing.repaint();
    }//GEN-LAST:event_btnTriangleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCircle;
    private java.awt.Button btnRectangle;
    private java.awt.Button btnTriangle;
    private java.awt.Panel jpnButtons;
    private java.awt.Panel jpnDrawing;
    // End of variables declaration//GEN-END:variables
}
