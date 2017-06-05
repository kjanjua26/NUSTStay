import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class sysLog extends javax.swing.JFrame {
    public sysLog() {
        initComponents();
    }
    int access;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.JLabel Username = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Username.setText("Username");

        jLabel2.setText("Password");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setToolTipText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("                   Welcome to NUSTStay");

        jLabel3.setText("                                A Home Away From Home!");

        jButton1.setText("LogIn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Manager");

        jRadioButton3.setText("Warden");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add yodur handling code here:
        //This is for userName.
    }                                           

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        //This is for password. 
    }                                               

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	Connection conn;
    	PreparedStatement pst;           	
    	   if(evt.getSource() == jButton1)
           {
               if(access == 1 || jRadioButton1.isSelected())
               {
    	try {
    		String person = "haris";
    		String pass = "yolo";
    		String entry1 = jTextField1.getText();
    		String entry2 = String.valueOf(jPasswordField1.getPassword());
    		if(person.equals(entry1) && pass.equals(entry2)){
                JOptionPane.showMessageDialog(null,"Welcome NUSTian!");
                Student s1 = new Student();
                s1.setVisible(true);
    		}
    		else if(entry1.equals("raja") && entry2.equals("yolo")){
    			  JOptionPane.showMessageDialog(null,"Welcome NUSTian!");
                  rajahasnain raja = new rajahasnain();
                  raja.setVisible(true);
    		}
    		else if(entry1.equals("kamran") && entry2.equals("yolo")){
    			JOptionPane.showMessageDialog(null,"Welcome NUSTian!");
                kamranjanjua janjua = new kamranjanjua();
                janjua.setVisible(true);
    		}
    		else{
    			
    			JOptionPane.showMessageDialog(null, "Error!");
    		}
    	}
    	catch (Exception ex){
    		
    	}
               }
    	else if(jRadioButton2.isSelected())
        {
    		String entry1 = jTextField1.getText();
    		String entry2 = String.valueOf(jPasswordField1.getPassword());
    		if(entry1.equals("usman") && entry2.equals("yolo")){
	            Manager m1 = new Manager();
	            m1.setVisible(true);
	            m1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    		}
    		else{
    			JOptionPane.showMessageDialog(null, "Only Manager Can Log In.");
    		}

        }
        else{
        	String entry1 = jTextField1.getText();
    		String entry2 = String.valueOf(jPasswordField1.getPassword());
    		if(entry1.equals("alihassan") && entry2.equals("yolo")){
	        	Warden w1 = new Warden();
	            w1.setVisible(true);
	            w1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    	}
    		else{
    			JOptionPane.showMessageDialog(null, "Only Warden Can Log In.");
    		}
        }

               }
	}
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	 if(jRadioButton1.isSelected())
         {
             jRadioButton2.setSelected(false);
             jRadioButton3.setSelected(false);

             access = 1;
         }
    	// TODO add your handling code here:
    }         
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	  if(jRadioButton2.isSelected())
          {
              jRadioButton1.setSelected(false);
              jRadioButton3.setSelected(false);

              access = 2;
          }
    }   

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	 if(jRadioButton3.isSelected())
         {
             jRadioButton1.setSelected(false);
             jRadioButton2.setSelected(false);


             access = 3;
         }
    }                                             
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sysLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sysLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sysLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sysLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sysLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;              
}
