/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import model.Customer;
import Controller.DAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khact
 */
public class CustomerView extends javax.swing.JFrame {

    private ArrayList<Customer> list;
    DefaultTableModel model;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quản lý khách hàng");
        list = new DAO().getListCustomer();
        model = (DefaultTableModel) CustomerTable.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Email", "Thông tin chi tiết", "Ngày tạo"
        });
        showtableCustomer();
    }

    private void showtableCustomer() {
        for (Customer customer : list) {
            model.addRow(new Object[]{
                i++, customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getCustomerPhone(), customer.getCustomerEmail(), customer.getCustomerMoreInfo(), customer.getCustomerContractDate()
            });

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcusPhone = new javax.swing.JTextField();
        BntAddCus = new javax.swing.JButton();
        btnDeleteCus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        btnUpdateCus = new javax.swing.JButton();
        txtcusId = new javax.swing.JTextField();
        txtcusName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcusAddress = new javax.swing.JTextField();
        txtcusMail = new javax.swing.JTextField();
        txtcusContact = new javax.swing.JTextField();
        txtcusMoreinfo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Địa chỉ khách hàng:");

        BntAddCus.setText("Thêm khách hàng");
        BntAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAddCusActionPerformed(evt);
            }
        });

        btnDeleteCus.setText("Xóa khách hàng");
        btnDeleteCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DANH SÁCH KHÁCH HÀNG");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(CustomerTable);

        btnUpdateCus.setText("Cập nhật khách hàng");
        btnUpdateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCusActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã khách hàng:");

        jLabel5.setText("Tên khách hàng:");

        jLabel6.setText("Số điện thoại:");

        jLabel7.setText("Ngày tạo:");

        jLabel8.setText("Thông tin chi tiết");

        jLabel9.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(214, 214, 214)
                            .addComponent(btnReset))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4))
                            .addGap(267, 267, 267))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcusMoreinfo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcusContact, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(txtcusMail)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(BntAddCus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteCus))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcusName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcusId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcusAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateCus)
                        .addGap(148, 148, 148)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(761, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(270, 270, 270)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtcusId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcusMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcusAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcusContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcusMoreinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BntAddCus)
                    .addComponent(btnDeleteCus))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateCus)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel2)
                    .addContainerGap(432, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BntAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAddCusActionPerformed

        Customer customer = new Customer();

        try {
            customer.setCustomerId(Integer.parseInt(txtcusId.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng chỉ nhận kí tự số và là duy nhất");

        }

        try {
            customer.setCustomerPhone(Integer.parseInt(txtcusPhone.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại khách hàng chỉ nhận kí tự số ");

        }

        try {
            customer.setCustomerContractDate(new SimpleDateFormat("dd/MM/yyyy").parse(txtcusContact.getText()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ngày tạo không hợp lệ ");
        }
        customer.setCustomerAddress(txtcusAddress.getText());
        customer.setCustomerName(txtcusName.getText());
        customer.setCustomerMoreInfo(txtcusMoreinfo.getText());
        customer.setCustomerEmail(txtcusMail.getText());

        if (new DAO().addCustomer(customer)) {
            JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thành công!");
            list.add(customer);
            showResultCustomerView();
//           model.setRowCount(0);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thất bại,vui lòng kiểm tra lại thông tin!");
        }

        

    }//GEN-LAST:event_BntAddCusActionPerformed

    int i = 1;

    public void showResultCustomerView() {
        Customer customer = list.get(list.size() - 1);
        model.addRow(new Object[]{
            i++, customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getCustomerPhone(), customer.getCustomerEmail(), customer.getCustomerMoreInfo(), customer.getCustomerContractDate()
        });
    }
    private void btnDeleteCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCusActionPerformed

        int selectedRow = CustomerTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn khách hàng để xóa");
            return;
        }
        int customerId = (int) model.getValueAt(selectedRow, 1);

        if (new DAO().deleteCustomer(customerId)) {
            JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công");
            list = new DAO().getListCustomer();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Xóa khách hàng không thành công");

        }
    }//GEN-LAST:event_btnDeleteCusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtcusId.setText("");
        txtcusName.setText("");
        txtcusPhone.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCusActionPerformed

    }//GEN-LAST:event_btnUpdateCusActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntAddCus;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton btnDeleteCus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdateCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcusAddress;
    private javax.swing.JTextField txtcusContact;
    private javax.swing.JTextField txtcusId;
    private javax.swing.JTextField txtcusMail;
    private javax.swing.JTextField txtcusMoreinfo;
    private javax.swing.JTextField txtcusName;
    private javax.swing.JTextField txtcusPhone;
    // End of variables declaration//GEN-END:variables

}
