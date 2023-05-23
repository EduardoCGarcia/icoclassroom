package ihm.icoclassroom.views.panels;

import ihm.icoclassroom.models.Materia;

public class Card extends javax.swing.JPanel {

    private Materia m;
    
    public Card(Materia m) {
        this.m = m;
        initComponents();
        lblMateria.setText(m.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMateria = new javax.swing.JLabel();
        lblProfesor = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblSalon = new javax.swing.JLabel();
        lblEdificio = new javax.swing.JLabel();
        btnVerMapa = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(70, 130));
        setMinimumSize(new java.awt.Dimension(70, 130));
        setPreferredSize(new java.awt.Dimension(70, 130));
        setLayout(new java.awt.GridLayout(0, 1));

        lblMateria.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lblMateria.setText("Materia");
        add(lblMateria);

        lblProfesor.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lblProfesor.setText("Profesor");
        add(lblProfesor);

        lblHorario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lblHorario.setText("Horario");
        add(lblHorario);

        lblSalon.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lblSalon.setText("Salón");
        add(lblSalon);

        lblEdificio.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        lblEdificio.setText("Edificio");
        add(lblEdificio);

        btnVerMapa.setBackground(new java.awt.Color(51, 51, 51));
        btnVerMapa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerMapa.setForeground(new java.awt.Color(153, 153, 153));
        btnVerMapa.setText("Ver en el Mapa");
        btnVerMapa.setMaximumSize(new java.awt.Dimension(158, 41));
        btnVerMapa.setMinimumSize(new java.awt.Dimension(158, 41));
        add(btnVerMapa);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerMapa;
    private javax.swing.JLabel lblEdificio;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JLabel lblSalon;
    // End of variables declaration//GEN-END:variables
}
