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
        index1 = new ihm.icoclassroom.views.panels.Index();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(836, 621));
        getContentPane().add(header1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(footer1, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(index1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ihm.icoclassroom.views.panels.Footer footer1;
    private ihm.icoclassroom.views.panels.Header header1;
    private ihm.icoclassroom.views.panels.Index index1;
    // End of variables declaration//GEN-END:variables
}
