/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.gui;

import com.jmk.beans.Customer;
import com.jmk.beans.Granter;
import com.jmk.beans.User;
import com.jmk.gui.util.GUIUtils;
import com.jmk.service.CustomerService;
import com.jmk.service.GranterService;
import com.jmk.util.StatusMessage;
import com.jmk.util.UserRole;
import com.jmk.util.UserStatus;
import java.util.List;
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
public class EditCustomerForm extends javax.swing.JDialog {

    @Autowired
    private CustomerService customerService;
    private List<Granter> granterList;

    @Autowired
    private GranterService granterService;

    private Customer customer;

    public EditCustomerForm() {

        initComponents();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
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
        cmbIdType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmbGranter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        cmbIdType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADHAR", "DL", "PAN" }));
        cmbIdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdTypeActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_red.png"))); // NOI18N
        btnReset1.setText("Close");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Granter");

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

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Customer Details");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(cmbGranter, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCustomerName)
                                .addComponent(txtMobile1)
                                .addComponent(txtMobile2)
                                .addComponent(txtAddress)
                                .addComponent(cmbIdType, 0, 318, Short.MAX_VALUE)
                                .addComponent(txtIdNumber))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cmbGranter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String customerName = txtCustomerName.getText();
        if (customerName.trim().length() < 2) {
            GUIUtils.showErrorMessage(rootPane, "Please enter customer name");
            return;
        }
        String password = txtMobile1.getText();
        String mobile1 = txtMobile1.getText();
        String mobile2 = txtMobile2.getText();
        String address = txtAddress.getText();
        String idNumber = txtIdNumber.getText();
        String idType = cmbIdType.getSelectedItem().toString();

        //get existing user and edit value
        User user = customer.getUser();
        user.setAddress(address);
        user.setMobile1(mobile1);
        user.setMobile2(mobile2);
        user.setPassword(password);

        user.setStatus(UserStatus.USER_STATUS_ACTIVE);
        user.setUserName(mobile1);
        user.setUserRole(UserRole.USER_CUSTOMER);

        customer.setName(customerName);
        customer.setIdNumber(idNumber);
        customer.setIdType(idType);

        //get granter info
        int index = cmbGranter.getSelectedIndex();
        Granter granter = new Granter();

        if (index != -1) {
            granter = granterList.get(index);
        } else {
            granter.setGranterId(1L);
        }

        //replace user and granter with new value object
        customer.setUser(user);
        customer.setGranter(granter);

        String message = customerService.updateCustomer(customer);
        if (message.equalsIgnoreCase(StatusMessage.STATUS_SUCCESS)) {
            GUIUtils.showSuccessMessage(rootPane, "Customer Record Successfully Updated");
            dispose();
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

    private void cmbGranterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGranterItemStateChanged
        // TODO add your handling code here:
        int index = cmbGranter.getSelectedIndex();
        if (index >= 0) {
            Granter granter = granterList.get(index);
        }
    }//GEN-LAST:event_cmbGranterItemStateChanged

    private void cmbGranterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGranterActionPerformed

    }//GEN-LAST:event_cmbGranterActionPerformed

    private void cmbGranterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGranterKeyTyped

    }//GEN-LAST:event_cmbGranterKeyTyped

    private void cmbGranterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGranterKeyReleased

    }//GEN-LAST:event_cmbGranterKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            granterList = granterService.getAllGranter();
            if (granterList != null && granterList.size() > 0) {

                for (Granter granter : granterList) {
                    cmbGranter.addItem(granter.getName());
                }
                User user = customer.getUser();

                txtAddress.setText(user.getAddress());
                txtCustomerName.setText(customer.getName());
                txtIdNumber.setText(customer.getIdNumber());
                txtMobile1.setText(user.getMobile1());
                txtMobile2.setText(user.getMobile2());
                cmbIdType.setSelectedItem(customer.getIdType());

                Granter granter = new Granter();
                granter.setGranterId(customer.getGranter().getGranterId());

                int index = granterList.indexOf(granter);
                cmbGranter.setSelectedIndex(index);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbGranter;
    private javax.swing.JComboBox<String> cmbIdType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtMobile1;
    private javax.swing.JTextField txtMobile2;
    // End of variables declaration//GEN-END:variables
}
