package ihm.icoclassroom.views.main;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new ihm.icoclassroom.views.panels.Header();
        footer1 = new ihm.icoclassroom.views.panels.Footer();
        mapa1 = new ihm.icoclassroom.views.panels.Mapa();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(header1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(footer1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout mapa1Layout = new javax.swing.GroupLayout(mapa1);
        mapa1.setLayout(mapa1Layout);
        mapa1Layout.setHorizontalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        mapa1Layout.setVerticalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        getContentPane().add(mapa1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ihm.icoclassroom.views.panels.Footer footer1;
    private ihm.icoclassroom.views.panels.Header header1;
    private ihm.icoclassroom.views.panels.Mapa mapa1;
    // End of variables declaration//GEN-END:variables
}
