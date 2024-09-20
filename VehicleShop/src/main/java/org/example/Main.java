package org.example;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new VehicleFactory();
        VehicleStore vehicleStore=new VehicleStore(vehicleFactory);
        vehicleStore.OrderVehicle("BMW");
        vehicleStore.OrderVehicle("Mercedes");
        vehicleStore.OrderVehicle("Hundai");
    }
}