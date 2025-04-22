package com.example.studentInfo.StudentEntity;
import jakarta.persistence.*;

@Entity
@Table
public class StudentAddress {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String country;
    @Column
    private String state;
    @Column
    private String city;
    @Column
    private String street;
    public StudentAddress(){}
    @Column
    private int zip;

    public StudentAddress(int id, String country, String state, String city, String street, int zip) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
