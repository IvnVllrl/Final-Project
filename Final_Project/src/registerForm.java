import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class registerForm extends javax.swing.JFrame {

    public registerForm() {
        initComponents();
        Connect();
    }

    Connection con;
    PreparedStatement pst;
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/final_project","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContactno = new javax.swing.JTextField();
        txtPWD = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER FORM");

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Quicksand", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtFname.setBackground(new java.awt.Color(255, 255, 255));
        txtFname.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 0));
        txtFname.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 7, 4, 4));
        txtFname.setCaretColor(new java.awt.Color(44, 62, 80));
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });

        txtLname.setBackground(new java.awt.Color(255, 255, 255));
        txtLname.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(135, 135, 135));
        txtLname.setText("Last Name");
        txtLname.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 7, 4, 4));
        txtLname.setCaretColor(new java.awt.Color(44, 62, 80));
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });

        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(135, 135, 135));
        txtAge.setText("Age");
        txtAge.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 7, 4, 4));
        txtAge.setCaretColor(new java.awt.Color(44, 62, 80));
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });

        txtContactno.setBackground(new java.awt.Color(255, 255, 255));
        txtContactno.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txtContactno.setForeground(new java.awt.Color(135, 135, 135));
        txtContactno.setText("+63-XXX-XXX-XXXX");
        txtContactno.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 7, 4, 4));
        txtContactno.setCaretColor(new java.awt.Color(44, 62, 80));
        txtContactno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactnoFocusLost(evt);
            }
        });

        txtPWD.setBackground(new java.awt.Color(255, 255, 255));
        txtPWD.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        txtPWD.setForeground(new java.awt.Color(135, 135, 135));
        txtPWD.setText("PWD State");
        txtPWD.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 7, 4, 4));
        txtPWD.setCaretColor(new java.awt.Color(44, 62, 80));
        txtPWD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWDFocusLost(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(41, 128, 185));
        btnSignup.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("SIGNUP");
        btnSignup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(41, 128, 185));
        btnExit.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPWD))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        new tableForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        if (txtFname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input your First Name!");
        }
        else if (txtLname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input your Last Name!");
        }
        else if (txtAge.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input your Age!");
        }
        else if (txtPWD.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input your PWD State!");
        }
        else if (txtContactno.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input your Contact No!");
        }
        else
        {        
            try {
                // TODO add your handling code here:
                String fname = txtFname.getText();
                String lname = txtLname.getText();
                String age = txtAge.getText();
                String pwdstate = txtPWD.getText();
                String contactno = txtContactno.getText();
                
                pst = con.prepareStatement("INSERT INTO pwd_tbl (fname, lname, age, pwdstate, contactno) VALUES (?, ?, ?, ?, ?)");
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, age);
                pst.setString(4, pwdstate);
                pst.setString(5, contactno);

                int k = pst.executeUpdate();

                if (k==1)
                {
                    JOptionPane.showMessageDialog(this, "Record has been resistered successfully!");
                    new tableForm().setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Record failed to resgister!");
                }            
            } catch (SQLException ex) {
                Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        // TODO add your handling code here:
        if (txtFname.getText().equals("First Name"))
        {
            txtFname.setText("");
            txtFname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFnameFocusGained

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost
        // TODO add your handling code here:
        if (txtFname.getText().equals(""))
        {
            //txtFname.setText("First Name");
            txtFname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFnameFocusLost

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        // TODO add your handling code here:
        if (txtLname.getText().equals("Last Name"))
        {
            txtLname.setText("");
            txtLname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusLost
        // TODO add your handling code here:
        if (txtLname.getText().equals(""))
        {
            txtLname.setText("Last Name");
            txtLname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtLnameFocusLost

    private void txtAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusGained
        // TODO add your handling code here:
        if (txtAge.getText().equals("Age"))
        {
            txtAge.setText("");
            txtAge.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAgeFocusGained

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        // TODO add your handling code here:
        if (txtAge.getText().equals(""))
        {
            txtAge.setText("Age");
            txtAge.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtPWDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWDFocusGained
        // TODO add your handling code here:
        if (txtPWD.getText().equals("PWD State"))
        {
            txtPWD.setText("");
            txtPWD.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPWDFocusGained

    private void txtPWDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWDFocusLost
        // TODO add your handling code here:
        if (txtPWD.getText().equals(""))
        {
            txtPWD.setText("PWD State");
            txtPWD.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPWDFocusLost

    private void txtContactnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactnoFocusGained
        // TODO add your handling code here:
        if (txtContactno.getText().equals("+63-XXX-XXX-XXXX"))
        {
            txtContactno.setText("");
            txtContactno.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtContactnoFocusGained

    private void txtContactnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactnoFocusLost
        // TODO add your handling code here:
        if (txtContactno.getText().equals(""))
        {
            txtContactno.setText("+63-XXX-XXX-XXXX");
            txtContactno.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtContactnoFocusLost
    
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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactno;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPWD;
    // End of variables declaration//GEN-END:variables
}
