/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionex;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed Ahmed
 */
public class ReadFromFile {
    List<City> city ;
    List<Country> country ;
    boolean IsCapital ;
    public List<City> readFileCity(String FilePath){
        this.city = new ArrayList<>();
        File f =new File(FilePath);
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(f.toPath());
        } catch (Exception e) {
            System.out.println("An Erorr Occurred !");
        }
        for(int i = 1 ; i<lines.size();i++){
            String line = lines.get(i);
            String[] cells = line.split(",");
            if(cells[4]== "null"){
                IsCapital = false;
            }else{
                 IsCapital = true;
            }
            int cityID = (int) Double.parseDouble(cells[0]);
            double cityPop = Double.parseDouble(cells[1]);
            city.add(new City(cityID,cells[2],cells[3],IsCapital,cityPop));
        }   
        return city;
    }
    
    public List<Country> ReadFileCountry(String FilePath){
        this.country = new ArrayList<>();
        File f = new File(FilePath);
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(f.toPath());
        } catch (Exception e) {
            System.out.println("An Erorr Occurred !");
        }
        for(int i = 1 ; i<lines.size();i++){
            String line = lines.get(i);
            String[] cells = line.split(",");
            country.add(new Country(cells[0],cells[1]));
        }
        return country ;
    }
    
}
