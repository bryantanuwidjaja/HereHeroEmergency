package com.example.bryan.hereheroemergency;

public class ListNumber {
    private String country;
    private String number;
    private int drawable;

    public ListNumber(){

    }

    public ListNumber (String country,String number,int drawable)
    {
        this.country = country;
        this.number = number;
        this.drawable = drawable;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
