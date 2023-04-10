/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import model.Item;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;
import model.Customer;
import model.Suplier;

/**
 *
 * @author khact
 */
public class DAO {

    private Connection conn;
    PreparedStatement prepStatement = null;
    PreparedStatement prepStatement2 = null;
    Statement statement = null;
    Statement statement2 = null;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=KhoQuanAo;"
                    + "username=sa;password=123456;Encrypt=false");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Connection getConn() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=KhoQuanAo;"
                    + "username=sa;password=123456;Encrypt=false");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean addItem(Item item) {
        String sql = "insert into Item (itemId,itemName,suplierId)"
                + "values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, item.getItemId());
            ps.setString(2, item.getItemName());
            ps.setInt(3, item.getSuplierId());
            //thay đổi dữ liệu dùng update còn đọc thì chỉ cần xxcutequery thui 
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addCustomer(Customer customer) {
        String sql = "insert into Customer (customerId,customername,customerAddress,customerPhone,customerEmail,customerMoreInfo,customerContractDate)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, customer.getCustomerId());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3, customer.getCustomerAddress());
            ps.setInt(4, customer.getCustomerPhone());
            ps.setString(5, customer.getCustomerEmail());
            ps.setString(6, customer.getCustomerMoreInfo());
            ps.setDate(7, new Date(customer.getCustomerContractDate().getTime()));

            //thay đổi dữ liệu dùng update còn đọc thì chỉ cần xxcutequery thui 
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addSuplier(Suplier suplier) {
        String sql = "insert into Suplier (suplierId,supliername,suplierAddress,suplierPhone,suplierEmail,suplierMoreInfo,suplierContractDate)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, suplier.getSuplierId());
            ps.setString(2, suplier.getSuplierName());
            ps.setString(3, suplier.getSuplierAddress());
            ps.setInt(4, suplier.getSuplierPhone());
            ps.setString(5, suplier.getSuplierEmail());
            ps.setString(6, suplier.getSuplierMoreInfo());
            ps.setDate(7, new Date(suplier.getSuplierContactDate().getTime()));

            //thay đổi dữ liệu dùng update còn đọc thì chỉ cần xxcutequery thui 
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteItem(int itemId) {
        String sql = "delete from Item where itemId=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, itemId);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCustomer(int customerId) {
        String sql = "delete from Customer where customerId=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteSuplier(int SuplierId) {
        String sql = "delete from Suplier where suplierId=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, SuplierId);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Item> getListItem() {
        ArrayList<Item> list = new ArrayList<>();
        String sql = "select * from Item";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setItemId(rs.getInt("itemId"));
                item.setItemName(rs.getString("itemName"));
                item.setSuplierId(rs.getInt("suplierId"));
                list.add(item);

            }
        } catch (Exception e) {

        }
        return list;
    }

    public ArrayList<Customer> getListCustomer() {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "select * from Customer";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();

                customer.setCustomerId(rs.getInt("customerId"));
                customer.setCustomerName(rs.getString("customername"));
                customer.setCustomerAddress(rs.getString("customerAddress"));
                customer.setCustomerPhone(rs.getInt("customerPhone"));
                customer.setCustomerEmail(rs.getString("customerEmail"));
                customer.setCustomerMoreInfo(rs.getString("customerMoreInfo"));
                customer.setCustomerContractDate(rs.getDate("customerContractDate"));
                list.add(customer);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public ArrayList<Suplier> getListSuplier() {
        ArrayList<Suplier> list = new ArrayList<>();
        String sql = "select * from Suplier";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Suplier suplier = new Suplier();
                suplier.setSuplierId(rs.getInt("suplierId"));
                suplier.setSuplierName(rs.getString("supliername"));
                suplier.setSuplierAddress(rs.getString("suplierAddress"));
                suplier.setSuplierPhone(rs.getInt("suplierPhone"));
                suplier.setSuplierEmail(rs.getString("suplierEmail"));
                suplier.setSuplierMoreInfo(rs.getString("suplierMoreInfo"));
                suplier.setSuplierContactDate(rs.getDate("suplierContractDate"));
                list.add(suplier);
            }
        } catch (Exception e) {

        }
        return list;
    }
//    public boolean deltetem(Item item){
//    String sql = "insert into Item (itemId,itemName,suplierId)"
//            + "values(?,?,?)";
//    try {
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setInt(1, item.getItemId());
//        ps.setString(2,item.getItemName());
//        ps.setInt(3, item.getSuplierId());
//            //thay đổi dữ liệu dùng update còn đọc thì chỉ cần xxcutequery thui 
//        return ps.executeUpdate()> 0;
//    } catch(Exception e){
//        e.printStackTrace();
//    }
//    return false;
//    }

}
