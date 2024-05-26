/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author aser
 */
public class EastAsiaCountries extends Country
{
    public String countryTerrain;
    public ArrayList<Country> country=new ArrayList<>();
    public EastAsiaCountries() {
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }
    @Override
    public String toString() {
        return super.toString() + " Terrain:" + countryTerrain ;
    }
    public void showlist()
    {
        for(Country x: country)
        {
            System.out.println(x.toString());
        }
    }
}
