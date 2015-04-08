package ch_17.home.lst_09;

import java.io.Serializable;

public class Address implements Serializable {

    private StringBuilder name;
    private StringBuilder street;
    private StringBuilder city;
    private StringBuilder state;
    private StringBuilder zip;

    public Address(String name, String street, String city, String state, String zip) {
        this.name =  new StringBuilder(name);
        this.street = new StringBuilder(street);
        this.city = new StringBuilder(city);
        this.state = new StringBuilder(state);
        this.zip = new StringBuilder(zip);
    }


}
