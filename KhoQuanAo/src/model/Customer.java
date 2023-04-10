/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author khact
 */
public class Customer implements Serializable {
    private int customerId,customerPhone;
    private String customerName,customerAddress,customerEmail,customerMoreInfo;
    private Date customerContractDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerMoreInfo() {
        return customerMoreInfo;
    }

    public void setCustomerMoreInfo(String customerMoreInfo) {
        this.customerMoreInfo = customerMoreInfo;
    }

    public Date getCustomerContractDate() {
        return customerContractDate;
    }

    public void setCustomerContractDate(Date customerContractDate) {
        this.customerContractDate = customerContractDate;
    }

 
}
