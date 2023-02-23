package com.kodilla.matrix.good.patterns.challenges;

import com.kodilla.matrix.good.patterns.challenges.address.Address;
import com.kodilla.matrix.good.patterns.challenges.payingmethod.PayingMethod;

public class Buyer {

    private String userName;
    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private String phoneNumber;
    private PayingMethod payingOption;


    public Buyer(String userName, String firstName, String lastName, Address address, String email, String phoneNumber,
                 PayingMethod payingOption) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payingOption = payingOption;

    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PayingMethod getPayingOption() {
        return payingOption;
    }


    public String getUserFullName() {

        return firstName + " " + lastName;
    }
}

