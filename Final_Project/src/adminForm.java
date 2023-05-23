import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


public class adminForm extends javax.swing.JFrame {
    public adminForm() {
        initComponents();
        Connect();
        Fetch();
        theader();
    }
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel model;
    ResultSet rs;

    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/final_project","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tableForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tableForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Fetch()
    {
        try {
            int q;
            pst = con.prepareStatement("SELECT * FROM pwd_tbl");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            model = (DefaultTableModel) tblPWD.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i = 1; i<=q; i++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("fname"));
                    v2.add(rs.getString("lname"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("pwdstate"));
                    v2.add(rs.getString("contactno"));
                }
                model.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tableForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void theader()
    {
        JTableHeader thead = tblPWD.getTableHeader();
        thead.setForeground(Color.BLACK);
        thead.setFont(new Font("Quicksand", Font.BOLD, 14));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPWD = new javax.swing.JTextField();
        txtContactno = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPWD = new javax.swing.JTable();
        btnTrack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 790));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Quicksand", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PWD INFORMATION MANAGEMENT SYSTEM (ADMIN)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(135, 135, 135));
        txtSearch.setText("Search...");
        txtSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 5));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(41, 128, 185));
        btnExit.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(72, 102, 131));

        jPanel4.setBackground(new java.awt.Color(41, 128, 185));

        jLabel2.setFont(new java.awt.Font("Quicksand", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(139, 139, 139))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        txtFname.setBackground(new java.awt.Color(255, 255, 255));
        txtFname.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtFname.setForeground(new java.awt.Color(0, 0, 0));
        txtFname.setText("First Name");
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });

        txtLname.setBackground(new java.awt.Color(255, 255, 255));
        txtLname.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtLname.setForeground(new java.awt.Color(0, 0, 0));
        txtLname.setText("Last Name");
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });

        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        txtAge.setText("Age");
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });

        txtPWD.setBackground(new java.awt.Color(255, 255, 255));
        txtPWD.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtPWD.setForeground(new java.awt.Color(0, 0, 0));
        txtPWD.setText("PWD State");
        txtPWD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPWDFocusLost(evt);
            }
        });

        txtContactno.setBackground(new java.awt.Color(255, 255, 255));
        txtContactno.setFont(new java.awt.Font("Quicksand", 0, 16)); // NOI18N
        txtContactno.setForeground(new java.awt.Color(0, 0, 0));
        txtContactno.setText("+63-XXX-XXX-XXXX");
        txtContactno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactnoFocusLost(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(41, 128, 185));
        btnUpdate.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPWD)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        tblPWD.setBackground(new java.awt.Color(44, 62, 80));
        tblPWD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        tblPWD.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        tblPWD.setForeground(new java.awt.Color(255, 255, 255));
        tblPWD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "PWD State", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPWD.setGridColor(new java.awt.Color(255, 255, 255));
        tblPWD.setPreferredSize(new java.awt.Dimension(795, 562));
        tblPWD.setRowHeight(30);
        tblPWD.setSelectionBackground(new java.awt.Color(41, 128, 185));
        tblPWD.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblPWD.setShowGrid(true);
        tblPWD.setShowHorizontalLines(true);
        tblPWD.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblPWD);
        if (tblPWD.getColumnModel().getColumnCount() > 0) {
            tblPWD.getColumnModel().getColumn(0).setMinWidth(50);
            tblPWD.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblPWD.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPWD.getColumnModel().getColumn(1).setMinWidth(175);
            tblPWD.getColumnModel().getColumn(1).setPreferredWidth(175);
            tblPWD.getColumnModel().getColumn(1).setMaxWidth(175);
            tblPWD.getColumnModel().getColumn(2).setMinWidth(175);
            tblPWD.getColumnModel().getColumn(2).setPreferredWidth(175);
            tblPWD.getColumnModel().getColumn(2).setMaxWidth(175);
            tblPWD.getColumnModel().getColumn(3).setMinWidth(75);
            tblPWD.getColumnModel().getColumn(3).setPreferredWidth(75);
            tblPWD.getColumnModel().getColumn(3).setMaxWidth(75);
            tblPWD.getColumnModel().getColumn(4).setMinWidth(150);
            tblPWD.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblPWD.getColumnModel().getColumn(4).setMaxWidth(150);
            tblPWD.getColumnModel().getColumn(5).setMinWidth(150);
            tblPWD.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblPWD.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        btnTrack.setBackground(new java.awt.Color(41, 128, 185));
        btnTrack.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        btnTrack.setForeground(java.awt.Color.white);
        btnTrack.setText("TRACK");
        btnTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(41, 128, 185));
        btnDelete.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        btnDelete.setForeground(java.awt.Color.white);
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(527, 527, 527))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
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

    private void btnTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPWD.getSelectedRow();

           if (selectedRow >= 0)
           {
                txtFname.setText(tblPWD.getValueAt(selectedRow, 1).toString());
                txtLname.setText(tblPWD.getValueAt(selectedRow, 2).toString());
                txtAge.setText(tblPWD.getValueAt(selectedRow, 3).toString());
                txtPWD.setText(tblPWD.getValueAt(selectedRow, 4).toString());
                txtContactno.setText(tblPWD.getValueAt(selectedRow, 5).toString());
           }
           else
           {
               JOptionPane.showMessageDialog(this, "No Record Found!");
           }
    }//GEN-LAST:event_btnTrackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
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
            int selectedRow = tblPWD.getSelectedRow();
            if (selectedRow >= 0)
            {
                String fname = txtFname.getText();
                String lname = txtLname.getText();
                String age = txtAge.getText();
                String pwdstate = txtPWD.getText();
                String contactno = txtContactno.getText();
                
                tblPWD.setValueAt(fname, selectedRow, 1);
                tblPWD.setValueAt(lname, selectedRow, 2);
                tblPWD.setValueAt(age, selectedRow, 3);
                tblPWD.setValueAt(pwdstate, selectedRow, 4);
                tblPWD.setValueAt(contactno, selectedRow, 5);
                
                try {
                    pst = con.prepareStatement("UPDATE pwd_tbl SET fname=?, lname=?, age=?, pwdstate=?, contactno=? WHERE id=?");
                    
                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, age);
                    pst.setString(4, pwdstate);
                    pst.setString(5, contactno);
                    pst.setInt(6, Integer.parseInt(tblPWD.getValueAt(selectedRow, 0).toString()));
                    pst.executeUpdate();
                
                } catch (SQLException ex) {
                    Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPWD.getSelectedRow();
        
        if (selectedRow >= 0)
        {
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this row?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION)
            {
                try {
                    pst = con.prepareStatement("DELETE FROM pwd_tbl WHERE id = ?");
                    pst.setInt(1, Integer.parseInt(tblPWD.getValueAt(selectedRow, 0).toString()));
                    
                    pst.executeUpdate();
                    
                    DefaultTableModel model = (DefaultTableModel) tblPWD.getModel();
                    model.removeRow(selectedRow);
                } catch (SQLException ex) {
                    Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No Record Found!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // TODO add your handling code here:
        if (txtSearch.getText().equals("Search..."));
        {
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        // TODO add your handling code here:
        if (txtSearch.getText().equals(""));
        {
            txtSearch.setText("Search...");
            txtSearch.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSearchFocusLost

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

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        model = (DefaultTableModel) tblPWD.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblPWD.setRowSorter(trs);
        String searchPattern = "(?i)" + txtSearch.getText();
        trs.setRowFilter(RowFilter.regexFilter(searchPattern));
    }//GEN-LAST:event_txtSearchKeyReleased

    
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
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTrack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPWD;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactno;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPWD;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
