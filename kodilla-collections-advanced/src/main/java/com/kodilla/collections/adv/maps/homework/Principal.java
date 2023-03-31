package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String schoolname;

    public Principal(String firstname, String lastname, String schoolname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolname = schoolname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname) &&
                Objects.equals(lastname, principal.lastname) &&
                Objects.equals(schoolname, principal.schoolname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, schoolname);
    }


    public String getLastname() {
        return lastname;
    }

    public String getFirstName() {
        return firstname;
    }
    public String getSchoolname() {
        return schoolname;
    }
}
