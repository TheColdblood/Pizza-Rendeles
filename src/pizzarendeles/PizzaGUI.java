/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzarendeles;

import javax.swing.JOptionPane;

/**
 *
 * @author SimonGergő(SZOFT_202
 */
public class PizzaGUI extends javax.swing.JFrame {

    /**
     * Creates new form PizzaGUI
     */
    public PizzaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngMeret = new javax.swing.ButtonGroup();
        pnlRendeles = new javax.swing.JPanel();
        txtfTel = new javax.swing.JTextField();
        txtfCim = new javax.swing.JTextField();
        lblNev = new javax.swing.JLabel();
        txtfNev = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        lblCim = new javax.swing.JLabel();
        lblDarab = new javax.swing.JLabel();
        spnrDarab = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMeret = new javax.swing.JPanel();
        rbtnKozepes = new javax.swing.JRadioButton();
        rbtnNagy = new javax.swing.JRadioButton();
        rbtnKicsi = new javax.swing.JRadioButton();
        pnlFeltet = new javax.swing.JPanel();
        cbxPepperoni = new javax.swing.JCheckBox();
        cbxKolbasz = new javax.swing.JCheckBox();
        cbxSonka = new javax.swing.JCheckBox();
        cbxHagyma = new javax.swing.JCheckBox();
        cbxOlajbogyo = new javax.swing.JCheckBox();
        cbxESajt = new javax.swing.JCheckBox();
        cbxGomba = new javax.swing.JCheckBox();
        cbxSzalami = new javax.swing.JCheckBox();
        pnlMegjegyzes = new javax.swing.JPanel();
        spnlMegjegyzes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlFejlec = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRendeles = new javax.swing.JButton();
        btnMegszakitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peppino's Pizzeria");
        setResizable(false);

        pnlRendeles.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rendelés"));

        lblNev.setText("Név:");

        lblTel.setText("Tel.:");

        lblCim.setText("Cím:");

        lblDarab.setText("Darab:");

        jLabel1.setText("Tesztverzió");
        jLabel1.setToolTipText("");

        jLabel2.setText("Figyelmeztetés");

