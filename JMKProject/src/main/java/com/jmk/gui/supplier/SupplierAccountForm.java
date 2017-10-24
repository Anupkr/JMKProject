package com.jmk.gui.supplier;

import com.jmk.Test;
import com.jmk.beans.Supplier;
import com.jmk.beans.SupplierAccount;
import com.jmk.gui.util.GUIUtils;
import com.jmk.service.SupplierAccountService;
import com.jmk.util.AmmountFormater;
import com.jmk.util.ArrivalType;
import com.jmk.util.PrintDialogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
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
public class SupplierAccountForm extends javax.swing.JDialog {

    @Autowired

    private SupplierAccountService supplierAccountService;
    private Supplier supplier;

    private List<SupplierAccount> supplierAccountList;

    public SupplierAccountForm() {

        initComponents();

    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    private void addIntoTable() {
        if (supplier != null) {
            jLabel1.setText(supplier.getName() + "    -   " + supplier.getAddress1());

            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);
            if (supplierAccountList != null) {
                supplierAccountList.stream().forEach(new Consumer<SupplierAccount>() {
                    @Override
                    public void accept(SupplierAccount supplierAccount) {

                        if (ArrivalType.ARRIVAL_TYPE_PARTY_STOCK.equalsIgnoreCase(supplier.getArrivalType())) {
                            defaultTableModel.addRow(new Object[]{
                                supplierAccount.getId(),
                                supplierAccount.getDate(),
                                AmmountFormater.formateDoubleToString(supplierAccount.getPurchaseAmount()),
                                AmmountFormater.formateDoubleToString(supplierAccount.getSaleAmount()),
                                AmmountFormater.formateDoubleToString(supplierAccount.getPaidAmount()),
                                "N/A",
                                supplierAccount.getParticular(),
                                AmmountFormater.formateDoubleToString(supplierAccount.getCurrentBalance())
                            });
                        } else {
                            defaultTableModel.addRow(new Object[]{
                                supplierAccount.getId(),
                                supplierAccount.getDate(),
                                AmmountFormater.formateDoubleToString(supplierAccount.getPurchaseAmount()),
                                AmmountFormater.formateDoubleToString(supplierAccount.getSaleAmount()),
                                AmmountFormater.formateDoubleToString(supplierAccount.getPaidAmount()),
                                AmmountFormater.formateDoubleToString(supplierAccount.getSaleAmount() - supplierAccount.getPurchaseAmount()),
                                supplierAccount.getParticular(),
                                AmmountFormater.formateDoubleToString(supplierAccount.getCurrentBalance())
                            });
                        }
                    }

                });
            } else {
                JOptionPane.showMessageDialog(rootPane, "Account details not found");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Account");
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("From");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 88, 12, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

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
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.ipadx = 133;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
    jPanel1.add(dateChooserCombo1, gridBagConstraints);

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
gridBagConstraints = new java.awt.GridBagConstraints();
gridBagConstraints.gridx = 3;
gridBagConstraints.gridy = 2;
gridBagConstraints.ipadx = 135;
gridBagConstraints.ipady = 7;
gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
jPanel1.add(dateChooserCombo2, gridBagConstraints);

jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
jLabel4.setForeground(new java.awt.Color(255, 0, 0));
jLabel4.setText("To");
gridBagConstraints = new java.awt.GridBagConstraints();
gridBagConstraints.gridx = 2;
gridBagConstraints.gridy = 2;
gridBagConstraints.ipady = 17;
gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
jPanel1.add(jLabel4, gridBagConstraints);

jButton5.setText("Search");
jButton5.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
    }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.ipadx = 41;
    gridBagConstraints.ipady = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 6, 12, 0);
    jPanel1.add(jButton5, gridBagConstraints);

    jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.ipadx = 797;
    gridBagConstraints.ipady = -1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    jPanel1.add(jSeparator1, gridBagConstraints);

    jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(221, 1, 1));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Supplier Account");
    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 248, 248)));
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.ipadx = 449;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
    jPanel1.add(jLabel1, gridBagConstraints);

    jButton7.setText("Show All");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.ipadx = 30;
    gridBagConstraints.ipady = 6;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 6, 12, 0);
    jPanel1.add(jButton7, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 383;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    getContentPane().add(jPanel1, gridBagConstraints);

    jPanel2.setBackground(new java.awt.Color(254, 254, 254));
    jPanel2.setLayout(new java.awt.GridBagLayout());

    jButton1.setText("Print");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 38;
    gridBagConstraints.ipady = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 385, 12, 0);
    jPanel2.add(jButton1, gridBagConstraints);

    jButton2.setText("Edit");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 44;
    gridBagConstraints.ipady = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 6, 12, 0);
    jPanel2.add(jButton2, gridBagConstraints);

    jButton4.setText("Delete");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 24;
    gridBagConstraints.ipady = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 0);
    jPanel2.add(jButton4, gridBagConstraints);

    jButton6.setText("Close");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 32;
    gridBagConstraints.ipady = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(12, 6, 12, 362);
    jPanel2.add(jButton6, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.ipadx = 81;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    getContentPane().add(jPanel2, gridBagConstraints);

    jTable1.setBorder(null);
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "TID", "Date", "PurchaseAmount", "SaleAmount", "PaidAmount", "Profit/Loss", "Particular", "Balance"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false
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

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 1165;
    gridBagConstraints.ipady = 253;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    getContentPane().add(jScrollPane1, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread() {
            @Override
            public void run() {
                jButton7ActionPerformed(null);
                addIntoTable();
            }
        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(supplierAccountList, false);

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("supplierName", supplier.getName() + " : " + supplier.getAddress1());

            JasperDesign jasperDesign = null;
            if (ArrivalType.ARRIVAL_TYPE_SELF_PURCHASE.equalsIgnoreCase(supplier.getArrivalType())) {
                jasperDesign = JRXmlLoader.load(getClass().getResourceAsStream("/jasper/supplier_account_self_purchase.jrxml"));

            } else {
                jasperDesign = JRXmlLoader.load(getClass().getResourceAsStream("/jasper/supplier_account_party_stock.jrxml"));

            }

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    jasperReport, parameters, beanCollectionDataSource);

            JRViewer jRViewer = new JRViewer(jasperPrint);
            PrintDialogUtil pdu = new PrintDialogUtil(this, true, jRViewer);

        } catch (JRException ex) {
            Logger.getLogger(SupplierAccountForm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        supplierAccountList = supplierAccountService.getAllTransaction(supplier.getId(), dateChooserCombo1.getSelectedDate().getTime(), dateChooserCombo2.getSelectedDate().getTime());
        addIntoTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int tid = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());

            EditSupplierAccountForm form = Test.getBean(EditSupplierAccountForm.class
            );
            form.setTid(tid);
            form.setSupplier(supplier);
            form.setVisible(true);
            jButton7ActionPerformed(evt);

        } else {
            GUIUtils.showErrorMessage(rootPane, "Please select row to edit");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        supplierAccountList = supplierAccountService.getAllTransaction(supplier.getId());
        addIntoTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
