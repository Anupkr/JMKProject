package com.jmk.gui.supplier;

import com.jmk.MainClass;
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

    private double totalPurchase = 0, totalSale = 0;

    ;
    public SupplierAccountForm() {

        initComponents();

    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    private void addIntoTable() {
        if (supplier != null) {
            jLabel1.setText(supplier.getName() + "    -   " + supplier.getAddress1() + "(" + supplier.getArrivalType() + ")");

            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);

            if (supplierAccountList != null) {

                totalPurchase = 0;
                totalSale = 0;
                supplierAccountList.stream().forEach(new Consumer<SupplierAccount>() {
                    @Override
                    public void accept(SupplierAccount supplierAccount) {

                        totalPurchase = supplierAccount.getPurchaseAmount() + totalPurchase;
                        totalSale = totalSale + supplierAccount.getSaleAmount();
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
                lblProfitLoss.setText(AmmountFormater.formateDoubleToString(totalSale - totalPurchase));
                lblPurchase.setText(AmmountFormater.formateDoubleToString(totalPurchase));
                lblSale.setText(AmmountFormater.formateDoubleToString(totalSale));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Account details not found");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblProfitLoss = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPurchase = new javax.swing.JLabel();
        lblSale = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Account");
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Account");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 248, 248)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 1, true));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("From");

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
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

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));

jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/011-refresh-button.png"))); // NOI18N
jLabel2.setText("Show All");
jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
{
    public void mouseClicked(java.awt.event.MouseEvent evt)
    {
        jLabel2MouseClicked(evt);
    }
    });

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/008-magnifier.png"))); // NOI18N
    jLabel8.setText("Seach");
    jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel8.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseClicked(java.awt.event.MouseEvent evt)
        {
            jLabel8MouseClicked(evt);
        }
    });

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/009-printer.png"))); // NOI18N
    jLabel9.setText("Print");
    jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel9.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseClicked(java.awt.event.MouseEvent evt)
        {
            jLabel9MouseClicked(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/012-draw.png"))); // NOI18N
    jLabel10.setText("Edit");
    jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel10.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseClicked(java.awt.event.MouseEvent evt)
        {
            jLabel10MouseClicked(evt);
        }
    });

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close_red.png"))); // NOI18N
    jLabel11.setText("Close");
    jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel11.addMouseListener(new java.awt.event.MouseAdapter()
    {
        public void mouseClicked(java.awt.event.MouseEvent evt)
        {
            jLabel11MouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel3)
            .addGap(5, 5, 5)
            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jLabel4)
            .addGap(5, 5, 5)
            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(174, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][]
        {

        },
        new String []
        {
            "TID", "Date", "PurchaseAmount", "SaleAmount", "PaidAmount", "Profit/Loss", "Particular", "Balance"
        }
    )
    {
        Class[] types = new Class []
        {
            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean []
        {
            false, false, false, false, false, false, false, false
        };

        public Class getColumnClass(int columnIndex)
        {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex)
        {
            return canEdit [columnIndex];
        }
    });
    jTable1.setFillsViewportHeight(true);
    jTable1.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(jTable1);

    lblProfitLoss.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
    lblProfitLoss.setForeground(new java.awt.Color(251, 0, 0));
    lblProfitLoss.setText("jLabel2");

    jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
    jLabel5.setText("Profit/Loss :");

    jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
    jLabel6.setText("Purchase:");

    lblPurchase.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
    lblPurchase.setForeground(new java.awt.Color(251, 0, 0));
    lblPurchase.setText("jLabel2");

    lblSale.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
    lblSale.setForeground(new java.awt.Color(251, 0, 0));
    lblSale.setText("jLabel2");

    jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
    jLabel7.setText("Sale:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1)
        .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(lblSale, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblProfitLoss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(157, 157, 157))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
            .addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblSale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread() {
            @Override
            public void run() {
                jLabel2MouseClicked(null);
                addIntoTable();
            }
        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        supplierAccountList = supplierAccountService.getAllTransaction(supplier.getId());
        addIntoTable();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        supplierAccountList = supplierAccountService.getAllTransaction(supplier.getId(), dateChooserCombo2.getSelectedDate().getTime(), dateChooserCombo1.getSelectedDate().getTime());
        addIntoTable();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
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
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int tid = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());

            EditSupplierAccountForm form = MainClass.getBean(EditSupplierAccountForm.class
            );
            form.setTid(tid);
            form.setSupplier(supplier);
            form.setVisible(true);
            jLabel2MouseClicked(evt);

        } else {
            GUIUtils.showErrorMessage(rootPane, "Please select row to edit");
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblPurchase;
    private javax.swing.JLabel lblSale;
    // End of variables declaration//GEN-END:variables
}
