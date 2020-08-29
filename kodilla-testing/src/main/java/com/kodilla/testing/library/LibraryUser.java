package com.kodilla.testing.library;

import java.awt.*;

public class LibraryUser {

    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;

        LibraryUser that = (LibraryUser) o;

        if (!getFirstname().equals(that.getFirstname())) return false;
        if (!getLastname().equals(that.getLastname())) return false;
        return getPeselId().equals(that.getPeselId());
    }

    @Override
    public int hashCode() {
        int result = getFirstname().hashCode();
        result = 31 * result + getLastname().hashCode();
        result = 31 * result + getPeselId().hashCode();
        return result;
    }
}
