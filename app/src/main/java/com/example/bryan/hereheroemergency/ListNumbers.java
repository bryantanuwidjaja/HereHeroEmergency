package com.example.bryan.hereheroemergency;

public class ListNumbers {
    private String country;
    private String numberPolice;
    private String numberMedical;
    private String numberFire;
    private int drawable;

    public ListNumbers(){

    }

    public ListNumbers (String country,String numberPolice,String numberMedical,String numberFire, int drawable)
    {
        this.country = country;
        this.numberPolice = numberPolice;
        this.numberMedical = numberMedical;
        this.numberFire = numberFire;
        this.drawable = drawable;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getNumberPolice() {
        return numberPolice;
    }

    public void setNumberPolice(String numberPolice) {
        this.numberPolice = numberPolice;
    }

    public String getNumberMedical() {
        return numberMedical;
    }

    public void setNumberMedical(String numberMedical) {
        this.numberMedical = numberMedical;
    }

    public String getNumberFire() {
        return numberFire;
    }

    public void setNumberFire(String numberFire) {
        this.numberFire = numberFire;
    }
}