
import javax.swing.JFrame;
public class rajahasnain extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public rajahasnain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("welcome"); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("     NUST STAY");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("raja.png"))); // NOI18N
        jLabel8.setText("imageLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 478, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTextPane1.setText("HOSTEL UPDATE (MANAGER) : - ALL STUDENTS TO CLEAR THEIR DORMS BY 20TH JUNE 2017 AFTER END OF ESE'S. ANY STUDENT REMAINING THEREAFTER WILL FACE STRICT DISCIPLINARY ACTION.\n- LAUNDRY SERVICES TO BE UNAVAILABLE FROM 6TH-8TH JUNE 2017\n-CHECK-IN AND CHECK-OUT SERVICE HAS BEEN SUSPENDED FOR DURATION OF ESE'S.\n-CURFEW TIMINGS EXTENDED TILL 12.00AM FROM 5TH JUNE ONWARDS.\n-COOLERS NOT ALLOWED IN ANY DORM\n");
        jScrollPane1.setViewportView(jTextPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 919;
        gridBagConstraints.ipady = 439;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel12.setText("NEWSFEED:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(141, 0, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("User Access: Student");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Name: ");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Raja");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Hostel:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Rumi");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("School:");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("SEECS");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Degree:");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setText("Computer Science");

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mess");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Mess Bill");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Mess Menu");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Complains");
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Applications");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Check in/out");
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Room Service");
        jMenu8.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu8MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jMenuItem5)
        {
            Bill b1 = new Bill();
            b1.setVisible(true);
            b1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Menu m1 = new Menu();
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        // TODO add your handling code here:
         if(evt.getSource() == jMenu5)
        {
            Complaint c1 = new Complaint();
            c1.setVisible(true);
            c1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        }
        
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        // TODO add your handling code here:
         Check i1 = new Check();
        i1.setVisible(true);
        i1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        // TODO add your handling code here:
        App a1 = new App();
        a1.setVisible(true);
        a1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jMenu6MenuSelected

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected
        // TODO add your handling code here:
        Room r1 = new Room();
        r1.setVisible(true);
        r1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        
    }//GEN-LAST:event_jMenu8MenuSelected

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rajahasnain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rajahasnain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rajahasnain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rajahasnain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rajahasnain().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}