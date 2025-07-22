
package GUI;

import Clases.Asiento;
import Clases.Sala;
import Clases.Pago;
import Clases.Pelicula;
import java.awt.Color;
import javax.swing.JButton;


public class SeleccionarAsiento extends javax.swing.JFrame {

    private final JButton[][] asiento = new JButton[5][5];
    private Sala sala;
    private final RealizarPago_Cliente pagoCliente;
    private final RealizarPago_Empleado pagoEmpleado;
    private int iduser;
    private Pago pago;
    private Pelicula pelicula;
    private int var;

    public SeleccionarAsiento() {
        initComponents();
        this.sala = new Sala();
        this.pagoCliente = new RealizarPago_Cliente();
        this.pagoEmpleado = new RealizarPago_Empleado();

    }

    public void iniciar(int iduser, Pago pago, Pelicula pelicula, Sala sala, int var) {
        this.iduser = iduser;
        this.pago = pago;
        this.pelicula = pelicula;
        this.sala = sala;
        this.var = var;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.listarAsientos();
    }

    private void listarAsientos() {
        // Arreglo temporal para facilitar la asignación de botones por fila y columna
        JButton[][] btns = {
            {this.asiento00, this.asiento01, this.asiento02, this.asiento03, this.asiento04},
            {this.asiento10, this.asiento11, this.asiento12, this.asiento13, this.asiento14},
            {this.asiento20, this.asiento21, this.asiento22, this.asiento23, this.asiento24},
            {this.asiento30, this.asiento31, this.asiento32, this.asiento33, this.asiento34},
            {this.asiento40, this.asiento41, this.asiento42, this.asiento43, this.asiento44}
        };

        // Recorremos todos los botones (asientos)
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                this.asiento[fila][col] = btns[fila][col]; // Asignamos al arreglo principal

                // Establecemos un identificador único para cada botón: "fila,col"
                this.asiento[fila][col].setActionCommand(fila + "," + col);

                // Asociamos el mismo ActionListener a todos los botones
                this.asiento[fila][col].addActionListener(this::asientoActionPerformed);
            }
        }
        
        /*
        
        */
    }

    private void asientoActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtenemos el botón que generó el evento
        JButton boton = (JButton) evt.getSource();

        // Verificamos si el botón ya está seleccionado (verde)
        boolean seleccionado = boton.getBackground() == Color.GREEN;

        if (seleccionado) {
            // Si ya está seleccionado, lo desmarcamos (color por defecto)
            boton.setBackground(null);
        } else {
            // Si no está seleccionado y hay menos de 3 seleccionados, lo seleccionamos (verde)
            if (contarSeleccionados() < this.var) {//-----var
                boton.setBackground(Color.GREEN);
            }
        }

        // Actualizamos el estado de todos los botones (activar/desactivar)
        actualizarHabilitados();
    }

    private int contarSeleccionados() {
        int count = 0;

        // Recorremos todos los asientos para contar los seleccionados (color verde)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.asiento[i][j].getBackground() == Color.GREEN) {
                    count++;
                }
            }
        }

        return count; // Retornamos el número de asientos seleccionados
    }

    private void actualizarHabilitados() {
        int seleccionados = contarSeleccionados(); // Contamos cuántos están seleccionados
        this.sala.tamañoVector(this.contarSeleccionados());//definiendo la dimension del vector
        /*
        true: cantidad de boletos (this.var) es menor o igual a asientos seleccionados (seleccionados)
        false: cantidad de boletos (this.var) es mayor o igual a asientos seleccionados (seleccionados)
         */
        boolean bloquear = seleccionados >= this.var;
        int indice = 0;//indice el vector
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                /*
                la variable yaSeleccionado almacena un  true o false
                true: si algun asiento seleccionado es de color verde
                false: si algun asiento seleccionado no es de color verde
                 */
                boolean yaSeleccionado = this.asiento[i][j].getBackground() == Color.GREEN;

                if (yaSeleccionado) {
                    //Enviar a la clase Sala los asientos ya seleccionados
                    this.sala.AsientoSeleccionado(i, j, indice);
                    indice++;
                }

                // Solo dejamos habilitados los que ya están seleccionados,
                // los demás se desactivan si hay mas asiento que la cantidad de boletos comprados
                this.asiento[i][j].setEnabled(!bloquear || yaSeleccionado);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        getSalon = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        asiento40 = new javax.swing.JButton();
        asiento41 = new javax.swing.JButton();
        asiento44 = new javax.swing.JButton();
        asiento43 = new javax.swing.JButton();
        asiento42 = new javax.swing.JButton();
        asiento30 = new javax.swing.JButton();
        asiento31 = new javax.swing.JButton();
        asiento32 = new javax.swing.JButton();
        asiento33 = new javax.swing.JButton();
        asiento34 = new javax.swing.JButton();
        asiento20 = new javax.swing.JButton();
        asiento21 = new javax.swing.JButton();
        asiento22 = new javax.swing.JButton();
        asiento23 = new javax.swing.JButton();
        asiento24 = new javax.swing.JButton();
        asiento10 = new javax.swing.JButton();
        asiento11 = new javax.swing.JButton();
        asiento12 = new javax.swing.JButton();
        asiento13 = new javax.swing.JButton();
        asiento14 = new javax.swing.JButton();
        asiento00 = new javax.swing.JButton();
        asiento01 = new javax.swing.JButton();
        asiento02 = new javax.swing.JButton();
        asiento03 = new javax.swing.JButton();
        asiento04 = new javax.swing.JButton();
        botonAsientos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar asientoS");

        getSalon.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setToolTipText("vv");
        jPanel2.setName("c"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/scram_px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        asiento40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        asiento04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/butaca_50px.png"))); // NOI18N

        javax.swing.GroupLayout getSalonLayout = new javax.swing.GroupLayout(getSalon);
        getSalon.setLayout(getSalonLayout);
        getSalonLayout.setHorizontalGroup(
            getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getSalonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getSalonLayout.createSequentialGroup()
                        .addComponent(asiento00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(asiento01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(asiento02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(asiento03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(asiento04, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(getSalonLayout.createSequentialGroup()
                            .addComponent(asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(getSalonLayout.createSequentialGroup()
                                .addComponent(asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(getSalonLayout.createSequentialGroup()
                                .addComponent(asiento30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(asiento34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(getSalonLayout.createSequentialGroup()
                                    .addComponent(asiento40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(asiento41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(asiento42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(asiento43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(asiento44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        getSalonLayout.setVerticalGroup(
            getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getSalonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(getSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asiento00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento04, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        botonAsientos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonAsientos.setText("Seleccionar");
        botonAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(getSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(botonAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(getSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsientosActionPerformed
        // TODO add your handling code here:
        
        if (this.iduser == 0) {//cliente
            this.pagoCliente.iniciar(this.pago, this.pelicula, this.sala);

        } else if (this.iduser == 1) {//empleado
            this.pagoEmpleado.iniciar(this.pago, this.pelicula, this.sala);
        }
        this.setVisible(false);

    }//GEN-LAST:event_botonAsientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asiento00;
    private javax.swing.JButton asiento01;
    private javax.swing.JButton asiento02;
    private javax.swing.JButton asiento03;
    private javax.swing.JButton asiento04;
    private javax.swing.JButton asiento10;
    private javax.swing.JButton asiento11;
    private javax.swing.JButton asiento12;
    private javax.swing.JButton asiento13;
    private javax.swing.JButton asiento14;
    private javax.swing.JButton asiento20;
    private javax.swing.JButton asiento21;
    private javax.swing.JButton asiento22;
    private javax.swing.JButton asiento23;
    private javax.swing.JButton asiento24;
    private javax.swing.JButton asiento30;
    private javax.swing.JButton asiento31;
    private javax.swing.JButton asiento32;
    private javax.swing.JButton asiento33;
    private javax.swing.JButton asiento34;
    private javax.swing.JButton asiento40;
    private javax.swing.JButton asiento41;
    private javax.swing.JButton asiento42;
    private javax.swing.JButton asiento43;
    private javax.swing.JButton asiento44;
    private javax.swing.JButton botonAsientos;
    private javax.swing.JPanel getSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
