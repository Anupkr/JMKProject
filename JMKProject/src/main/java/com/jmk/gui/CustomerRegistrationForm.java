/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.gui;

import com.jmk.MainClass;
import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.Granter;
import com.jmk.beans.User;
import com.jmk.gui.util.GUIUtils;
import com.jmk.service.CustomerService;
import com.jmk.service.GranterService;
import com.jmk.util.StatusMessage;
import com.jmk.util.TransactionType;
import com.jmk.util.UserRole;
import com.jmk.util.UserStatus;
import com.sun.prism.paint.Gradient;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author mulayam
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerRegistrationForm extends javax.swing.JDialog {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private GranterService granterService;

    private List<Granter> granterList;

    public CustomerRegistrationForm() {

        initComponents();
        setSize(GUIHome.getPanelHome().getSize());
        setLocationRelativeTo(GUIHome.getPanelHome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobile1 = new javax.swing.JTextField();
        txtMobile2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        cmbIdType = new javax.swing.JComboBox<>();
        cmbAmountType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtGranterAddress = new javax.swing.JTextField();
        txtGranterMobile = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbGranter = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Registration");
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 57));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(228, 228, 228), 1, true), "Customer Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Customer Name");

        txtCustomerName.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Mobile No.1");

        txtMobile1.setToolTipText("");

        txtMobile2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Mobile No.2");

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Address");

        txtAddress.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("ID Number");

        txtIdNumber.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("ID Type");

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Previous Ammount");

        txtAmount.setToolTipText("");

        cmbIdType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADHAR", "DL", "PAN" }));
        cmbIdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdTypeActionPerformed(evt);
            }
        });

        cmbAmountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DUE", "PAID" }));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/005-reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/006-error.png"))); // NOI18N
        btnReset1.setText("Close");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbAmountType, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCustomerName)
                        .addComponent(txtMobile1)
                        .addComponent(txtMobile2)
                        .addComponent(txtAddress)
                        .addComponent(cmbIdType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdNumber))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIdType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(cmbAmountType, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 12, 0);
        getContentPane().add(jPanel4, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(212, 2, 2));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Create Customer Account");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 486;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true), "Granter Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Address");

        txtGranterAddress.setEditable(false);
        txtGranterAddress.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtGranterAddress.setForeground(new java.awt.Color(255, 0, 0));
        txtGranterAddress.setFocusable(false);
        txtGranterAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGranterAddressActionPerformed(evt);
            }
        });

        txtGranterMobile.setEditable(false);
        txtGranterMobile.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtGranterMobile.setForeground(new java.awt.Color(255, 0, 0));
        txtGranterMobile.setFocusable(false);

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Mobile");

        cmbGranter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGranterItemStateChanged(evt);
            }
        });
        cmbGranter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGranterActionPerformed(evt);
            }
        });
        cmbGranter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbGranterKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbGranterKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Granter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel15)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtGranterMobile, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGranterAddress, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbGranter, 0, 265, Short.MAX_VALUE))
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbGranter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGranterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGranterMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(232, 232, 232)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String customerName = txtCustomerName.getText();
        String password = txtMobile1.getText();
        String mobile1 = txtMobile1.getText();
        String mobile2 = txtMobile2.getText();
        String address = txtAddress.getText();
        String idNumber = txtIdNumber.getText();
        String idType = cmbIdType.getSelectedItem().toString();
        String paymentType = cmbAmountType.getSelectedItem().toString();
        double amount = Double.parseDouble(txtAmount.getText().toString());

        if (txtCustomerName.getText().length() < 2) {
            JOptionPane.showMessageDialog(rootPane, "Valid Customer Name Requreid");
            txtCustomerName.requestFocus();
            return;
        }
        User user = new User();
        user.setAddress(address);
        user.setMobile1(mobile1);
        user.setMobile2(mobile2);
        user.setPassword(password);

        user.setStatus(UserStatus.USER_STATUS_ACTIVE);
        user.setUserName(mobile1);
        user.setUserRole(UserRole.USER_CUSTOMER);

        Customer customer = new Customer();

        //get selected granter
        int index = cmbGranter.getSelectedIndex();
        Granter granter = new Granter();

        if (index != -1) {
            granter = granterList.get(index);
        } else {
            granter.setGranterId(1L);
        }
        customer.setName(customerName);
        customer.setIdNumber(idNumber);
        customer.setIdType(idType);

        CustomerAccount customerAccount = new CustomerAccount();
        if (paymentType.equalsIgnoreCase("DUE")) {
            customerAccount.setCreditAmount(amount);
            customerAccount.setTransactionType(TransactionType.TRANSACTION_TYPE_PURCHASE);
        } else {
            customerAccount.setDebitAmount(amount);
            customerAccount.setTransactionType(TransactionType.TRANSACTION_TYPE_CASH);
        }

        customer.setCustomerAccount(customerAccount);
        customer.setUser(user);
        customer.setGranter(granter);

        String message = customerService.createCustomer(customer);
        if (message.equalsIgnoreCase(StatusMessage.STATUS_SUCCESS)) {
            GUIUtils.showSuccessMessage(rootPane, "New Customer Account Successfully Created");
            reset();
        } else {
            GUIUtils.showErrorMessage(rootPane, message);

        }
    }//GEN-LAST:event_btnSaveActionPerformed


    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void cmbIdTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdTypeActionPerformed

    private void txtGranterAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGranterAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGranterAddressActionPerformed

    private void cmbGranterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGranterActionPerformed


    }//GEN-LAST:event_cmbGranterActionPerformed

    private void cmbGranterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGranterKeyTyped

    }//GEN-LAST:event_cmbGranterKeyTyped

    private void cmbGranterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGranterKeyReleased


    }//GEN-LAST:event_cmbGranterKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        granterList = granterService.getAllGranter();
        if (granterList != null && granterList.size() > 0) {

            for (Granter granter : granterList) {
                cmbGranter.addItem(granter.getName());
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void cmbGranterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGranterItemStateChanged
        // TODO add your handling code here:
        int index = cmbGranter.getSelectedIndex();
        if (index >= 0) {

            Granter granter = granterList.get(index);

            txtGranterAddress.setText(granter.getUser().getAddress());
            txtGranterMobile.setText(granter.getUser().getMobile1());
        }
    }//GEN-LAST:event_cmbGranterItemStateChanged

    private void reset() {

        String empty = "";

        txtAddress.setText(empty);
        txtAmount.setText(empty);
        txtCustomerName.setText(empty);
        txtIdNumber.setText(empty);
        txtMobile1.setText(empty);
        txtMobile2.setText(empty);

        cmbAmountType.setSelectedIndex(0);
        
        cmbGranter.setSelectedIndex(0);
        cmbIdType.setSelectedItem(0);

        txtCustomerName.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbAmountType;
    private javax.swing.JComboBox<String> cmbGranter;
    private javax.swing.JComboBox<String> cmbIdType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtGranterAddress;
    private javax.swing.JTextField txtGranterMobile;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtMobile1;
    private javax.swing.JTextField txtMobile2;
    // End of variables declaration//GEN-END:variables
}
