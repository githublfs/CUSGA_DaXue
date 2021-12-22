package com.itheima.pojo;

import java.sql.Date;

public class Trade {

    private int customerID;
    private int autoID;
    private java.sql.Date date;
    private int bid;

    @Override
    public String toString() {
        return "Trade{" +
                "customerID=" + customerID +
                ", autoID=" + autoID +
                ", date=" + date +
                ", bid=" + bid +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
    }



    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
}
