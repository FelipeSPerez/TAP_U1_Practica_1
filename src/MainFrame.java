
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainFrame extends javax.swing.JFrame {
    
    private ListaDobleCircularMedicina listaMedicamentos;
    private NodoMedicina nodoActual;
    private int numeroNodoActual;
    private int contadorTimer;
    private Timer temporizadorMedicamentos = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            NodoMedicina temporal = null;
            for(int i = 1; i <= listaMedicamentos.getNumeroNodos(); i++) {
                temporal = listaMedicamentos.getNumeroNodo(i);
                temporal.restarTemporizadorActual();
                if(temporal.getTemporizadorActual() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Es hora de tomar tu medicamento\n" + temporal.getMedicina().toString(), "ATENCION!!!", JOptionPane.WARNING_MESSAGE);
                    temporal.setTemporizadorActual(temporal.getTemporizadorOriginal());
                }
            }
            labelTiempoRestante.setText("Tiempo restante: " + nodoActual.getTemporizadorActual());
        }
    });
    
    public MainFrame() {
        initComponents();
        listaMedicamentos = new ListaDobleCircularMedicina();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        textAreaMedicamentoActual.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonNuevoMedicamento = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaMedicamentoActual = new javax.swing.JTextArea();
        botonSiguiente = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        labelTiempoRestante = new javax.swing.JLabel();
        labelNumeroMedicamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonNuevoMedicamento.setText("Agregar nuevo medicamento");
        botonNuevoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoMedicamentoActionPerformed(evt);
            }
        });

        botonSalir.setText("Cerrar programa");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        textAreaMedicamentoActual.setColumns(20);
        textAreaMedicamentoActual.setRows(5);
        jScrollPane1.setViewportView(textAreaMedicamentoActual);

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonAnterior.setText("Anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        labelTiempoRestante.setText("Tiempo restante:");

        labelNumeroMedicamento.setText("Mostrando medicamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAnterior)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTiempoRestante)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonSiguiente)))))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonNuevoMedicamento)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNumeroMedicamento)
                        .addGap(218, 218, 218))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(botonAnterior))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(botonSiguiente)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonNuevoMedicamento)
                        .addGap(7, 7, 7)
                        .addComponent(labelNumeroMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTiempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoMedicamentoActionPerformed
        RegistrarMedicina nuevaMedicina = new RegistrarMedicina(this, rootPaneCheckingEnabled, listaMedicamentos);
        nuevaMedicina.isAlwaysOnTop();
        nuevaMedicina.setVisible(true);
        if(listaMedicamentos.hayUnSoloElemento()) temporizadorMedicamentos.start();
        nodoActual = listaMedicamentos.getFin();
        numeroNodoActual = listaMedicamentos.getNumeroNodos();
        textAreaMedicamentoActual.setText(nodoActual.getMedicina().toString());
        labelNumeroMedicamento.setText("Mostrando medicamento: " + numeroNodoActual + " de " + listaMedicamentos.getNumeroNodos());
    }//GEN-LAST:event_botonNuevoMedicamentoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        nodoActual = nodoActual.getAnterior();
        if(numeroNodoActual == 1) numeroNodoActual = listaMedicamentos.getNumeroNodos();
        else numeroNodoActual -= 1;
        textAreaMedicamentoActual.setText(nodoActual.getMedicina().toString());
        labelNumeroMedicamento.setText("Mostrando medicamento: " + numeroNodoActual + " de " + listaMedicamentos.getNumeroNodos());
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        nodoActual = nodoActual.getSiguiente();
        if(numeroNodoActual == listaMedicamentos.getNumeroNodos()) numeroNodoActual = 1;
        else numeroNodoActual += 1;
        textAreaMedicamentoActual.setText(nodoActual.getMedicina().toString());
        labelNumeroMedicamento.setText("Mostrando medicamento: " + numeroNodoActual + " de " + listaMedicamentos.getNumeroNodos());
    }//GEN-LAST:event_botonSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonNuevoMedicamento;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNumeroMedicamento;
    private javax.swing.JLabel labelTiempoRestante;
    private javax.swing.JTextArea textAreaMedicamentoActual;
    // End of variables declaration//GEN-END:variables
}
