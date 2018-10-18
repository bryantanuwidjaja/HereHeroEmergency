package com.example.bryan.hereheroemergency;

import java.io.Serializable;

public class Panic implements Serializable {

    private String panicID;
    private String name;
    private String date;
    private String address;
    private String bloodtype;
    private int phone;
    private String location;
    private boolean police;
    private boolean medic;


    public Panic(String panicID,String name,String date,String address,String bloodtype, int phone, String location, boolean police,boolean medic)
    {
        this.panicID = panicID;
        this.name = name;
        this.date = date;
        this.address = address;
        this.bloodtype = bloodtype;
        this.phone = phone;
        this.location = location;
        this.police = police;
        this.medic = medic;
    }

    public String getPanicID() {
        return panicID;
    }

    public void setPanicID(String panicID) {
        this.panicID = panicID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPolice() {
        return police;
    }

    public void setPolice(boolean police) {
        this.police = police;
    }

    public boolean isMedic() {
        return medic;
    }

    public void setMedic(boolean medic) {
        this.medic = medic;
    }
}
