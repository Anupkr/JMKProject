package com.jmk.gui;

import com.jmk.beans.ContainerAccount;
import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.DueContainer;
import com.jmk.service.ContainerAccountService;
import com.jmk.service.CustomerAccountService;
import com.jmk.service.CustomerService;
import com.jmk.util.StatusMessage;
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
public class PayContainerForm extends javax.swing.JDialog {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerAccountService customerAccountService;
    @Autowired
    private ContainerAccountService containerAccountService;

    private List<Customer> customerList;
    private List<DueContainer> dueContainerList;

    public PayContainerForm() {
        initComponents();
         setSize(JMKHome.getPanelHome().getSize());
        setLocationRelativeTo(JMKHome.getPanelHome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDueQty = new javax.swing.JTextField();
        cmbCustomerList = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Create New Item", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Pay Qty");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Select Container");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Customer Name");

        txtCustomerName.setEditable(false);
        txtCustomerName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(255, 0, 0));
        txtCustomerName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        txtCustomerName.setFocusable(false);

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

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Due Qty");

        txtDueQty.setEditable(false);
        txtDueQty.setFocusable(false);

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

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueQty, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDueQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 325, 90, 28);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerListActionPerformed

    }//GEN-LAST:event_cmbCustomerListActionPerformed

    private void cmbCustomerListKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCustomerListKeyTyped

    }//GEN-LAST:event_cmbCustomerListKeyTyped

    private void cmbCustomerListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCustomerListKeyReleased
        System.out.println(evt.getKeyCode());
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            int index = cmbCustomerList.getSelectedIndex();

            if (index > 0) {

                Customer customer = customerList.get(index - 1);
                System.out.println(customer);
                //get Dus container List

                jComboBox1.removeAllItems();
                jComboBox1.addItem("--Select Container--");
                dueContainerList = containerAccountService.getDuesContainer(customer.getCustomerId());

                if (dueContainerList != null) {
                    for (DueContainer due : dueContainerList) {
                        jComboBox1.addItem(due.getContainerName() + "@Rs." + due.getSecMoney());
                    }
                }

                txtCustomerName.setText(customer.getName());
                txtAddress.setText(customer.getUser().getAddress());
                txtMobileNumber.setText(customer.getUser().getMobile1());

            } else {
                String empty = "";
                txtCustomerName.setText(empty);
                txtAddress.setText(empty);
                txtMobileNumber.setText(empty);
                jComboBox1.removeAllItems();
            }
        }
    }//GEN-LAST:event_cmbCustomerListKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int index = cmbCustomerList.getSelectedIndex();
        if (index > 0) {
            try {

                int debitQty = Integer.parseInt(txtQty.getText());
                Customer customer = customerList.get(index - 1);
                int contIndex = jComboBox1.getSelectedIndex();
                System.out.println(dueContainerList);
                if (contIndex > 0) {

                    DueContainer due = dueContainerList.get(contIndex - 1);

                    System.out.println(due);

                    //calculate new current Balance to update in customerAccount table
                    double currentBalance = customer.getCustomerAccount().getCurrentBalance() - (due.getSecMoney() * debitQty);

                    long containerId = due.getContainer_id();

                    //Prepare customerAccount object to save cotainer payment information in "container_account"
                    ContainerAccount containerAccount = new ContainerAccount();

                    containerAccount.setContainerId(containerId);
                    containerAccount.setCustomerId(customer.getCustomerId());
                    containerAccount.setDebit(debitQty);
                    containerAccount.setSecurityMoneyPerQty(due.getSecMoney());

                    System.out.println("Container Account:" + containerAccount);

                    CustomerAccount customerAccount = new CustomerAccount();
                    customerAccount.setCustomerId(customer.getCustomerId());
                    customerAccount.setCurrentBalance(currentBalance);
                    customerAccount.setTransactionType(due.getContainerName());
                    customerAccount.setDebitAmount((due.getSecMoney() * debitQty));

                    System.out.println("CustomerAccount:" + customerAccount);
                    String message = containerAccountService.payContainer(customerAccount, containerAccount);
                    if (StatusMessage.STATUS_SUCCESS.equalsIgnoreCase(message)) {

                        //update currentBalance of customer into customerList
                        customerList.get(index - 1).getCustomerAccount().setCurrentBalance(currentBalance);
                        JOptionPane.showMessageDialog(rootPane, "Successfully Saved");

                        String empty = "";
                        txtCustomerName.setText(empty);
                        txtAddress.setText(empty);
                        txtMobileNumber.setText(empty);
                        txtDueQty.setText(empty);
                        txtQty.setText(empty);
                        jComboBox1.removeAllItems();
                        cmbCustomerList.setSelectedIndex(0);
                        cmbCustomerList.requestFocus();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, message, "Failed", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please select container");

                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "Please enter valid quantity");
                txtQty.requestFocus();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select customer");
            txtQty.requestFocus();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int index = jComboBox1.getSelectedIndex();
        if (index > 0) {
            DueContainer due = dueContainerList.get(index - 1);
            txtDueQty.setText(String.valueOf((due.getCredit() - due.getDebit())));
        } else {
            txtDueQty.setText("");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCustomerList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDueQty;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
