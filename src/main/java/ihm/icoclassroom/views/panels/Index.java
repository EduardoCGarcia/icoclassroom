package ihm.icoclassroom.views.panels;

import ihm.icoclassroom.tools.TextPrompt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

/**
 * TODO Cada una de las cards debe tener un borde vació de [10,10,10,10]
 *
 * @author echav
 */
public class Index extends javax.swing.JPanel {

    private Timer timer;

    public Index() {
        initComponents();
        TextPrompt prubea = new TextPrompt("Nombre de la materia", txtBuscarMateria);
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes realizar la acción que deseas después de 3 segundos
                System.out.println("Han pasado 3 segundos sin presionar teclas: " + txtBuscarMateria.getText());
            }
        });
        timer.setRepeats(false);
        txtBuscarMateria.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                // Reiniciar el temporizador si se presiona una tecla
                timer.restart();
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }

           
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarMateria = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        txtBuscarMateria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtBuscarMateria.setMinimumSize(new java.awt.Dimension(64, 70));
        txtBuscarMateria.setPreferredSize(new java.awt.Dimension(71, 70));
        add(txtBuscarMateria, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));
        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscarMateria;
    // End of variables declaration//GEN-END:variables
}
