package evidencia;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasB = new javax.swing.JButton();
        AltaDoctorB = new javax.swing.JButton();
        altaPacienteB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasB.setText("Atras");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });

        AltaDoctorB.setText("Dar alta doctor");
        AltaDoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaDoctorBActionPerformed(evt);
            }
        });

        altaPacienteB.setText("Dar alta paciente");
        altaPacienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPacienteBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(altaPacienteB)
                    .addComponent(AltaDoctorB)
                    .addComponent(atrasB))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(AltaDoctorB)
                .addGap(67, 67, 67)
                .addComponent(altaPacienteB)
                .addGap(64, 64, 64)
                .addComponent(atrasB)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
        new LoginView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBActionPerformed

    private void AltaDoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaDoctorBActionPerformed
        new DarAltaDoctorView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AltaDoctorBActionPerformed

    private void altaPacienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPacienteBActionPerformed
        new DarAltaPacienteView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_altaPacienteBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaDoctorB;
    private javax.swing.JButton altaPacienteB;
    private javax.swing.JButton atrasB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
