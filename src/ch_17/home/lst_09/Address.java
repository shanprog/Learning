package ch_17.home.lst_09;

import java.io.Serializable;

public class Address implements Serializable {

    private StringBuilder name;
    private StringBuilder street;
    private StringBuilder city;
    private StringBuilder state;
    private StringBuilder zip;

    public Address(String name, String street, String city, String state, String zip) {
        setName(name);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    public void setName(String name) {
        StringBuilder tmp = new StringBuilder("");

        for (int i = 0; i < 30; i++) {
            if (i < name.length()) {
                tmp.append(name.charAt(i));
            }
            else
                tmp.append(" ");
        }

        this.name = tmp;
    }

    public void setStreet(String street) {
        StringBuilder tmp = new StringBuilder("");

        for (int i = 0; i < 30; i++) {
            if (i < street.length()) {
                tmp.append(street.charAt(i));
            }
            else
                tmp.append(" ");
        }

        this.street = tmp;
    }

    public void setCity(String city) {
        StringBuilder tmp = new StringBuilder("");

        for (int i = 0; i < 18; i++) {
            if (i < city.length()) {
                tmp.append(city.charAt(i));
            }
            else
                tmp.append(" ");
        }

        this.city = tmp;
    }

    public void setState(String state) {
        StringBuilder tmp = new StringBuilder("");

        for (int i = 0; i < 2; i++) {
            if (i < state.length()) {
                tmp.append(state.charAt(i));
            }
            else
                tmp.append(" ");
        }

        this.state = tmp;
    }

    public void setZip(String zip) {
        StringBuilder tmp = new StringBuilder("");

        for (int i = 0; i < 5; i++) {
            if (i < zip.length()) {
                tmp.append(zip.charAt(i));
            }
            else
                tmp.append(" ");
        }

        this.zip = tmp;
    }




    public String getName() {
        return name.toString();
    }

    public String getStreet() {
        return street.toString();
    }

    public String getCity() {
        return city.toString();
    }

    public String getState() {
        return state.toString();
    }

    public String getZip() {
        return zip.toString();
    }
}
