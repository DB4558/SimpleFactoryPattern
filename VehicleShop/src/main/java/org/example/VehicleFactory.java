package org.example;

public class VehicleFactory {
    Vehicle vehicle=null;
    public Vehicle createVehicle(String type){
        if(type.equals("Mercedes"))
            vehicle=new Mercedes();
        else if(type.equals("BMW"))
            vehicle=new BMW();
        else if(type.equals("Hundai"))
            vehicle=new Hundai();
        else
            vehicle=null;
        return vehicle;
    }
}
