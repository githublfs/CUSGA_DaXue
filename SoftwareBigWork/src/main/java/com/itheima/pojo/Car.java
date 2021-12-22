package com.itheima.pojo;

public class Car {
    private int autoID;
    private String location;
    private int year;
    private String type;
    private int mileage;
    private String vin;

    @Override
    public String toString() {
        return "Car{" +
                "autoID=" + autoID +
                ", location='" + location + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", mileage=" + mileage +
                ", vin='" + vin + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
