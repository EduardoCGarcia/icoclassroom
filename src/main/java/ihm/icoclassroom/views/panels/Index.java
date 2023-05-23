package ihm.icoclassroom.views.panels;

import ihm.icoclassroom.controllers.TestController;
import ihm.icoclassroom.exceptions.NoHayMateriasException;
import ihm.icoclassroom.models.Materia;
import ihm.icoclassroom.tools.TextPrompt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * TODO Cada una de las cards debe tener un borde vació de [10,10,10,10]
 *
 * @author echav
 */
public class Index extends javax.swing.JPanel {

    private Timer timer;
    private boolean enterPressed = false;

    public Index() {
        initComponents();
        TextPrompt prubea = new TextPrompt("Nombre de la materia", txtBuscarMateria);
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!enterPressed) {
                    try {
                        mostrarMaterias(txtBuscarMateria.getText());
                    } catch (NoHayMateriasException ex) {
                        enterPressed = false;
                    }
                } else {
                    enterPressed = false;
                }
            }
        });
        timer.setRepeats(false);
        txtBuscarMateria.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
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
        pnlCardsContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        txtBuscarMateria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtBuscarMateria.setMinimumSize(new java.awt.Dimension(64, 70));
        txtBuscarMateria.setPreferredSize(new java.awt.Dimension(71, 70));
        txtBuscarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMateriaActionPerformed(evt);
            }
        });
        add(txtBuscarMateria, java.awt.BorderLayout.PAGE_START);

        pnlCardsContainer.setLayout(new java.awt.GridLayout(3, 3));
        add(pnlCardsContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMateriaActionPerformed
        try {
            mostrarMaterias(txtBuscarMateria.getText());
        } catch (NoHayMateriasException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtBuscarMateriaActionPerformed

    public void mostrarMaterias(String materia) throws NoHayMateriasException {
        pnlCardsContainer.removeAll();
        ArrayList<Materia> materias = buscarMaterias(materia);
        System.out.println("Num : " + materias.size());
        for (Materia mb : materias) {
            System.out.println(mb.getNombre());
            pnlCardsContainer.add(new Card(mb));
        }
        pnlCardsContainer.revalidate();
        pnlCardsContainer.repaint();
        enterPressed = true;
    }

    public ArrayList<Materia> buscarMaterias(String materia) throws NoHayMateriasException {
        materia = materia.toUpperCase();
        TestController t = new TestController(materia.toUpperCase());
        ArrayList<Materia> materias = t.buscar(materia);
        if (materias.isEmpty()) {
            throw new NoHayMateriasException("No se ha encontrado una materia con ese nombre");
        }
        return materias;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlCardsContainer;
    private javax.swing.JTextField txtBuscarMateria;
    // End of variables declaration//GEN-END:variables
}
