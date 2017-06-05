import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.EventQueue;
import java.awt.ImageCapabilities;
import javax.swing.border.MatteBorder;
import java.sql.*;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form java
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int access;
    
   
    public login() {
        super("NUST STAY LOGIN");
        initComponents();
        
    }
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        JTextField jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 680, 400));
        setMinimumSize(new java.awt.Dimension(700, 390));
        setPreferredSize(new java.awt.Dimension(700, 390));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        usernameLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 0, 51));
        usernameLabel.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 0, 0, 0);
        getContentPane().add(usernameLabel, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 0, 51));
        passwordLabel.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(passwordLabel, gridBagConstraints);

        jTextField1.setText("Enter username");
        jTextField1.setToolTipText("Enter your username credentials here");
        jTextField1.setName("usernameField"); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 0, 0);
        getContentPane().add(jTextField1, gridBagConstraints);
        
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setToolTipText("Enter Password credentials here");
        jPasswordField1.setName("passwordField"); // NOI18N
        jPasswordField1.setPreferredSize(new java.awt.Dimension(101, 28));
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jPasswordField1, gridBagConstraints);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jRadioButton1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 420, 0, 0);
        getContentPane().add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("Manager");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 30, 0, 0);
        getContentPane().add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton3.setText("Warden");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 20, 0, 0);
        getContentPane().add(jRadioButton3, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("r1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = -470;
        gridBagConstraints.ipady = -114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 370, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 1110;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = 1110;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 0, 0);
        getContentPane().add(jSeparator2, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("r2.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.ipadx = -950;
        gridBagConstraints.ipady = -464;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    @SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource() == jButton1)
        {
            if(access == 1 || jRadioButton1.isSelected())
            {
            	Connection conn;
            	PreparedStatement pst;           	
            	try {
            		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuststay", "root", ""); 
            		//pst = conn.prepareStatement("select * from student where username = ? and password = ?");
            		pst = conn.prepareStatement("SELECT 'username', 'password' FROM 'student' WHERE 'username' = ? AND 'password' = ?");
            		pst.setString(1,  jTextField1.getText());
            		pst.setString(2,  String.valueOf(jPasswordField1.getPassword()));
            		ResultSet result = pst.executeQuery();
            		if(result.next()){
            			System.out.println("done");
            			//JOptionPane.showMessageDialog(null, "Welcome"); 			
            			//this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"Welcome NUSTian!");
                        Student s1 = new Student();
                        s1.setVisible(true);
            		}
            		else{
            			
            			JOptionPane.showMessageDialog(null, "Error!");
            		}
            	}
            	catch (Exception ex){
            		
            	}
            	/*
              conn = MySqlConnect.ConnectDB();
              String sql = "select * from student where username = ? and password = ?";
                try
                {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,jTextField1.getText());
                    pst.setString(2,jTextField2.getText());
                    rs = pst.executeQuery();
                    if(rs.next())
                    {
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"Welcome NUSTian!");
                        Student s1 = new Student();
                        s1.setVisible(true);
                      
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Error!, Invalid Password","Access denied!",JOptionPane.ERROR_MESSAGE);
                    }
                }
                     
                
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }*/
            }
            
            else if(jRadioButton2.isSelected())
            {
                Manager m1 = new Manager();
                m1.setVisible(true);
                m1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            }
            else{
            	Warden w1 = new Warden();
                w1.setVisible(true);
                w1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);

            access = 1;
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);

            access = 2;
        }
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton3.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);


            access = 3;
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
          jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setText("");
        
    }//GEN-LAST:event_jPasswordField1MouseClicked
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;
}
