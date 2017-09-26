/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.gui;

import com.jmk.beans.Container;
import com.jmk.beans.ContainerAccount;
import com.jmk.beans.Customer;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.Item;
import com.jmk.beans.ItemSale;
import com.jmk.beans.User;
import com.jmk.dao.ContainerDAO;
import com.jmk.service.CustomerAccountService;
import com.jmk.service.CustomerService;
import com.jmk.service.ItemService;
import com.jmk.util.TransactionType;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class ProductSaleEntryForm extends javax.swing.JDialog {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerAccountService customerAccountService;

    @Autowired
    private ItemService itemService;
    @Autowired
    private ContainerDAO containerDAO;

    private List<Customer> customerList;
    private List<Item> itemList;

    private List<Container> containerList;
    private final CustomerAccount customerAccount;

    private List<ItemSale> itemSaleList;
    private List<ContainerAccount> containerAccountList;

    public ProductSaleEntryForm() {
        customerAccount = new CustomerAccount();
        itemSaleList = new ArrayList<>();
        containerAccountList = new ArrayList();
        initComponents();

    }

    private void calculate() {
        String weightText = txtWeight.getText().trim();
        String rateText = txtRate.getText().trim();
        String qtyText = txtQty.getText().trim();

        double weight = 0, rate = 0;
        int qty = 0;
        if (weightText.length() > 0) {
            try {
                weight = Double.parseDouble(weightText);
                if (weight <= 0) {
                    lblErrorMessage.setText("Invalid weight value");
                }

            } catch (NumberFormatException ex) {
                lblErrorMessage.setText("Invalid weight value");
                txtWeight.requestFocus();
                return;
            }
        }
        if (rateText.length() > 0) {
            try {
                rate = Double.parseDouble(rateText);
                if (rate <= 0) {
                    lblErrorMessage.setText("Invalid rate value");
                }

            } catch (NumberFormatException ex) {
                lblErrorMessage.setText("Invalid rate value");
                txtRate.requestFocus();
                return;

            }
        }
        if (qtyText.length() > 0) {
            try {
                qty = Integer.parseInt(qtyText);
                if (qty < 0) {
                    lblErrorMessage.setText("Container qty con't be negative");
                }
            } catch (NumberFormatException ex) {
                lblErrorMessage.setText("Invalid container quantity value");
                txtQty.requestFocus();
                return;
            }
        }
        txtAmount.setText(String.valueOf(Math.round(rate * weight)));
        int index = cmbContainer.getSelectedIndex();
        if (index != -1) {
            Container container = containerList.get(index);
            int secMoney = (int) container.getSecurityMoney();
            txtSecMoney.setText(String.valueOf(secMoney * qty));
        }
        lblErrorMessage.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        cmbItem = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbCustomer = new javax.swing.JComboBox<>();
        cmbContainer = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSecMoney = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCoolie = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtGrossAmount = new javax.swing.JTextField();
        txtTotalItemAmount = new javax.swing.JTextField();
        txtTotalSecurityMoney = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCurrentBalance = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 86, 90));

        jLabel1.setText("Product Sale Entry");

        jLabel2.setText("Select Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Date");

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(76, 76, 76),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(232, 172));

    jLabel4.setForeground(new java.awt.Color(255, 0, 0));
    jLabel4.setText("Weight");

    txtWeight.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txtWeightFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtWeightFocusLost(evt);
        }
    });
    txtWeight.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtWeightActionPerformed(evt);
        }
    });

    jLabel5.setForeground(new java.awt.Color(255, 0, 0));
    jLabel5.setText("Rate");

    txtRate.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtRateFocusLost(evt);
        }
    });
    txtRate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtRateActionPerformed(evt);
        }
    });

    txtAmount.setEditable(false);
    txtAmount.setFocusable(false);

    jLabel6.setForeground(new java.awt.Color(255, 0, 0));
    jLabel6.setText("Amount");

    jLabel7.setForeground(new java.awt.Color(255, 0, 0));
    jLabel7.setText("Container");

    jLabel8.setForeground(new java.awt.Color(255, 0, 0));
    jLabel8.setText("Qty");

    txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtQtyFocusLost(evt);
        }
    });
    txtQty.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtQtyActionPerformed(evt);
        }
    });

    cmbItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbItemActionPerformed(evt);
        }
    });
    cmbItem.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            cmbItemKeyReleased(evt);
        }
    });

    jLabel9.setForeground(new java.awt.Color(255, 0, 0));
    jLabel9.setText("Item");

    cmbCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
    cmbCustomer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbCustomerActionPerformed(evt);
        }
    });

    cmbContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
    cmbContainer.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbContainerItemStateChanged(evt);
        }
    });
    cmbContainer.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            cmbContainerFocusLost(evt);
        }
    });
    cmbContainer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbContainerActionPerformed(evt);
        }
    });
    cmbContainer.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            cmbContainerKeyReleased(evt);
        }
    });

    jLabel10.setForeground(new java.awt.Color(255, 0, 0));
    jLabel10.setText("SecMoney");

    jLabel11.setForeground(new java.awt.Color(255, 0, 0));
    jLabel11.setText("Customer");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Product", "Weight", "Price", "Amount", "Container", "Qty", "Sec/Cont", "SecAmount"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
        };
        boolean[] canEdit = new boolean [] {
            true, true, true, false, true, true, true, true
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(jTable1);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
        jTable1.getColumnModel().getColumn(3).setResizable(false);
    }

    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddActionPerformed(evt);
        }
    });
    btnAdd.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            btnAddKeyReleased(evt);
        }
    });

    jButton2.setText("Clear");

    txtSecMoney.setEditable(false);
    txtSecMoney.setFocusable(false);
    txtSecMoney.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSecMoneyActionPerformed(evt);
        }
    });

    jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    jPanel4.setBackground(new java.awt.Color(255, 0, 0));
    jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 1, 1), 1, true));

    jButton4.setText("Clear");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setText("Sec. Money");

    jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Total Amount");

    txtCoolie.setText("0");
    txtCoolie.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtCoolieActionPerformed(evt);
        }
    });

    txtTotalAmount.setEditable(false);
    txtTotalAmount.setFocusable(false);
    txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalAmountActionPerformed(evt);
        }
    });

    jButton3.setText("Remove Item");

    jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Items Amount");

    jSeparator1.setBackground(new java.awt.Color(254, 252, 251));

    jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Gross Amount");

    jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(254, 254, 254));
    jLabel17.setText("(Amount including current balance)");

    txtGrossAmount.setEditable(false);
    txtGrossAmount.setFocusable(false);
    txtGrossAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtGrossAmountActionPerformed(evt);
        }
    });

    txtTotalItemAmount.setEditable(false);
    txtTotalItemAmount.setFocusable(false);
    txtTotalItemAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalItemAmountActionPerformed(evt);
        }
    });

    txtTotalSecurityMoney.setEditable(false);
    txtTotalSecurityMoney.setFocusable(false);
    txtTotalSecurityMoney.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalSecurityMoneyActionPerformed(evt);
        }
    });

    jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(255, 255, 255));
    jLabel14.setText("Coolie Charge");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel12)
                    .addGap(1, 1, 1)
                    .addComponent(txtTotalItemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel13)
                    .addGap(31, 31, 31)
                    .addComponent(txtTotalSecurityMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel14)
                    .addGap(4, 4, 4)
                    .addComponent(txtCoolie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel15)
                    .addGap(4, 4, 4)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel16)
                    .addGap(12, 12, 12)
                    .addComponent(txtGrossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel17))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jButton3)
                    .addGap(19, 19, 19)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(36, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTotalItemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotalSecurityMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCoolie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))))
            .addGap(6, 6, 6)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtGrossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17))))
            .addGap(6, 6, 6)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addComponent(jLabel9)
                    .addGap(1, 1, 1)
                    .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7))
                    .addGap(1, 1, 1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbContainer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSecMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addComponent(jLabel4)
                    .addGap(26, 26, 26)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtSecMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Customer Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

    jLabel19.setForeground(new java.awt.Color(255, 0, 0));
    jLabel19.setText("Customer Name");

    txtCustomerName.setEditable(false);
    txtCustomerName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    txtCustomerName.setBorder(null);
    txtCustomerName.setFocusable(false);

    jLabel20.setForeground(new java.awt.Color(255, 0, 0));
    jLabel20.setText("Address");

    txtAddress.setEditable(false);
    txtAddress.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    txtAddress.setBorder(null);
    txtAddress.setFocusable(false);

    jLabel21.setForeground(new java.awt.Color(255, 0, 0));
    jLabel21.setText("Mobile");

    txtMobile.setEditable(false);
    txtMobile.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    txtMobile.setBorder(null);
    txtMobile.setFocusable(false);

    jLabel22.setForeground(new java.awt.Color(255, 0, 0));
    jLabel22.setText("Current Balance");

    txtCurrentBalance.setEditable(false);
    txtCurrentBalance.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
    txtCurrentBalance.setBorder(null);
    txtCurrentBalance.setFocusable(false);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22)
                .addComponent(txtCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel5.setBackground(new java.awt.Color(255, 9, 0));

    jButton5.setText("Save");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jButton6.setText("Reset");

    jButton7.setText("Print Bill");

    jRadioButton1.setBackground(new java.awt.Color(255, 0, 0));
    jRadioButton1.setForeground(new java.awt.Color(254, 254, 254));
    jRadioButton1.setText("Auto Print");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jRadioButton1)
            .addContainerGap(79, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1))
            .addGap(83, 83, 83))
    );

    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Last Payment Transaction", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Date", "Credit", "Debit", "DebitMedium", "Description"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            true, false, true, true, true
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable2.setFillsViewportHeight(true);
    jTable2.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(jTable2);

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane2)
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(1, 1, 1))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerActionPerformed

        int index = cmbCustomer.getSelectedIndex();
        if (index != -1) {
            Customer customer = customerList.get(index);
            txtCustomerName.setText(customer.getName());
            User user = customer.getUser();
            txtAddress.setText(user.getAddress());
            txtMobile.setText(user.getMobile1());
            customerAccount.setCustomerId(customer.getCustomerId());

            txtCurrentBalance.setText(customer.getCustomerAccount().getCurrentBalance() + "");
        }
    }//GEN-LAST:event_cmbCustomerActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        calculate();
        btnAdd.requestFocus();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        calculate();
        txtRate.requestFocus();

    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtTotalItemAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalItemAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalItemAmountActionPerformed

    private void txtSecMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecMoneyActionPerformed
        calculate();
    }//GEN-LAST:event_txtSecMoneyActionPerformed

    private void txtTotalSecurityMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSecurityMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalSecurityMoneyActionPerformed

    private void txtCoolieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoolieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoolieActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void txtGrossAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrossAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrossAmountActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                customerList = customerService.getAllCustomer();
                if (customerList != null) {
                    for (Customer customer : customerList) {
                        cmbCustomer.addItem(customer.getName().toUpperCase() + "    :   " + customer.getUser().getAddress().toUpperCase());
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                itemList = itemService.getAllItem();
                for (Item item : itemList) {
                    cmbItem.addItem(item.getItemName());
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                containerList = containerDAO.getAllContainer();
                for (Container container : containerList) {
                    cmbContainer.addItem(container.getName());
                }
            }
        }).start();
        cmbItem.requestFocus();


    }//GEN-LAST:event_formWindowOpened

    private void cmbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemActionPerformed


    }//GEN-LAST:event_cmbItemActionPerformed

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
        calculate();
        cmbContainer.requestFocus();
    }//GEN-LAST:event_txtRateActionPerformed

    private void txtWeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusLost
        // TODO add your handling code here:
        calculate();
        changeFocusLostBackgroundColor(txtWeight);

    }//GEN-LAST:event_txtWeightFocusLost

    private void txtRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRateFocusLost
        // TODO add your handling code here:
        calculate();

    }//GEN-LAST:event_txtRateFocusLost

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        // TODO add your handling code here:
        calculate();

    }//GEN-LAST:event_txtQtyFocusLost

    private void cmbContainerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbContainerFocusLost
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_cmbContainerFocusLost

    private void cmbContainerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbContainerItemStateChanged
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_cmbContainerItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            calculate();
            if (txtWeight.getText().trim().length() < 1) {
                txtWeight.requestFocus();

            } else if (txtRate.getText().trim().length() < 1) {
                txtRate.requestFocus();
            } else if (txtQty.getText().trim().length() < 1) {
                txtQty.requestFocus();
            } else {

                int index = cmbItem.getSelectedIndex();
                if (index != -1) {

                    //get current selecte item
                    Item item = itemList.get(index);

                    //set itemsale information
                    ItemSale itemSale = new ItemSale();
                    itemSale.setItemId(item.getItemId());
                    itemSale.setPrice(Double.parseDouble(txtRate.getText()));
                    itemSale.setWeight(Double.parseDouble(txtWeight.getText()));
                    //

                    itemSaleList.add(itemSale);

                    index = cmbContainer.getSelectedIndex();
                    Container container = containerList.get(index);

                    //create containerAccount and set data
                    ContainerAccount containerAccount = new ContainerAccount();
                    containerAccount.setDebit(0);
                    containerAccount.setCredit(Integer.parseInt(txtQty.getText()));
                    containerAccount.setSecurityMoneyPerQty((int) container.getSecurityMoney());

                    //add into containerAccountList
                    containerAccount.setCustomerId(customerAccount.getCustomerId());
                    containerAccountList.add(containerAccount);

                    DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
                    defaultTableModel.addRow(new Object[]{
                        item.getItemName(),
                        Double.parseDouble(txtWeight.getText()),
                        Double.parseDouble(txtRate.getText()),
                        Double.parseDouble(txtAmount.getText()),
                        container.getName(),
                        txtQty.getText(),
                        container.getSecurityMoney(),
                        txtSecMoney.getText()
                    });

                    double totalItemAmount = 0, totalSecMoney = 0, totalAmount = 0, coolie = 0, grossAmount = 0, currentBalance = 0;
                    int row = defaultTableModel.getRowCount();
                    for (int r = 0; r < row; r++) {
                        totalItemAmount = totalItemAmount + Double.parseDouble(jTable1.getValueAt(r, 3).toString());
                        totalSecMoney = totalSecMoney + Double.parseDouble(jTable1.getValueAt(r, 7).toString());
                    }
                    currentBalance = Double.parseDouble(txtCurrentBalance.getText());

                    if (txtCoolie.getText().trim().length() > 0) {
                        coolie = Double.parseDouble(txtCoolie.getText());
                    } else {
                        coolie = 0;
                    }
                    totalAmount = totalItemAmount + totalSecMoney + coolie;
                    grossAmount = totalAmount + currentBalance;

                    txtTotalItemAmount.setText(String.valueOf(totalItemAmount));
                    txtTotalSecurityMoney.setText(String.valueOf(totalSecMoney));
                    txtTotalAmount.setText(String.valueOf(totalAmount));
                    txtGrossAmount.setText(String.valueOf(grossAmount));

                    txtWeight.setText("");
                    txtRate.setText("");
                    txtAmount.setText("");
                    txtQty.setText("");
                    txtSecMoney.setText("");
                    cmbItem.requestFocus();

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Somthing went wrong please try again!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtWeightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusGained
        // TODO add your handling code here:
        changeFocusGainedBackgroundColor(txtWeight);
    }//GEN-LAST:event_txtWeightFocusGained

    private void cmbItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbItemKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtWeight.requestFocus();
        }
    }//GEN-LAST:event_cmbItemKeyReleased

    private void cmbContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbContainerActionPerformed

    private void cmbContainerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbContainerKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQty.requestFocus();
        }
    }//GEN-LAST:event_cmbContainerKeyReleased

    private void btnAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAddActionPerformed(null);
        }
    }//GEN-LAST:event_btnAddKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "Are you sure?") == JOptionPane.YES_OPTION) {

            try {
                customerAccount.setContainerAccountList(containerAccountList);
                customerAccount.setItemSaleList(itemSaleList);
                customerAccount.setCoolieAmount(Double.parseDouble(txtCoolie.getText()));
                customerAccount.setCreditAmount(Double.parseDouble(txtTotalAmount.getText()));

                customerAccount.setCurrentBalance(Double.parseDouble(txtGrossAmount.getText()));
                Date date = dateChooserCombo1.getSelectedDate().getTime();
                customerAccount.setDate(date);

                customerAccount.setDebitAmount(0);
                customerAccount.setDescription("");
                customerAccount.setProductAmount(Double.parseDouble(txtTotalItemAmount.getText()));
                customerAccount.setSecurityMoney(Double.parseDouble(txtTotalSecurityMoney.getText()));
                customerAccount.setTransactionType(TransactionType.TRANSACTION_TYPE_PURCHASE);

                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Somthing went wrong,please check all value and try again");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void changeFocusGainedBackgroundColor(JComponent component) {
        component.setBackground(Color.cyan);
    }

    private void changeFocusLostBackgroundColor(JComponent component) {
        component.setBackground(Color.white);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cmbContainer;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JComboBox<String> cmbItem;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCoolie;
    private javax.swing.JTextField txtCurrentBalance;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtGrossAmount;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtSecMoney;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalItemAmount;
    private javax.swing.JTextField txtTotalSecurityMoney;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
