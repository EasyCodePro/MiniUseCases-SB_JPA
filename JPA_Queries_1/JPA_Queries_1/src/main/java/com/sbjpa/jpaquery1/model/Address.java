package com.sbjpa.jpaquery1.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

//    INSERT INTO sb_jpa.address VALUES (1,'Bengaluru','Karnataka','560004');
//    INSERT INTO sb_jpa.address VALUES (2,'Kolkata','WestBengal','700088');
//    INSERT INTO sb_jpa.address VALUES (3,'Mangaluru','Karnataka','560004');
//    INSERT INTO sb_jpa.address VALUES (4,'Siliguri','WestBengal','800056');
//    INSERT INTO sb_jpa.address VALUES (5,'Howrah','WestBengal','700089');

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer address_id;
    private String city;
    private String state;
    private String zip;

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
