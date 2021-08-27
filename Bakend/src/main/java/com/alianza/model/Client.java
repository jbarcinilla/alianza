/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alianza.model;

/**
 *
 * @author jbarc
 */
public class Client {
    
    private String sharedKey;
    private String businessid;
    private String emails;
    private String phone;
    private String dataadded;

    public String getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDataadded() {
        return dataadded;
    }

    public void setDataadded(String dataadded) {
        this.dataadded = dataadded;
    }

    public Client(String sharedKey, String businessid, String emails, String phone, String dataadded) {
        this.sharedKey = sharedKey;
        this.businessid = businessid;
        this.emails = emails;
        this.phone = phone;
        this.dataadded = dataadded;
    }
    
    
}
