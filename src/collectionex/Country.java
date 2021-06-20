/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionex;

/**
 *
 * @author Mohamed Ahmed
 */
public class Country {
    private String Country_name;
    private String Country_id;

    public Country(String Country_name, String Country_id) {
        this.Country_name = Country_name;
        this.Country_id = Country_id;
    }

    public void setCountry_name(String Country_name) {
        this.Country_name = Country_name;
    }

    public void setCountry_id(String Country_id) {
        this.Country_id = Country_id;
    }

    public String getCountry_name() {
        return Country_name;
    }

    public String getCountry_id() {
        return Country_id;
    }

    @Override
    public String toString() {
        return "Country{" + "Country_name=" + Country_name + ", Country_id=" + Country_id + '}';
    }
    
}
