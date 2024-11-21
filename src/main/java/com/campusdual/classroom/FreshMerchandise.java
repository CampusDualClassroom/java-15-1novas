package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expiringDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expiringDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expiringDate = expiringDate;
    }

    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }
    @Override
    public String getSpecificData() {
        return "A localización é: " + this.getLocation() + " e a fecha de caducidade é: " + getFormattedDate(this.getExpirationDate()) ;
    }
    public String getFormattedDate(Date date){
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }
    public Date getExpirationDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }
}
