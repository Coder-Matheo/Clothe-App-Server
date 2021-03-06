package com.ClotheAppSpringServer.ClotheAppServer.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String location;
    private String profilePhoto;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imgProfile;
    private int bankAccountNumber;
    private int backAccountPassword;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public byte[] getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(byte[] imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBackAccountPassword() {
        return backAccountPassword;
    }

    public void setBackAccountPassword(int backAccountPassword) {
        this.backAccountPassword = backAccountPassword;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", imgProfile=" + Arrays.toString(imgProfile) +
                ", bankAccountNumber=" + bankAccountNumber +
                ", backAccountPassword=" + backAccountPassword +
                '}';
    }
}
