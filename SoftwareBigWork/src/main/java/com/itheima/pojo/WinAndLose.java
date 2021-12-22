package com.itheima.pojo;

public class WinAndLose {
    private int autoID;
    private String lastName;
    private int bid;
    private int aSMaximumBid;
    private String whoBid;

    @Override
    public String toString() {
        return "WinAndLose{" +
                "autoID=" + autoID +
                ", lastName='" + lastName + '\'' +
                ", bid=" + bid +
                ", maximumBid=" + aSMaximumBid +
                ", whoBid='" + whoBid + '\'' +
                '}';
    }

    public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getaSMaximumBid() {
        return aSMaximumBid;
    }

    public void setaSMaximumBid(int aSMaximumBid) {
        this.aSMaximumBid = aSMaximumBid;
    }

    public String getWhoBid() {
        return whoBid;
    }

    public void setWhoBid(String whoBid) {
        this.whoBid = whoBid;
    }
}
