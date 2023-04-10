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
public class OutputInfo implements Serializable {
    private int outputInfoId,itemId,inputInforId,outputId,quantity,customerId;
    private Date outputInfoDate;
    private String ouputInfoStatus;

    public int getOutputInfoId() {
        return outputInfoId;
    }

    public void setOutputInfoId(int outputInfoId) {
        this.outputInfoId = outputInfoId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getInputInforId() {
        return inputInforId;
    }

    public void setInputInforId(int inputInforId) {
        this.inputInforId = inputInforId;
    }

    public int getOutputId() {
        return outputId;
    }

    public void setOutputId(int outputId) {
        this.outputId = outputId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getOutputInfoDate() {
        return outputInfoDate;
    }

    public void setOutputInfoDate(Date outputInfoDate) {
        this.outputInfoDate = outputInfoDate;
    }

    public String getOuputInfoStatus() {
        return ouputInfoStatus;
    }

    public void setOuputInfoStatus(String ouputInfoStatus) {
        this.ouputInfoStatus = ouputInfoStatus;
    }

}
