package com.jmk.gui;

import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.service.CustomerAccountService;
import com.jmk.service.CustomerService;
import com.jmk.util.MessageLabel;
import com.jmk.util.StatusMessage;
import com.jmk.util.TransactionType;
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

public class CustomerPaymentForm extends javax.swing.JDialog {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerAccountService customerAccountService;

    private List<Customer> customerList;

    public CustomerPaymentForm() {
        initComponents();
        setSize(JMKHome.getPanelHome().getSize());
        setLocationRelativeTo(JMKHome.getPanelHome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCurrentBalance = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAmmount = new javax.swing.JTextField();
        cmbPaymentType = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cmbCustomerList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Make Payment", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Current Balance");

        txtCurrentBalance.setEditable(false);
        txtCurrentBalance.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCurrentBalance.setForeground(new java.awt.Color(255, 0, 0));
        txtCurrentBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtCurrentBalance.setFocusable(false);
        txtCurrentBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentBalanceActionPerformed(evt);
            }
        });

        txtCustomerName.setEditable(false);
        txtCustomerName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(255, 0, 0));
        txtCustomerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtCustomerName.setFocusable(false);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Customer Name");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Mobile Number");

        txtMobileNumber.setEditable(false);
        txtMobileNumber.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(255, 0, 0));
        txtMobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtMobileNumber.setFocusable(false);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Address");

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 0, 0));
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtAddress.setFocusable(false);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Amount");

        txtAmmount.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtAmmount.setForeground(new java.awt.Color(0, 255, 0));
        txtAmmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        cmbPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEBIT", "CREDIT" }));

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Reset");

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Description");

        txtDescription.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 0, 0));
        txtDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmbCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerListActionPerformed(evt);
            }
        });
        cmbCustomerList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbCustomerListKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbCustomerListKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Select Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddress)
                            .addComponent(txtMobileNumber)
                            .addComponent(txtCustomerName)
                            .addComponent(txtCurrentBalance)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescription)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCustomerList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPaymentType, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 152;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 378, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel9.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 66, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cmbCustomerList.addItem("--Select Customer--");
        new Thread(new Runnable() {
            @Override
            public void run() {
                customerList = customerService.getAllCustomer();
                if (customerList != null) {
                    for (Customer customer : customerList) {
                        cmbCustomerList.addItem(customer.getName().toUpperCase() + "    :   " + customer.getUser().getAddress().toUpperCase());
                    }
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String amountText = txtAmmount.getText();
        if (amountText.trim().length() > 0) {
            try {
                Double amount = Double.parseDouble(amountText);
                if (JOptionPane.showConfirmDialog(rootPane, MessageLabel.MESSAGE_SURE, "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    int index = cmbCustomerList.getSelectedIndex();
                    if (index != -1) {
                        Customer customer = customerList.get(index - 1);
                        long customerId = customer.getCustomerId();
                        CustomerAccount customerAccount = new CustomerAccount();

                        customerAccount.setCustomerId(customerId);
                        customerAccount.setTransactionType(TransactionType.TRANSACTION_TYPE_CASH);
                        customerAccount.setDescription(txtDescription.getText());

                        //Get current balance
                        Double currentBalance = Double.parseDouble(txtCurrentBalance.getText());

                        //check debit or credit
                        int i = cmbPaymentType.getSelectedIndex();
                        if (i == 0) {
                            customerAccount.setDebitAmount(amount);
                            currentBalance = currentBalance - amount;
                        } else {
                            customerAccount.setCreditAmount(amount);
                            currentBalance = currentBalance + amount;
                        }
                        customerAccount.setCurrentBalance(currentBalance);
                        //call dao method to save ammount
                        System.out.println(customerAccount);

                        String message = customerAccountService.payAmount(customerAccount);

                        if (message.equalsIgnoreCase(StatusMessage.STATUS_SUCCESS)) {

                            txtAddress.setText("");
                            txtAmmount.setText("");
                            txtCurrentBalance.setText("");
                            txtCustomerName.setText("");
                            txtDescription.setText("");
                            txtMobileNumber.setText("");
                            cmbCustomerList.requestFocus();
                            cmbPaymentType.setSelectedIndex(0);

                            //updat the current balance in the list
                            customerAccount.setCurrentBalance(currentBalance);
                            customerList.get(index - 1).setCustomerAccount(customerAccount);

                        }
                        JOptionPane.showMessageDialog(rootPane, message);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, MessageLabel.MESSAGE_INVALID_AMOUNT, "Required", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, MessageLabel.MESSAGE_AMOUNT_REQUIRED, "Required", JOptionPane.ERROR_MESSAGE);
        }
        txtAmmount.requestFocus();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerListActionPerformed


    }//GEN-LAST:event_cmbCustomerListActionPerformed

    private void txtCurrentBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentBalanceActionPerformed

    private void cmbCustomerListKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCustomerListKeyTyped

    }//GEN-LAST:event_cmbCustomerListKeyTyped

    private void cmbCustomerListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCustomerListKeyReleased
        System.out.println(evt.getKeyCode());
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            int index = cmbCustomerList.getSelectedIndex();

            if (index > 0) {

                Customer customer = customerList.get(index - 1);
                System.out.println(customer);
                //get currentbalance of selected customer

                CustomerAccount account = customer.getCustomerAccount();
                Double currentBalance = account.getCurrentBalance();

                txtCurrentBalance.setText(String.valueOf(currentBalance));
                txtCustomerName.setText(customer.getName());
                txtAddress.setText(customer.getUser().getAddress());
                txtMobileNumber.setText(customer.getUser().getMobile1());
                txtAmmount.setText("");
                txtAmmount.requestFocus();
            } else {
                String empty = "";
                txtCurrentBalance.setText(empty);
                txtCustomerName.setText(empty);
                txtAddress.setText(empty);
                txtMobileNumber.setText(empty);
                txtAmmount.setText(empty);
            }
        }
    }//GEN-LAST:event_cmbCustomerListKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCustomerList;
    private javax.swing.JComboBox<String> cmbPaymentType;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAmmount;
    private javax.swing.JTextField txtCurrentBalance;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtMobileNumber;
    // End of variables declaration//GEN-END:variables

}
