/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.CustomerController;
import controller.ItemController;
import controller.OrderController;
import dto.CustomerDto;
import dto.ItemDto;
import dto.OrderDetailDto;
import dto.OrderDto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinod
 */
public class OrderFormPannel extends javax.swing.JPanel {
    private CustomerController custController=new CustomerController();
    private ItemController itemController=new ItemController();
    private ArrayList<OrderDetailDto> orderDetailDtos= new ArrayList<OrderDetailDto>();
    private OrderController orderController = new OrderController();
    /**
     * Creates new form OrderFormPannel
     */
    public OrderFormPannel() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        OrderIdLab = new javax.swing.JLabel();
        CustomerIdLab = new javax.swing.JLabel();
        ItemCodeLab = new javax.swing.JLabel();
        QTYLab = new javax.swing.JLabel();
        OrderIdText = new javax.swing.JTextField();
        IDSearchButton = new javax.swing.JButton();
        ITemSearchButtton = new javax.swing.JButton();
        CustomerIdText = new javax.swing.JTextField();
        ItemCodeText = new javax.swing.JTextField();
        DiscountText = new javax.swing.JTextField();
        ItemCodeSearchLab = new javax.swing.JLabel();
        CustomerIdSearchLab = new javax.swing.JLabel();
        DiscountLab = new javax.swing.JLabel();
        QTYText = new javax.swing.JTextField();
        PlaceOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        AddtoCartButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Form");

        OrderIdLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrderIdLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        OrderIdLab.setText("Order Id");

        CustomerIdLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerIdLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerIdLab.setText("Customer Id");

        ItemCodeLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemCodeLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ItemCodeLab.setText("Item Code");

        QTYLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QTYLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QTYLab.setText("QTY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderIdLab)
                    .addComponent(CustomerIdLab)
                    .addComponent(ItemCodeLab)
                    .addComponent(QTYLab))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(OrderIdLab)
                .addGap(12, 12, 12)
                .addComponent(CustomerIdLab)
                .addGap(18, 18, 18)
                .addComponent(ItemCodeLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(QTYLab)
                .addGap(17, 17, 17))
        );

        OrderIdText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OrderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdTextActionPerformed(evt);
            }
        });

        IDSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        IDSearchButton.setText("Search");
        IDSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchButtonActionPerformed(evt);
            }
        });

        ITemSearchButtton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ITemSearchButtton.setText("Search");
        ITemSearchButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITemSearchButttonActionPerformed(evt);
            }
        });

        CustomerIdText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CustomerIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdTextActionPerformed(evt);
            }
        });

        ItemCodeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ItemCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCodeTextActionPerformed(evt);
            }
        });

        DiscountText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DiscountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountTextActionPerformed(evt);
            }
        });

        ItemCodeSearchLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CustomerIdSearchLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DiscountLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DiscountLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DiscountLab.setText("Discount");

        QTYText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QTYText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTYTextActionPerformed(evt);
            }
        });

        PlaceOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(OrderTable);

        AddtoCartButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddtoCartButton.setText("Add to Cart");
        AddtoCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(DiscountLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OrderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CustomerIdSearchLab, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ITemSearchButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ItemCodeSearchLab, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))))
                            .addComponent(QTYText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PlaceOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(690, Short.MAX_VALUE)
                    .addComponent(AddtoCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OrderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerIdSearchLab)
                                    .addComponent(IDSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ITemSearchButtton)
                                    .addComponent(ItemCodeSearchLab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiscountLab)
                            .addComponent(QTYText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(PlaceOrderButton)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(AddtoCartButton)
                    .addContainerGap(534, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIdTextActionPerformed

    private void CustomerIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIdTextActionPerformed

    private void ItemCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCodeTextActionPerformed

    private void DiscountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountTextActionPerformed

    private void QTYTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTYTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QTYTextActionPerformed

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
        placeOrder();
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void IDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchButtonActionPerformed
        serchCustomer();
    }//GEN-LAST:event_IDSearchButtonActionPerformed

    private void ITemSearchButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITemSearchButttonActionPerformed
        serchItem();
    }//GEN-LAST:event_ITemSearchButttonActionPerformed

    private void AddtoCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoCartButtonActionPerformed
        addToCart();
    }//GEN-LAST:event_AddtoCartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoCartButton;
    private javax.swing.JLabel CustomerIdLab;
    private javax.swing.JLabel CustomerIdSearchLab;
    private javax.swing.JTextField CustomerIdText;
    private javax.swing.JLabel DiscountLab;
    private javax.swing.JTextField DiscountText;
    private javax.swing.JButton IDSearchButton;
    private javax.swing.JButton ITemSearchButtton;
    private javax.swing.JLabel ItemCodeLab;
    private javax.swing.JLabel ItemCodeSearchLab;
    private javax.swing.JTextField ItemCodeText;
    private javax.swing.JLabel OrderIdLab;
    private javax.swing.JTextField OrderIdText;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JLabel QTYLab;
    private javax.swing.JTextField QTYText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void serchCustomer() {
        String custId=CustomerIdText.getText();
        try{
            CustomerDto customerDto=custController.searchCustomer(custId);
            if(customerDto!=null){
                CustomerIdSearchLab.setText(customerDto.getCustTitle()+"."+customerDto.getCustName());
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }

    public void serchItem() {
        String ItemCode=ItemCodeText.getText();
        try{
            ItemDto itemDto=itemController.searchItem(ItemCode);
            if(itemDto!=null){
                ItemCodeSearchLab.setText(itemDto.getDescription()+"|"+itemDto.getPackSize()+"|"+itemDto.getQoh()+"|"+itemDto.getUnitPrice());
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Item Not Found");
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }

    private void loadTable() {
        String columns[] = {"Item Code", "Discount","Quantitiy"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
//        try {
////            ArrayList<ItemDto> itemDtos = ITEM_CONTROLLER.getAllItems();
////            for (ItemDto itemDto : itemDtos) {
//               Object[] rowData = {ItemCodeText.getText(),QTYText.getText(),DiscountText.getText()};
//                dtm.addRow(rowData);
////           }   
//        } 
        
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
        
        OrderTable.setModel(dtm);
    }

    private void addToCart() {
        try {
            OrderDetailDto dto = new OrderDetailDto();
            dto.setItemCode(ItemCodeText.getText());
            dto.setQuantity(Integer.parseInt(QTYText.getText()));
            dto.setDiscount(Double.parseDouble(DiscountText.getText()));

            orderDetailDtos.add(dto);
            Object [] rowData = {dto.getItemCode(), dto.getDiscount(), dto.getQuantity()};
            DefaultTableModel dtm = (DefaultTableModel) OrderTable.getModel();
            dtm.addRow(rowData);
            clearItem();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearItem() {
        ItemCodeText.setText("");
        DiscountText.setText("");
        QTYText.setText("");
        ItemCodeSearchLab.setText("");
    }

    private void placeOrder() {
        try{
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderId(OrderIdText.getText());
            orderDto.setCustId(CustomerIdText.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            orderDto.setOrderDate(date);
            orderDto.setOrderDetailDtos(orderDetailDtos);

            //System.out.println(orderDto.toString());
            String resp = orderController.placeOrder(orderDto);
            JOptionPane.showMessageDialog(this, resp);
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showConfirmDialog(this, e.getMessage());
        }
    }
}