        javax.swing.GroupLayout pnlRendelesLayout = new javax.swing.GroupLayout(pnlRendeles);
        pnlRendeles.setLayout(pnlRendelesLayout);
        pnlRendelesLayout.setHorizontalGroup(
            pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRendelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRendelesLayout.createSequentialGroup()
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfTel))
                    .addGroup(pnlRendelesLayout.createSequentialGroup()
                        .addComponent(lblNev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfNev, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRendelesLayout.createSequentialGroup()
                        .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCim)
                            .addComponent(lblDarab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRendelesLayout.createSequentialGroup()
                                .addComponent(txtfCim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRendelesLayout.createSequentialGroup()
                                .addComponent(spnrDarab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRendelesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCim, lblDarab, lblNev, lblTel});

        pnlRendelesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtfCim, txtfNev, txtfTel});

        pnlRendelesLayout.setVerticalGroup(
            pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRendelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfCim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRendelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDarab)
                    .addComponent(spnrDarab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pnlRendelesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtfCim, txtfNev, txtfTel});

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Méret"));

        btngMeret.add(rbtnKozepes);
        rbtnKozepes.setSelected(true);
        rbtnKozepes.setText("Közepes (25cm)");
        rbtnKozepes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btngMeret.add(rbtnNagy);
        rbtnNagy.setText("Nagy  (32cm)");
        rbtnNagy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btngMeret.add(rbtnKicsi);
        rbtnKicsi.setText("Kicsi (17cm)");
        rbtnKicsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNagy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnKozepes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnKicsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnKicsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnKozepes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnNagy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pnlFeltet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Feltétek"));

        cbxPepperoni.setText("Pepperoni");

        cbxKolbasz.setText("Kolbász");

        cbxSonka.setText("Sonka");

        cbxHagyma.setText("Hagyma");

        cbxOlajbogyo.setText("Olajbogyó");

        cbxESajt.setText("Extra sajt");

        cbxGomba.setText("Gomba");

        cbxSzalami.setText("Szalámi");

        javax.swing.GroupLayout pnlFeltetLayout = new javax.swing.GroupLayout(pnlFeltet);
        pnlFeltet.setLayout(pnlFeltetLayout);
        pnlFeltetLayout.setHorizontalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxESajt)
                    .addComponent(cbxGomba)
                    .addComponent(cbxOlajbogyo)
                    .addComponent(cbxHagyma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPepperoni)
                    .addComponent(cbxSzalami)
                    .addComponent(cbxKolbasz)
                    .addComponent(cbxSonka))
                .addContainerGap())
        );

        pnlFeltetLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxESajt, cbxGomba, cbxHagyma, cbxKolbasz, cbxOlajbogyo, cbxPepperoni, cbxSonka, cbxSzalami});

        pnlFeltetLayout.setVerticalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(cbxPepperoni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSzalami)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxKolbasz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSonka))
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(cbxESajt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxGomba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxOlajbogyo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxHagyma)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlMegjegyzes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Megjegyzés"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        spnlMegjegyzes.setViewportView(jTextArea1);

        javax.swing.GroupLayout pnlMegjegyzesLayout = new javax.swing.GroupLayout(pnlMegjegyzes);
        pnlMegjegyzes.setLayout(pnlMegjegyzesLayout);
        pnlMegjegyzesLayout.setHorizontalGroup(
            pnlMegjegyzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMegjegyzesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlMegjegyzes)
                .addContainerGap())
        );
        pnlMegjegyzesLayout.setVerticalGroup(
            pnlMegjegyzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMegjegyzesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlMegjegyzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlFejlec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlFejlec.setName(""); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzarendeles/st,small,507x507-pad,600x600,f8f8f8.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFejlecLayout = new javax.swing.GroupLayout(pnlFejlec);
        pnlFejlec.setLayout(pnlFejlecLayout);
        pnlFejlecLayout.setHorizontalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFejlecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFejlecLayout.setVerticalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFejlecLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnRendeles.setBackground(new java.awt.Color(0, 204, 51));
        btnRendeles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRendeles.setText("Rendelés");
        btnRendeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelesActionPerformed(evt);
            }
        });

        btnMegszakitas.setBackground(new java.awt.Color(255, 0, 0));
        btnMegszakitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMegszakitas.setText("Mégse");
        btnMegszakitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMegszakitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegszakitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlFejlec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMegszakitas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlMegjegyzes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlFejlec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRendeles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMegjegyzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMegszakitas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMegszakitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegszakitasActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMegszakitasActionPerformed

    private void btnRendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelesActionPerformed
       // boolean vanDarabValasztva = spnrDarab.getSelectedIndex() > 0;
        String uzenet;
       // if(vanDarabValasztva){
            uzenet = "Rendelés elküldve!";
       // }else{
       //     uzenet = "Nem adható le a rendelés!";
       // }
        JOptionPane.showMessageDialog(null, uzenet, "MEGRENDELVE", 1);
    }//GEN-LAST:event_btnRendelesActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegszakitas;
    private javax.swing.JButton btnRendeles;
    private javax.swing.ButtonGroup btngMeret;
    private javax.swing.JCheckBox cbxESajt;
    private javax.swing.JCheckBox cbxGomba;
    private javax.swing.JCheckBox cbxHagyma;
    private javax.swing.JCheckBox cbxKolbasz;
    private javax.swing.JCheckBox cbxOlajbogyo;
    private javax.swing.JCheckBox cbxPepperoni;
    private javax.swing.JCheckBox cbxSonka;
    private javax.swing.JCheckBox cbxSzalami;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblDarab;
    private javax.swing.JLabel lblNev;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pnlFejlec;
    private javax.swing.JPanel pnlFeltet;
    private javax.swing.JPanel pnlMegjegyzes;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JPanel pnlRendeles;
    private javax.swing.JRadioButton rbtnKicsi;
    private javax.swing.JRadioButton rbtnKozepes;
    private javax.swing.JRadioButton rbtnNagy;
    private javax.swing.JScrollPane spnlMegjegyzes;
    private javax.swing.JSpinner spnrDarab;
    private javax.swing.JTextField txtfCim;
    private javax.swing.JTextField txtfNev;
    private javax.swing.JTextField txtfTel;
    // End of variables declaration//GEN-END:variables
}
