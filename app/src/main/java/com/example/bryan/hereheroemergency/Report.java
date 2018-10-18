package com.example.bryan.hereheroemergency;

public class Report {
    private String reportID;
    private String emergency;
    private String title;
    private String location;
    private String description;


    public Report (String reportID,String emergency, String title, String location, String description){
        this.reportID=reportID;
        this.emergency=emergency;
        this.title=title;
        this.location=location;
        this.description=description;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
