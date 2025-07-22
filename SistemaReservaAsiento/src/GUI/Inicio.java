package GUI;

import Clases.Pilas;


public class Inicio extends javax.swing.JFrame {
    private final Cartelera cartelera;
    boolean estado = false;
    Pilas pila;
    
    public void setEstado(boolean nuevo){
        estado = nuevo;
    }
    
    public void setPila(Pilas pila) {
        this.pila = pila;
    }

    public Inicio() {
        initComponents();
        
        this.cartelera = new Cartelera();
        this.cartelera.setPila(pila);
        this.iniciar("cliente");
    }
    
    void iniciar(String cliente){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Dibujitos Premier");
        
        if (estado == false){
            pila = new Pilas();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bannerLabel = new javax.swing.JLabel();
        BtnCliente = new javax.swing.JButton();
        BtnEmpleado = new javax.swing.JButton();
        mensajeLabel = new javax.swing.JLabel();
        BtnEmpleado1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 45, 70));

        bannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cine-logo.png"))); // NOI18N

        BtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cliente_px.png"))); // NOI18N
        BtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClienteActionPerformed(evt);
            }
        });

        BtnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado_2_px.png"))); // NOI18N
        BtnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmpleadoActionPerformed(evt);
            }
        });

        mensajeLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(245, 240, 220));
        mensajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mensajeLabel.setText("Bienvenidos");

        BtnEmpleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/engineer.png"))); // NOI18N
        BtnEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmpleado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BtnEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(BtnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bannerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mensajeLabel)
                                .addGap(166, 166, 166)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(bannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensajeLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClienteActionPerformed
        // Ventana de Cartelera
        this.cartelera.iniciar("cliente");//Enviar la clase a cartelera
        this.cartelera.setPila(pila);
        this.dispose();                  // Luego cerrar la ventana actual
        
        Inicio inicio = new Inicio(); 
        inicio.setEstado(true);// Crear instancia de la nueva ventana
        inicio.setPila(pila);
        inicio.setVisible(true);// Mostrar la nueva ventana

        this.dispose();                  // Luego cerrar la ventana actual
    }//GEN-LAST:event_BtnClienteActionPerformed

    private void BtnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmpleadoActionPerformed
        // Ventana de Login_Empleado
        this.dispose();          // Luego cerrar la ventana actual
        Login_Empleado loginEmpleado = new Login_Empleado();
        loginEmpleado.setPila(pila);
        loginEmpleado.inicio(this);
    }//GEN-LAST:event_BtnEmpleadoActionPerformed

    private void BtnEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmpleado1ActionPerformed
        // Ventana de Admin
        this.dispose();          // Luego cerrar la ventana actual
        Login_Admin loginAdmin = new Login_Admin();
        loginAdmin.setPila(pila);
        loginAdmin.inicio(this);
    }//GEN-LAST:event_BtnEmpleado1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCliente;
    private javax.swing.JButton BtnEmpleado;
    private javax.swing.JButton BtnEmpleado1;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeLabel;
    // End of variables declaration//GEN-END:variables
}
