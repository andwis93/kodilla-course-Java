package com.kodilla.matrix.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstName;
    private String lastName;
    private String peselID;

    public LibraryUser(String firstName, String lastName, String peselID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselID = peselID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPeselID()
    {
        return peselID;
    }

    public void setPeselID(String peselID)
    {
        this.peselID = peselID;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        return Objects.equals(getFirstName(), that.getFirstName()) &&
                Objects.equals(getLastName(), that.getLastName()) &&
                Objects.equals(getPeselID(), that.getPeselID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, peselID);
    }
}


