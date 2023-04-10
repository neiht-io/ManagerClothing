/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author khact
 */
public class InputInfo implements Serializable {
    private int inputInfoId,itemId,inputId,quantity;
    private  float inputPrice,outputPrice;
    private String inputInfoStatus;

    public int getInputInfoId() {
        return inputInfoId;
    }

    public void setInputInfoId(int inputInfoId) {
        this.inputInfoId = inputInfoId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getInputPrice() {
        return inputPrice;
    }

    public void setInputPrice(float inputPrice) {
        this.inputPrice = inputPrice;
    }

    public float getOutputPrice() {
        return outputPrice;
    }

    public void setOutputPrice(float outputPrice) {
        this.outputPrice = outputPrice;
    }

    public String getInputInfoStatus() {
        return inputInfoStatus;
    }

    public void setInputInfoStatus(String inputInfoStatus) {
        this.inputInfoStatus = inputInfoStatus;
    }
    
}
