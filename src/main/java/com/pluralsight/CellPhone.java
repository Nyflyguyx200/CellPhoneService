package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model, carrier, phoneNumber, owner;

    //Parameterless constructor with default values
    public CellPhone() {
        this.serialNumber = 0;
        this.model = " ";
        this.carrier = " ";
        this.phoneNumber = " ";
        this.owner = " ";
    }

    //Getter and Setter methods for all data members
    public int getSerialNumber()  {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}


