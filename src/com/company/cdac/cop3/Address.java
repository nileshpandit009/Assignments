package com.company.cdac.cop3;

public class Address {
    private String houseNo;
    private String streetName;
    private String city;
    private String state;
    private String country;

    public Address(String houseNo, String streetName, String city, String state, String country) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return houseNo + "-" +
                streetName + "," +
                city + "," +
                state + "," +
                country;
    }
}
