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
public class City {
    private int City_id ;
    private String City_name ;
    private String Co_id ;
    private boolean IsCapital ;
    private double City_pop;

    public City(int City_id, String City_name, String Co_id, boolean IsCapital, double City_pop) {
        this.City_id = City_id;
        this.City_name = City_name;
        this.Co_id = Co_id;
        this.IsCapital = IsCapital;
        this.City_pop = City_pop;
    }

    @Override
    public String toString() {
        return "City{" + "City_id=" + City_id + ", City_name=" + City_name + ", Co_id=" + Co_id + ", IsCapital=" + IsCapital + ", City_pop=" + City_pop + '}';
    }
    

    public void setCity_id(int City_id) {
        this.City_id = City_id;
    }

    public void setCity_name(String City_name) {
        this.City_name = City_name;
    }

    public void setCo_id(String Co_id) {
        this.Co_id = Co_id;
    }

    public void setIsCapital(boolean IsCapital) {
        this.IsCapital = IsCapital;
    }

    public void setCity_pop(double City_pop) {
        this.City_pop = City_pop;
    }

    public int getCity_id() {
        return City_id;
    }

    public String getCity_name() {
        return City_name;
    }

    public String getCo_id() {
        return Co_id;
    }

    public boolean isIsCapital() {
        return IsCapital;
    }

    public double getCity_pop() {
        return City_pop;
    }
    
}
