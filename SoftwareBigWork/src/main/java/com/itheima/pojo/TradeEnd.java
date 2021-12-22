package com.itheima.pojo;

public class TradeEnd {
    private int customerID;
    private String lastName;
    private int autoID;
    private int bid;
    private String getBid;

    @Override
    public String toString() {
        return "TradeEnd{" +
                "customerID=" + customerID +
                ", lastName='" + lastName + '\'' +
                ", autoID=" + autoID +
                ", bid=" + bid +
                ", getBid='" + getBid + '\'' +
                '}';
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getGetBid() {
        return getBid;
    }

    public void setGetBid(String getBid) {
        this.getBid = getBid;
    }
}
