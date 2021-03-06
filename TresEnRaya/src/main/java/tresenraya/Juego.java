package tresenraya;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro González Navarro
 */
public class Juego extends javax.swing.JFrame {
    private char[][] tablero;
    // Implementación de LógicaJuego
    private LogicaJuego jugar = new LogicaJuego();
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setIconImage(new ImageIcon("logo.png").getImage());
        logo.setIcon(new ImageIcon("logo.png"));
        this.tablero = new char[3][3];
        iniciarJuego();
        clearButtons();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelTablero = new javax.swing.JPanel();
        Boton0_0 = new javax.swing.JButton();
        Boton0_1 = new javax.swing.JButton();
        Boton0_2 = new javax.swing.JButton();
        Boton1_0 = new javax.swing.JButton();
        Boton1_1 = new javax.swing.JButton();
        Boton1_2 = new javax.swing.JButton();
        Boton2_0 = new javax.swing.JButton();
        Boton2_1 = new javax.swing.JButton();
        Boton2_2 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        PanelRecuento = new javax.swing.JPanel();
        LabelPartidas = new javax.swing.JLabel();
        PanelGanadas = new javax.swing.JPanel();
        Xpartidas = new javax.swing.JLabel();
        XpartidasGanadas = new javax.swing.JLabel();
        Opartidas = new javax.swing.JLabel();
        OpartidasGanadas = new javax.swing.JLabel();
        BotonPartidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tres en raya de Ilerna Games");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0, 10, 0, 10, 0};
        getContentPane().setLayout(layout);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 8, 0, 8, 0};
        jPanel2Layout.rowHeights = new int[] {0, 8, 0, 8, 0};
        PanelTablero.setLayout(jPanel2Layout);

        Boton0_0.setBackground(new java.awt.Color(255, 255, 255));
        Boton0_0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton0_0.setText(" ");
        Boton0_0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton0_0.setFocusPainted(false);
        Boton0_0.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton0_0.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton0_0.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0_0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton0_0, gridBagConstraints);

        Boton0_1.setBackground(new java.awt.Color(255, 255, 255));
        Boton0_1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton0_1.setText(" ");
        Boton0_1.setFocusPainted(false);
        Boton0_1.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton0_1.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton0_1.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton0_1, gridBagConstraints);

        Boton0_2.setBackground(new java.awt.Color(255, 255, 255));
        Boton0_2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton0_2.setText(" ");
        Boton0_2.setFocusPainted(false);
        Boton0_2.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton0_2.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton0_2.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton0_2, gridBagConstraints);

        Boton1_0.setBackground(new java.awt.Color(255, 255, 255));
        Boton1_0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton1_0.setText(" ");
        Boton1_0.setFocusPainted(false);
        Boton1_0.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton1_0.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton1_0.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1_0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton1_0, gridBagConstraints);

        Boton1_1.setBackground(new java.awt.Color(255, 255, 255));
        Boton1_1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton1_1.setText(" ");
        Boton1_1.setFocusPainted(false);
        Boton1_1.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton1_1.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton1_1.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton1_1, gridBagConstraints);

        Boton1_2.setBackground(new java.awt.Color(255, 255, 255));
        Boton1_2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton1_2.setText(" ");
        Boton1_2.setFocusPainted(false);
        Boton1_2.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton1_2.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton1_2.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton1_2, gridBagConstraints);

        Boton2_0.setBackground(new java.awt.Color(255, 255, 255));
        Boton2_0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton2_0.setText(" ");
        Boton2_0.setFocusPainted(false);
        Boton2_0.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton2_0.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton2_0.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2_0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton2_0, gridBagConstraints);

        Boton2_1.setBackground(new java.awt.Color(255, 255, 255));
        Boton2_1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton2_1.setText(" ");
        Boton2_1.setFocusPainted(false);
        Boton2_1.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton2_1.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton2_1.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton2_1, gridBagConstraints);

        Boton2_2.setBackground(new java.awt.Color(255, 255, 255));
        Boton2_2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Boton2_2.setText(" ");
        Boton2_2.setFocusPainted(false);
        Boton2_2.setMaximumSize(new java.awt.Dimension(60, 80));
        Boton2_2.setMinimumSize(new java.awt.Dimension(60, 80));
        Boton2_2.setPreferredSize(new java.awt.Dimension(60, 80));
        Boton2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelTablero.add(Boton2_2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        getContentPane().add(PanelTablero, gridBagConstraints);

        logo.setMaximumSize(new java.awt.Dimension(100, 100));
        logo.setMinimumSize(new java.awt.Dimension(100, 100));
        logo.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 13);
        getContentPane().add(logo, gridBagConstraints);

        PanelRecuento.setBackground(new java.awt.Color(73, 185, 205));
        PanelRecuento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.GridBagLayout PanelRecuentoLayout = new java.awt.GridBagLayout();
        PanelRecuentoLayout.columnWidths = new int[] {0};
        PanelRecuentoLayout.rowHeights = new int[] {0, 11, 0, 11, 0};
        PanelRecuento.setLayout(PanelRecuentoLayout);

        LabelPartidas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LabelPartidas.setForeground(new java.awt.Color(255, 255, 255));
        LabelPartidas.setText("Partidas Ganadas");
        LabelPartidas.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        PanelRecuento.add(LabelPartidas, gridBagConstraints);

        PanelGanadas.setBackground(new java.awt.Color(255, 255, 255));
        PanelGanadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Xpartidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Xpartidas.setText("X");

        XpartidasGanadas.setText("0");

        Opartidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Opartidas.setText("O");

        OpartidasGanadas.setText("0");

        javax.swing.GroupLayout PanelGanadasLayout = new javax.swing.GroupLayout(PanelGanadas);
        PanelGanadas.setLayout(PanelGanadasLayout);
        PanelGanadasLayout.setHorizontalGroup(
            PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGanadasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opartidas)
                    .addComponent(Xpartidas))
                .addGap(28, 28, 28)
                .addGroup(PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OpartidasGanadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XpartidasGanadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        PanelGanadasLayout.setVerticalGroup(
            PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGanadasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xpartidas)
                    .addComponent(XpartidasGanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGanadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Opartidas)
                    .addComponent(OpartidasGanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelRecuento.add(PanelGanadas, gridBagConstraints);

        BotonPartidas.setBackground(new java.awt.Color(255, 207, 84));
        BotonPartidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonPartidas.setText("Iniciar partida");
        BotonPartidas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BotonPartidas.setBorderPainted(false);
        BotonPartidas.setFocusPainted(false);
        BotonPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPartidasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(44, 0, 44, 0);
        PanelRecuento.add(BotonPartidas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(PanelRecuento, gridBagConstraints);

        setSize(new java.awt.Dimension(641, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Iniciará una nueva partida
    private void BotonPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPartidasActionPerformed
        jugar.iniciarPartida(PanelTablero,true,tablero);
    }//GEN-LAST:event_BotonPartidasActionPerformed
// Seccion de botones del tablero
    private void Boton1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1_2ActionPerformed
        jugar.tiradaJugador(Boton1_2,1,2,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton1_2ActionPerformed

    private void Boton2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2_0ActionPerformed
        jugar.tiradaJugador(Boton2_0,2,0,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton2_0ActionPerformed

    private void Boton0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0_0ActionPerformed
        jugar.tiradaJugador(Boton0_0,0,0,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton0_0ActionPerformed

    private void Boton0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0_2ActionPerformed
        jugar.tiradaJugador(Boton0_2,0,2,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton0_2ActionPerformed

    private void Boton2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2_2ActionPerformed
        jugar.tiradaJugador(Boton2_2,2,2,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton2_2ActionPerformed

    private void Boton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1_1ActionPerformed
        jugar.tiradaJugador(Boton1_1,1,1,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton1_1ActionPerformed

    private void Boton1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1_0ActionPerformed
        jugar.tiradaJugador(Boton1_0,1,0,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton1_0ActionPerformed

    private void Boton0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0_1ActionPerformed
        jugar.tiradaJugador(Boton0_1,0,1,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton0_1ActionPerformed

    private void Boton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2_1ActionPerformed
        jugar.tiradaJugador(Boton2_1,2,1,tablero,XpartidasGanadas,OpartidasGanadas,PanelTablero);
    }//GEN-LAST:event_Boton2_1ActionPerformed
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    // Inicia el juego
    public void iniciarJuego(){
        jugar.iniciarPartida(PanelTablero,true,tablero);
    }
    // Limpia los botones
    public void clearButtons(){
        jugar.habilitarTrablero(PanelTablero,true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0_0;
    private javax.swing.JButton Boton0_1;
    private javax.swing.JButton Boton0_2;
    private javax.swing.JButton Boton1_0;
    private javax.swing.JButton Boton1_1;
    private javax.swing.JButton Boton1_2;
    private javax.swing.JButton Boton2_0;
    private javax.swing.JButton Boton2_1;
    private javax.swing.JButton Boton2_2;
    private javax.swing.JButton BotonPartidas;
    private javax.swing.JLabel LabelPartidas;
    private javax.swing.JLabel Opartidas;
    private javax.swing.JLabel OpartidasGanadas;
    private javax.swing.JPanel PanelGanadas;
    private javax.swing.JPanel PanelRecuento;
    private javax.swing.JPanel PanelTablero;
    private javax.swing.JLabel Xpartidas;
    private javax.swing.JLabel XpartidasGanadas;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
