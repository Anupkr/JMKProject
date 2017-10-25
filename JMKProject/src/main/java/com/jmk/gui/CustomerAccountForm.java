package com.jmk.gui;

import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.service.CustomerAccountService;
import com.jmk.util.PrintDialogUtil;
import com.jmk.util.TransactionType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
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
public class CustomerAccountForm extends javax.swing.JDialog {

    @Autowired

    private CustomerAccountService customerAccountService;
    private Customer customer;

    private List<CustomerAccount> customerAccountList;

    public CustomerAccountForm() {

        initComponents();
        setSize(JMKHome.getPanelHome().getSize());
        setLocationRelativeTo(JMKHome.getPanelHome());
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Account");
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 29, 29));
        jLabel2.setText("Customer Account");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("From");

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(76, 76, 76),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(76, 76, 76),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(76, 76, 76),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 15),
                new java.awt.Color(76, 76, 76),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));

jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
jLabel4.setForeground(new java.awt.Color(255, 0, 0));
jLabel4.setText("To");

jButton5.setText("Search");

jSeparator1.setBackground(new java.awt.Color(254, 254, 254));

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jSeparator1)
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(149, 149, 149)
        .addComponent(jLabel3)
        .addGap(2, 2, 2)
        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(2, 2, 2)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(51, 51, 51))
    );

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Date", "ProductAmount", "SecMoney", "Coolie", "Gross Amount", "Debit", "Credit", "Transaction Type", "Current Balance", "Description"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable1.setFillsViewportHeight(true);
    jTable1.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(jTable1);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
        jTable1.getColumnModel().getColumn(8).setResizable(false);
    }

    jLabel5.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 0, 0));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account-balance.png"))); // NOI18N
    jLabel5.setText("Account Statement");
    jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
    jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel5MouseClicked(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 0, 0));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/012-draw.png"))); // NOI18N
    jLabel7.setText("Edit");
    jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
    jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

    jLabel9.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 0, 0));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_red.png"))); // NOI18N
    jLabel9.setText("Close");
    jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
    jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel9MouseClicked(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 0, 0));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/009-printer.png"))); // NOI18N
    jLabel10.setText("Print All");
    jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
    jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel10MouseClicked(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(4, 4, 4)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addGap(0, 0, 0))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (customer != null) {
            jLabel2.setText(customer.getName() + "    -   " + customer.getUser().getAddress());

            System.out.println(this.getClass() + ":" + customer);
            customerAccountList = customerAccountService.getAllTransaction(customer.getCustomerId());

            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);
            if (customerAccountList != null) {
                customerAccountList.stream().forEach((customerAccount) -> {
                    defaultTableModel.addRow(new Object[]{
                        customerAccount.getDate(),
                        customerAccount.getProductAmount(),
                        customerAccount.getSecurityMoney(),
                        customerAccount.getCoolieAmount(),
                        (customerAccount.getProductAmount() + customerAccount.getSecurityMoney() + customerAccount.getCoolieAmount()), customerAccount.getDebitAmount(),
                        customerAccount.getCreditAmount(),
                        customerAccount.getTransactionType(), customerAccount.getCurrentBalance(),
                        customerAccount.getDescription()});
                });
            } else {
                JOptionPane.showMessageDialog(rootPane, "Account details not found");
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        int index = jTable1.getSelectedRow();
        if (index != -1) {

            CustomerAccount account = customerAccountList.get(index);
            System.out.println(account);

            String transactionType = account.getTransactionType();
            if (TransactionType.TRANSACTION_TYPE_PURCHASE.equalsIgnoreCase(transactionType)) {
                long transactionId = account.getTransactionId();

            } else {
                JOptionPane.showMessageDialog(rootPane, "There is no bill to show on selected row,please select a valid row", "Empty Bill", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        try {
            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(customerAccountList, false);

            Map parameters = new HashMap();

            JasperDesign jasperDesign = JRXmlLoader.load(getClass().getResourceAsStream("/jasper/customer_account.jrxml"));

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    jasperReport, parameters, beanCollectionDataSource);

            JRViewer jRViewer = new JRViewer(jasperPrint);
            PrintDialogUtil pdu = new PrintDialogUtil(this, true, jRViewer);

        } catch (JRException ex) {
            Logger.getLogger(CustomerAccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
