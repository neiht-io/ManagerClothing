/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author khact
 */
public class Suplier implements Serializable {
    private int suplierId,suplierPhone;
    private String suplierName,suplierAddress,suplierEmail,suplierMoreInfo;
    private Date suplierContactDate;

    public int getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(int suplierId) {
        this.suplierId = suplierId;
    }

    public int getSuplierPhone() {
        return suplierPhone;
    }

    public void setSuplierPhone(int suplierPhone) {
        this.suplierPhone = suplierPhone;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public void setSuplierName(String suplierName) {
        this.suplierName = suplierName;
    }

    public String getSuplierAddress() {
        return suplierAddress;
    }

    public void setSuplierAddress(String suplierAddress) {
        this.suplierAddress = suplierAddress;
    }

    public String getSuplierEmail() {
        return suplierEmail;
    }

    public void setSuplierEmail(String suplierEmail) {
        this.suplierEmail = suplierEmail;
    }

    public String getSuplierMoreInfo() {
        return suplierMoreInfo;
    }

    public void setSuplierMoreInfo(String suplierMoreInfo) {
        this.suplierMoreInfo = suplierMoreInfo;
    }

    public Date getSuplierContactDate() {
        return suplierContactDate;
    }

    public void setSuplierContactDate(Date suplierContactDate) {
        this.suplierContactDate = suplierContactDate;
    }


}
