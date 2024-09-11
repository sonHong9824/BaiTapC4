/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author ASUS
 */
package org.example.baitapc4;

import java.io.Serializable;
import java.time.LocalDate;


public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate date;
    private String hear;
    private String announ;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date = null;
        hear = "";
        announ = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, LocalDate date, String hear, String announ, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.hear = hear;
        this.announ = announ;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHear() {
        return hear;
    }

    public void setHear(String hear) {
        this.hear = hear;
    }

    public String getAnnoun() {
        return announ;
    }

    public void setAnnoun(String announ) {
        this.announ = announ;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}