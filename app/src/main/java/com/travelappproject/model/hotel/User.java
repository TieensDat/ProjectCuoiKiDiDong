package com.travelappproject.model.hotel;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;

    private String name;
    private String address;
    private String about;
    private String imageURL;
    private String phoneNumber;
    private String token;

    public User(String email, String password, String name, String address, String about, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.about = about;
        this.phoneNumber = phoneNumber;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User(){}

    public User(String name, String address, String about, String imageURL, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.about = about;
        this.imageURL = imageURL;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
