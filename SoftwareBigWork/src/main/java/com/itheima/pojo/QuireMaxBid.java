package com.itheima.pojo;

public class QuireMaxBid {

    private int autoID;
    private String location;
    private int year;
    private int maximumBid;

    @Override
    public String toString() {
        return "QuireMaxBid{" +
                "autoID=" + autoID +
                ", location='" + location + '\'' +
                ", year=" + year +
                ", maximumBid=" + maximumBid +
                '}';
    }

    public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaximumBid() {
        return maximumBid;
    }

    public void setMaximumBid(int maximumBid) {
        this.maximumBid = maximumBid;
    }
}
