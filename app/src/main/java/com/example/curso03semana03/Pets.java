package com.example.curso03semana03;

public class Pets {
    private String name, rateNumber, description;
    private int photo, rateBone01, rateBone02, rateBone03, rateBone04, rateBone05;

    public Pets(String name, String rateNumber, String description, int photo,
                int rateBone01, int rateBone02, int rateBone03, int rateBone04, int rateBone05) {
        this.name = name;
        this.rateNumber = rateNumber;
        this.description = description;
        this.photo = photo;
        this.rateBone01 = rateBone01;
        this.rateBone02 = rateBone02;
        this.rateBone03 = rateBone03;
        this.rateBone04 = rateBone04;
        this.rateBone05 = rateBone05;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRateNumber() {
        return rateNumber;
    }

    public void setRateNumber(String rateNumber) {
        this.rateNumber = rateNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getRateBone01() {
        return rateBone01;
    }

    public void setRateBone01(int rateBone01) {
        this.rateBone01 = rateBone01;
    }

    public int getRateBone02() {
        return rateBone02;
    }

    public void setRateBone02(int rateBone02) {
        this.rateBone02 = rateBone02;
    }

    public int getRateBone03() {
        return rateBone03;
    }

    public void setRateBone03(int rateBone03) {
        this.rateBone03 = rateBone03;
    }

    public int getRateBone04() {
        return rateBone04;
    }

    public void setRateBone04(int rateBone04) {
        this.rateBone04 = rateBone04;
    }

    public int getRateBone05() {
        return rateBone05;
    }

    public void setRateBone05(int rateBone05) {
        this.rateBone05 = rateBone05;
    }
}
