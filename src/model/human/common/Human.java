package model.human.common;


import model.address.Address;

import java.time.LocalDate;
import java.util.List;

public abstract class Human {
    private String firstName;
    private String lastName;
    private final LocalDate date;
    private String mail;
    private String phoneNumber;
    private List<Address> addresses;

    public Human(String firstName, String lastName, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addresses=" + addresses +
                "}\n";
    }
}